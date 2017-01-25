public class HardDrive {

    private int cost;
    private int rpm;
    private int capacity;
    private String manufacturer;

    public HardDrive(int cost, int rpm, int capacity, String manufacturer) {
        this.cost = cost;
        this.rpm = rpm;
        this.capacity = capacity;
        this.manufacturer = manufacturer;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


}
