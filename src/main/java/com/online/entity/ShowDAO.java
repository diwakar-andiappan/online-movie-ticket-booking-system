package com.online.entity;

import com.online.request.ShowInfo;
import com.online.request.ShowType;
import com.online.request.YesOrNo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Show")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShowDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name="movie_id"))
    private MoviesDAO movie;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "theatre_id"))
    private TheatreDAO theatre;

    @OneToMany
    @JoinColumn(foreignKey = @ForeignKey(name = "ticket_id"))
    private List<TicketDAO> ticket;

    @Column(name = "show_time")
    private Date showTime;

    @Column(name = "show_format")
    private String format;

    @Column(name = "show_type")
    private ShowType showType;

    @Column(name = "language")
    private String language;

    public ShowDAO(List<TicketDAO> ticketDAO, MoviesDAO movieDAO, TheatreDAO theatreDAO, ShowInfo showInfo){
        this.movie = movieDAO;
        this.theatre =theatreDAO;
        this.ticket=ticketDAO;
        this.showTime=showInfo.getShowTime();
        this.language=showInfo.getLanguage();
        this.showType=showInfo.getShowType();
        this.id=showInfo.getShowId();
    }

}
