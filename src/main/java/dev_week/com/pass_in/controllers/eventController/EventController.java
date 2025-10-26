package dev_week.com.pass_in.controllers.eventController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev_week.com.pass_in.useCase.eventUseCase.EventUseCaseCreate;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/event")
@RequiredArgsConstructor
public class EventController {

    private final  EventUseCaseCreate eventeUseCase;

    @GetMapping("{eventId}")
    public ResponseEntity<?> getEvent(@PathVariable String eventId){

        this.eventeUseCase.getEventDetail(eventId);
        return ResponseEntity.ok().body("sucesso");
    }
   
    
}
