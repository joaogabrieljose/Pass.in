package dev_week.com.pass_in.useCase.eventUseCase;

import java.text.Normalizer;

import org.springframework.stereotype.Service;

import dev_week.com.pass_in.domain.entity.event.Event;
import dev_week.com.pass_in.domain.repository.EventRepository;
import dev_week.com.pass_in.dto.dtoEvent.EventIdDTO;
import dev_week.com.pass_in.dto.dtoEvent.EventeRequestDTO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EventUseCaseCreate {

    private final EventRepository eventRepository;

    public EventIdDTO createEvente(EventeRequestDTO eventRequest){

        Event event = new Event();
        event.setTitle(eventRequest.title());
        event.setDetails(eventRequest.details());
        event.setMaximumAttendees(event.getMaximumAttendees());
        event.setSlug(this.createSlug(eventRequest.title()));
        this.eventRepository.save(event);

        return new EventIdDTO(event.getId());
    }

    //decomposicao canonica 
    private String createSlug(String text){
        String normaliza = Normalizer.normalize(text, Normalizer.Form.NFD);
        return normaliza.replaceAll("[\\p{InCOMBINING_MARKS}]", "")
            .replaceAll("[^\\w\\s]", " ")
            .replaceAll("\\s+", "_")
            .toLowerCase();
    }
    
}
