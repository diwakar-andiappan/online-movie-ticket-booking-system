package com.online.service;

import com.online.entity.MoviesDAO;
import com.online.entity.ShowDAO;
import com.online.entity.TheatreDAO;
import com.online.entity.TicketDAO;
import com.online.exception.MovieNotFoundException;
import com.online.exception.ShowNotFoundException;
import com.online.exception.TheatreNotFoundException;
import com.online.repository.MovieRepository;
import com.online.repository.ShowRepository;
import com.online.repository.TheatreRepository;
import com.online.repository.TicketRepository;
import com.online.request.ShowInfo;
import com.online.request.TicketInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ShowServiceImpl implements ShowService{

    @Autowired
    private ShowRepository showRepository;
    @Autowired
    private TicketRepository ticketRepository;
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private TheatreRepository theatreRepository;

    @Transactional
    @Override
    public ShowDAO addShow(ShowInfo showInfo) {
        MoviesDAO movieDetails = movieRepository.findById(showInfo.getMovieId()).orElseThrow(MovieNotFoundException::new);
        TheatreDAO theatreDetails=theatreRepository.findById(showInfo.getTheatreId()).orElseThrow(TheatreNotFoundException::new);
        List<TicketDAO> tickets = (List<TicketDAO>) ticketRepository.saveAll(getTicketsDAOList(showInfo.getTicketInfo()));
        return showRepository.save(new ShowDAO(tickets,movieDetails,theatreDetails,showInfo));
    }

    public List<TicketDAO> getTicketsDAOList(List<TicketInfo> ticketInfo){
        return ticketInfo.stream().map(TicketDAO::new).collect(Collectors.toList());
    }

    @Transactional
    @Override
    public ShowDAO update(ShowInfo show) {
        Optional<ShowDAO> showDAO = showRepository.findById(show.getShowId());
        ShowDAO shows= showDAO.orElse(null);
        if(null != shows){
            shows.setShowTime(show.getShowTime());
            shows.setLanguage(show.getLanguage());
            shows.setTicket(getTicketsDAOList(show.getTicketInfo()));
            shows.setShowType(show.getShowType());
            return showRepository.save(shows);
        }else{
            throw new ShowNotFoundException("Show Not found");
        }


    }

    @Transactional
    @Override
    public void delete(ShowInfo show) {
        List<Long> ids = Optional.ofNullable(show.getTicketInfo()).get().stream().map(TicketInfo::getId).collect(Collectors.toList());
        ticketRepository.deleteAllById(ids);
        showRepository.deleteById(show.getShowId());
    }
}
