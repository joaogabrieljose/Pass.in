package dev_week.com.pass_in.domain.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import dev_week.com.pass_in.domain.entity.event.Event;

public interface EventRepository extends JpaRepository<Event, String> {
    
}
