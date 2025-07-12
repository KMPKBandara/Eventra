package com.example.backend.controller;

import com.example.backend.entity.Event;
import com.example.backend.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:8081/")
public class EventController {
    @Autowired
    private EventRepository eventRepository;

    @GetMapping("/events")
    public List<Event> fetchEvents(){
        return eventRepository.findAll();
    }
}
