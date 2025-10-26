package dev_week.com.pass_in.controllers.eventController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev_week.com.pass_in.dto.dtoEvent.EventResponseDTO;
import dev_week.com.pass_in.useCase.eventUseCase.EventUseCaseGet;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/event")
@RequiredArgsConstructor
public class EventController {

    private final  EventUseCaseGet eventeUseCase;

    @GetMapping("{eventId}")
    public ResponseEntity<EventResponseDTO> getEvent(@PathVariable String eventId){
        EventResponseDTO response = this.eventeUseCase.getEventDetail(eventId);
        return ResponseEntity.ok(response);
    }
   
    
}
