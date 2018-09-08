package report;

import lombok.NoArgsConstructor;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@NoArgsConstructor
public class IndividualReportGenerator {

    public void createReportDocument() throws IOException {
        XWPFDocument document = new XWPFDocument();

        XWPFParagraph title = document.createParagraph();


        title.setAlignment(ParagraphAlignment.CENTER);

        XWPFRun titleRun = title.createRun();
        titleRun.setText("Rozliczenie zaliczki eksploatacyjnej");
        titleRun.setColor("009933");
        titleRun.setBold(true);
        titleRun.setFontFamily("Courier");
        titleRun.setFontSize(20);

        FileOutputStream out = new FileOutputStream(new File("createdocument.docx"));
        document.write(out);
        out.close();
        document.close();


    }

    //dotyczącej
    //kosztów zarządzania nieruchomością wspólną za rok 2017
}
