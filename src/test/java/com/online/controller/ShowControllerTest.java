package com.online.controller;


import com.google.gson.Gson;
import com.online.entity.ShowDAO;
import com.online.request.ShowInfo;
import com.online.request.ShowType;
import com.online.request.TicketInfo;
import com.online.service.ShowService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.RequestBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

@ExtendWith(MockitoExtension.class)
public class ShowControllerTest {

    @Mock
    private ShowService showService;

    @InjectMocks
    private ShowController showController;

    MockMvc mockMvc;

    @Mock
    private ShowDAO showDAO;

    @BeforeEach
    void setUp(){
        this.mockMvc= MockMvcBuilders.standaloneSetup(showController).build();
    }

    public ShowInfo getShowInfo() throws ParseException {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2022-09-12");
        TicketInfo ticketInfo = new TicketInfo(101,"Classic",100,95,360.00,"INR");
        return new ShowInfo(1L,201L,301L,null,"English", ShowType.MOVIE, Arrays.asList(ticketInfo));

    }

    @Test
    void create() throws Exception {
      }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}
