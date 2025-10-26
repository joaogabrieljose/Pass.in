package dev_week.com.pass_in.controllers.eventController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import dev_week.com.pass_in.dto.dtoEvent.EventIdDTO;
import dev_week.com.pass_in.dto.dtoEvent.EventeRequestDTO;
import dev_week.com.pass_in.useCase.eventUseCase.EventUseCaseCreate;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/event")
@RequiredArgsConstructor
public class EventCreateController {

    private final EventUseCaseCreate eventUseCaseCreate;

    @PostMapping
    public ResponseEntity<EventIdDTO> createEvent(@RequestBody EventeRequestDTO eventeDTO, UriComponentsBuilder uriComponentsBuilder){
        EventIdDTO eventId = this.eventUseCaseCreate.createEvente(eventeDTO);

        var uri = uriComponentsBuilder.path("/events/{id}").buildAndExpand(eventId.eventId()).toUri();
        return ResponseEntity.created(uri).body(eventId);
    }
    
}
