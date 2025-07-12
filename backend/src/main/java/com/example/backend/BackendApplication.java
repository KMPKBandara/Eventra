package com.example.backend;

import com.example.backend.entity.Event;
import com.example.backend.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Autowired
	private EventRepository eventRepository;

	@Override
	public void run(String... args) throws Exception {
		Event event1 = Event.builder()
				.eventName("Wedding")
				.location("Kandy")
				.email("pramuditha@gmail.com")
				.build();

		Event event2 = Event.builder()
				.eventName("Get Together")
				.location("Peradeniya")
				.email("kavinda@gmail.com")
				.build();

		Event event3 = Event.builder()
				.eventName("Party")
				.location("Colombo")
				.email("bandara@gmail.com")
				.build();

		eventRepository.save(event1);
		eventRepository.save(event2);
		eventRepository.save(event3);
	}
}
