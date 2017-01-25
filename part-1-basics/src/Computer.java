public class Computer {

    private Processor processor;
    private HardDrive harddrive;
    private Display display;

    // Constructor
    public Computer() {
        processor = new Processor(500,2000,"Xeon","Intel");
        harddrive = new HardDrive(150,0,256,"Intel");
        display = new Display(5000,60,"Asus","3840x2160");
    }

    // Prints the names and cost of peripherals
    public void printComputerSummary() {
        // TODO: Implement method.
    }
}