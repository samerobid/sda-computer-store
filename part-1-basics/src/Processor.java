public class Processor {

    private int cost;
    private int clockspeed;
    private String model;
    private String manufacturer;

    public Processor(int cost, int clockspeed, String model, String manufacturer) {
        this.cost = cost;
        this.clockspeed = clockspeed;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getClockspeed() {
        return clockspeed;
    }

    public void setClockspeed(int clockspeed) {
        this.clockspeed = clockspeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}