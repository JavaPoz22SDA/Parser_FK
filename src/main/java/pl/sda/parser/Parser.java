package pl.sda.parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Parser {

    private Path file = Paths.get("file.csv");

    public List<RealEstate> readFile() throws IOException {

        byte[] data = Files.readAllBytes(file);
        String convertData = new String(data);
        String[] dataArray = convertData.split("\\r");
        List<String> dataList = new ArrayList<>(Arrays.asList(dataArray));
        dataList.remove(0);

        List<RealEstate> realEstates = new ArrayList<>();
        for (String line: dataList){
            String[] array = line.split(",");
            String street = array[0];
            String city = array[1];
            Integer zip = Integer.parseInt(array[2]);
            String state = array[3];
            Integer beds = Integer.parseInt(array[4]);
            Integer baths = Integer.parseInt(array[5]);
            Integer squareFt = Integer.parseInt(array[6]);
            String type = array[7];
            String sale_date = array[8];
            Integer price = Integer.parseInt(array[9]);
            Float latitude = Float.parseFloat(array[10]);
            Float longitude = Float.parseFloat(array[11]);
            realEstates.add(new RealEstate(street,city,zip,state,beds,baths,squareFt,type,sale_date,price,latitude,longitude));
        }
        return realEstates;
    }
    public Map<String, List<RealEstate>> groupByCity(List<RealEstate> realEstates){
        Map<String, List<RealEstate>> map = new HashMap<>();

        for (RealEstate x: realEstates) {
            if (map.containsKey(x.getCity())){
                List<RealEstate> list;
                list = map.get(x.getCity());
                list.add(x);
                map.put(x.getCity(), list);
            }else{
                List<RealEstate> list = new ArrayList<>();
                list.add(x);
                map.put(x.getCity(), list);
            }
        }
        return map;
    }
    public Map<String, Integer> countByCity(List<RealEstate> realEstates){
        Map<String,Integer> map = new HashMap<>();
        for (RealEstate x: realEstates){
            if(map.containsKey(x.getCity())){
                Integer value = map.get(x.getCity());
                value = value +1;
                map.put(x.getCity(),value);
            } else {
                map.put(x.getCity(),1);
            }
        }
        return map;
    }
}
