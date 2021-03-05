package org.example;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestXWPFWordExtractor {

    private static final String FILE_NAME = "/Users/yi-linglo/Desktop/PDFautomation/wordDoc/sample3.docx";
    File file = new File(FILE_NAME);

    @Test
    public void testGetSimpleText() {
        try (
                FileInputStream wordlFile = new FileInputStream(file);
                XWPFDocument document = new XWPFDocument(wordlFile);
                XWPFWordExtractor extractor = new XWPFWordExtractor(document);
        ) {
            String text = extractor.getText();
            System.out.println(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
