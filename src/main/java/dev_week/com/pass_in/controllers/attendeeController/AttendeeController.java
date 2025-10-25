package dev_week.com.pass_in.controllers.attendeeController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attendee")
public class AttendeeController {


    
    @GetMapping()
    public ResponseEntity<?> getTeste(){

        return ResponseEntity.ok().body("sucesso");
    }
    
}
