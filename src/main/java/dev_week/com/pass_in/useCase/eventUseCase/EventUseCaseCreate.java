package dev_week.com.pass_in.useCase.eventUseCase;

import java.util.List;

import org.springframework.stereotype.Service;

import dev_week.com.pass_in.domain.entity.attendees.Attendee;
import dev_week.com.pass_in.domain.entity.event.Event;
import dev_week.com.pass_in.domain.repository.AttendeeRepository;
import dev_week.com.pass_in.domain.repository.EventRepository;
import dev_week.com.pass_in.dto.dtoEvent.EventResponseDTO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EventUseCaseCreate {

    private final EventRepository eventRepository;
    private final AttendeeRepository attendeeRepository;

    public EventResponseDTO getEventDetail(String eventId){

        Event event = eventRepository.findById(eventId).orElseThrow(()->new RuntimeException("event not found id" + eventId));

        List<Attendee> attendeeList = this.attendeeRepository.findByEventId(eventId);

        return new EventResponseDTO(event, attendeeList.size());
    }
}
