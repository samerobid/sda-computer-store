import java.util.ArrayList;

public class ComputerStore {

    private ArrayList<Computer> computers;
    private int index;

    // Constructor
    public ComputerStore(){
        computers = new ArrayList<>();
    }

    // Adds a Computer into "computers" ArrayList
    public boolean addComputer(Computer newComputer) {
        return computers.add(newComputer);
    }

    // Removes a Computer object from "computers" ArrayList
    public boolean removeComputer(int index) {
        this.index = index;
        computers.remove(index);
        return true;
    }

    // Prints out all the details of each computer in store
    public void printAllComputers( ) {
        for(Computer computer : computers) {
            computer.printSummary();
        }
    }

    // Prints the total cost for all computers
    public void getTotalCost( ) {
        int total = 0;
        for(Computer computer : computers) {
            total = total + computer.getPrice();
        }
        System.out.println("Total price of all computers in store: " + total + "kr");
    }

    public Computer findMostExpensiveV1() {
        Computer mostExpensive = computers.get(0);
        for( int i = 0; i < computers.size(); i++){
            if(computers.get(i).getPrice() > mostExpensive.getPrice()){
                mostExpensive = computers.get(i);
            }
        }
        return mostExpensive;
    }
}