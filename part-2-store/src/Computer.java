public class Computer {

    private Processor processor;
    private HardDrive harddrive;
    private Display display;

    // Constructor
    public Computer() {
        processor = new Processor(6500,2000,"Xeon","Intel");
        harddrive = new HardDrive(1500,0,256,"Corsair");
        display = new Display(4000,60,"Asus","3840 x 2160");
    }

    // Prints the names and costs of peripherals
    public void printSummary() {

        // Print Processor Information
        System.out.println("Processor Info:");
        System.out.println("_______________");
        System.out.println("Manufacturer: " + processor.getManufacturer());
        System.out.println("Codename(model): " + processor.getModel());
        System.out.println("Clock Speed: " + processor.getClockspeed() + " MHz");
        System.out.println("Price: " + processor.getCost() + "kr" + "\n\n");

        // Print HardDrive Information
        System.out.println("HardDrive Info:");
        System.out.println("_______________");
        System.out.println("Manufacturer: " + harddrive.getManufacturer());
        System.out.println("RPM: " + harddrive.getRpm() + " (SSD)");
        System.out.println("Capacity: " + harddrive.getCapacity() + "GB");
        System.out.println("Price: "  + harddrive.getCost() + " kr" + "\n\n");

        // Print Display Information
        System.out.println("Display Info:");
        System.out.println("_____________");
        System.out.println("Manufacturer: " + display.getManufacturer());
        System.out.println("Resolution: " + display.getResolution());
        System.out.println("Refresh Rate: " + display.getRefreshRate() + "Hz");
        System.out.println("Price: " + display.getCost() + "kr" + "\n\n\n\n");
    }

    // Returns the cumulative cost of each computer.
    public int individualPrice() {
        return processor.getCost() + harddrive.getCost() + display.getCost();
        }
    }