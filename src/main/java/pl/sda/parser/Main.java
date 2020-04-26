package pl.sda.parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        Parser parser = new Parser();
        List<RealEstate> list = new ArrayList<>(parser.readFile());
        Map<String, Integer> countByCity = new HashMap<>(parser.countByCity(list));
        System.out.println(countByCity);
        Map<String, List<RealEstate>> groupByCity = new HashMap<>(parser.groupByCity(list));
        System.out.println(groupByCity);
    }
}
