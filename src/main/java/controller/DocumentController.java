package controller;

import com.itextpdf.text.DocumentException;
import model.IndividualReport;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import report.IndividualReportGenerator;

import javax.validation.Valid;
import java.io.ByteArrayOutputStream;

@RestController
public class DocumentController {

    @GetMapping("/info")
    public String info(){

        return "Hello in Settlement PDF Report Generator";
    }

    @PostMapping("/individualReport")
    public ResponseEntity<ByteArrayOutputStream> generateIndividualReport(@Valid @RequestBody IndividualReport individualReport) throws DocumentException {

        IndividualReportGenerator pdf = new IndividualReportGenerator(individualReport);

        return ResponseEntity.ok().contentType(MediaType.APPLICATION_PDF).body(pdf.generatePdf());
    }

}
