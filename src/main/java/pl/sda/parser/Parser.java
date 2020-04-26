package pl.sda.parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Parser {

    private Path file = Paths.get("file.csv");

    public List<RealEstate> readFile() throws IOException {

        byte[] data = Files.readAllBytes(file);
        String convertData = new String(data);
        String[] dataArray = convertData.split("\\r");

        for (String line: dataArray) {
            System.out.println(line);
        }
        return null;
    }

}
