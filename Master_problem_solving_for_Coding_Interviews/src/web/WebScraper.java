package web;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WebScraper {

    public static void main(String[] args) {
        String url = "https://www.javatpoint.com/website-static-vs-dynamic";  // Replace with the target website URL
        String outputPath = "D://project//out//output.txt";    // Specify the output file path

        try {
            // Make an HTTP request and get the HTML content
            Document document = Jsoup.connect(url).get();

            // Extract data using CSS selectors
            Elements dataElements = document.select("table");  // Replace with the appropriate CSS selector

            // Write data to a file
            writeDataToFile(dataElements, outputPath);

            System.out.println("Data extraction and writing to file completed.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeDataToFile(Elements dataElements, String outputPath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            for (Element element : dataElements) {
                // Customize this part based on how you want to extract and format the data
                String extractedData = element.text();
                writer.write(extractedData);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
