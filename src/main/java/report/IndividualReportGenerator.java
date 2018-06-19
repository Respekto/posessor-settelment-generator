package report;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import model.IndividualReport;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class IndividualReportGenerator {

    private IndividualReport individualReport;

    public IndividualReportGenerator(IndividualReport individualReport) {

        this.individualReport = individualReport;
    }

    public ByteArrayOutputStream generatePdf() throws DocumentException {


        // IE workaround: write into byte array first.
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        Document document = new Document();
        PdfWriter.getInstance(document, baos);

        document.open();

        document.open();
        Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN, 16, BaseColor.BLACK);
        Chunk chunk = new Chunk("Rozliczenie zaliczki eksploatacyjnej", font);

        document.add(chunk);
        document.close();

        PdfPTable table = new PdfPTable(3);
        //addTableHeader(table);
//        addRows(table);
//        addCustomRows(table);

        document.add(table);
        document.close();

        return baos;
    }

}
