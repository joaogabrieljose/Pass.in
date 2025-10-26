package dev_week.com.pass_in.dto.dtoEvent;

import dev_week.com.pass_in.domain.entity.event.Event;

public class EventResponseDTO {

    EventeDetailsDTO eventeDTO;

    public EventResponseDTO(Event event, Integer numberOfAttendees){
        this.eventeDTO = new EventeDetailsDTO(event.getId(), event.getTitle(), event.getDetails(), event.getSlug(), event.getMaximumAttendees(), 
        numberOfAttendees);
    }
    
}
