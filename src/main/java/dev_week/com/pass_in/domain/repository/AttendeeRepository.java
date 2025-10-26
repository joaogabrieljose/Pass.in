package dev_week.com.pass_in.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import dev_week.com.pass_in.domain.entity.attendees.Attendee;

public interface AttendeeRepository extends JpaRepository<Attendee, String>{

    List<Attendee> findByEventId (String eventId);
    
}
