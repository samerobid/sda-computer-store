public class Main {
    public static void main(String[] args) {

        ComputerStore awesomeStore = new ComputerStore();

        // Creates and fills computer components
        Processor IntelXeon = new Processor(5000, 2600, "Xeon", "Intel");
        Display AsusLED = new Display(5000, 144, "Asus", "2560x1440");
        HardDrive CorsairSSD = new HardDrive(1200, 0, 256, "Corsair");

        // Creates and fills computer components
        Processor Corei7 = new Processor(2000, 4000, "Corei7", "Intel");
        Display DellLED = new Display(3500, 60, "DELL", "3840x2160");
        HardDrive IntelSSD = new HardDrive(1200, 0, 512, "Intel");

        // Creates computers with component objects.
        Computer CasualPC = new Computer(IntelXeon, CorsairSSD, AsusLED, "CasualPC");
        Computer GamingPC = new Computer(Corei7, IntelSSD, DellLED, "GamingPC");

        // Adds computers to the store.
        awesomeStore.addComputer(GamingPC);
        awesomeStore.addComputer(CasualPC);

        // Prints out price of each computer for testing purposes.
        System.out.println("Price of this computer is: " + GamingPC.getPrice() + "kr");
        System.out.println("Price of this computer is: " + CasualPC.getPrice() + "kr");
        System.out.println("Total price of all computers in store: " + awesomeStore.getTotalCost() + "kr");

        // Worth of mostExpensive merchandise in the store, calculated with 3 different methods!
        // System.out.println(awesomeStore.findMostExpensiveV1().getName());
        // System.out.println(awesomeStore.findMostExpensiveV2().getName());
           System.out.println(awesomeStore.findMostExpensiveV3().getName());
        // System.out.println(awesomeStore.findMostExpensiveV4().getName());
    }
}