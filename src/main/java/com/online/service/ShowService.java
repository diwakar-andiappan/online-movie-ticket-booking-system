package com.online.service;

import com.online.entity.ShowDAO;
import com.online.request.ShowInfo;

public interface ShowService {
     ShowDAO addShow(ShowInfo showInfo);
     ShowDAO update(ShowInfo show);
     void delete(ShowInfo show);
}
