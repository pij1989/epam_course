package com.pozharsky.dmitri.report;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public class SegmentReport {
    private static final String ARGUMENT = "X";
    private static final String RESULT_FUNCTION = "tg(X)";

    public void printResult(Map<Integer, Double> result) {
        Document document = new Document();
        try (FileOutputStream fileOutputStream = new FileOutputStream("result.pdf")) {
            PdfWriter.getInstance(document, fileOutputStream);
            document.open();
            PdfPTable table = new PdfPTable(2);
            table.addCell(ARGUMENT);
            table.addCell(RESULT_FUNCTION);
            for (Map.Entry<Integer, Double> entry : result.entrySet()) {
                table.addCell(String.valueOf(entry.getKey()));
                table.addCell(String.valueOf(entry.getValue()));
            }
            document.add(table);
            document.close();
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
    }
}
