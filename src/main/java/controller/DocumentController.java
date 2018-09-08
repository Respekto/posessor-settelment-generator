package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentController {

    @GetMapping("/info")
    public String info() {

        return "Hello in Settlement PDF Report Generator";
    }

    @GetMapping("/individualReport")
    public ResponseEntity generateIndividualReport() {
        return ResponseEntity.ok("Nothing really happen as far...");
    }

}
