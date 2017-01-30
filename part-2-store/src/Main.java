public class Main {
    public static void main(String[] args) {

        ComputerStore awesomeStore = new ComputerStore();

        Processor IntelXeon = new Processor(5000, 2600, "Xeon", "Intel");
        Display AsusLED = new Display(5000, 144, "Asus", "2560x1440");
        HardDrive CorsairSSD = new HardDrive(1200, 0, 256, "Corsair");

        Processor Corei7 = new Processor(2000, 4000, "Corei7", "Intel");
        Display DellLED = new Display(3500, 60, "DELL", "3840x2160");
        HardDrive IntelSSD = new HardDrive(1200, 0, 512, "Intel");

        Computer SuperComputer = new Computer(IntelXeon, CorsairSSD, AsusLED);
        Computer DuperComputer = new Computer(Corei7, IntelSSD, DellLED);

        awesomeStore.addComputer(SuperComputer);
        awesomeStore.addComputer(DuperComputer);

        System.out.println("Price of this computer is: " + SuperComputer.getPrice() + "kr");
        System.out.println("Price of this computer is: " + DuperComputer.getPrice() + "kr");

        awesomeStore.getTotalCost();
    }
}