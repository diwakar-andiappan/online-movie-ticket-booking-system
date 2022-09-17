package com.online.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShowInfo {
    private Long showId;
    private Long theatreId;
    private Long movieId;
    private Date showTime;
    private String language;
    private ShowType showType;
    private List<TicketInfo> ticketInfo;
}
