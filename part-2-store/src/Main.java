public class Main {
    public static void main(String[] args) {

        ComputerStore awesomeStore = new ComputerStore();

        Computer SuperComputer = new Computer();
        Computer DuperComputer = new Computer();

        awesomeStore.addComputer(SuperComputer);
        awesomeStore.addComputer(DuperComputer);

        SuperComputer.printSummary();
        DuperComputer.printSummary();

        SuperComputer.individualPrice();
        DuperComputer.individualPrice();

        awesomeStore.costOfAllComputers();
    }
}