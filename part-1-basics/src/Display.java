public class Display {

    private int cost;
    private int refreshRate;
    private String manufacturer;
    private String resolution;

    public Display(int cost, int refreshRate, String manufacturer, String resolution) {
        this.cost = cost;
        this.refreshRate = refreshRate;
        this.manufacturer = manufacturer;
        this.resolution = resolution;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}