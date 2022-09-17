package com.online.controller;

import com.online.entity.ShowDAO;
import com.online.request.ShowInfo;
import com.online.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/shows")
public class ShowController {

    @Autowired
    private ShowService showService;

    @PostMapping("/create")
    public ResponseEntity create(@RequestBody ShowInfo showInfo){
        return new ResponseEntity(showService.addShow(showInfo), HttpStatus.CREATED);
    }

    @PostMapping("/update")
    public ResponseEntity<ShowDAO> update(@RequestBody ShowInfo showInfo){
        return ResponseEntity.ok(showService.update(showInfo));
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody ShowInfo showInfo){
        showService.delete(showInfo);
    }
}
