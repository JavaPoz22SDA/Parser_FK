package pl.sda.parser;



public class RealEstate {

    private String street;
    private String city;
    private Integer zip;
    private String state;
    private Integer beds;
    private Integer baths;
    private Integer squareFt;
    private String type;
    private String saleDate;
    private Integer price;
    private Float lat;
    private Float lot;

    public RealEstate(String street, String city, Integer zip, String state, Integer beds, Integer baths, Integer squareFt, String type, String saleDate, Integer price, Float lat, Float lot) {
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.state = state;
        this.beds = beds;
        this.baths = baths;
        this.squareFt = squareFt;
        this.type = type;
        this.saleDate = saleDate;
        this.price = price;
        this.lat = lat;
        this.lot = lot;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public Integer getBaths() {
        return baths;
    }

    public void setBaths(Integer baths) {
        this.baths = baths;
    }

    public Integer getSquareFt() {
        return squareFt;
    }

    public void setSquareFt(Integer squareFt) {
        this.squareFt = squareFt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLot() {
        return lot;
    }

    public void setLot(Float lot) {
        this.lot = lot;
    }
}
