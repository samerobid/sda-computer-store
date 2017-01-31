import java.util.ArrayList;
import java.util.Iterator;

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
    public int getTotalCost( ) {
        int total = 0;
        for(Computer computer : computers) {
            total = total + computer.getPrice();
        }
        return total;
    }

    // Returns the most expensive computer Object and prints out its name.
    public Computer findMostExpensiveV1() {
        Computer mostExpensive = computers.get(0);
        for( int i = 0; i < computers.size(); i++){
            if(computers.get(i).getPrice() > mostExpensive.getPrice()) {
                mostExpensive = computers.get(i);
            }
        }
        return mostExpensive;
    }

    // Returns the most expensive computer Object and prints out its name.
    public Computer findMostExpensiveV2(){
        Computer mostExpensive = computers.get(0);
        int i = 1;

        /*
        * While next computer's price is lower, keep current mostExpensive.
        * Otherwise make next one the mostExpensive.
        * and do this until you reach the end of the ArrayList.
        */
        while ( i < computers.size() ){
            if ( computers.get(i).getPrice() > mostExpensive.getPrice() ) {
                mostExpensive = computers.get(i);
            }
            i++;
        }
        return mostExpensive;
    }

    // Returns the most expensive computer Object and prints out its name.
    // My choice is for each, because less code and more understandable.
    public Computer findMostExpensiveV3(){
        Computer mostExpensive = computers.get(0);
        for(Computer computer : computers){
            if(computer.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = computer;
            }
        }
        return mostExpensive;
    }

    // Returns the most expensive computer Object and prints out its name.
    public Computer findMostExpensiveV4(){
        Computer mostExpensive = computers.get(0);
        Iterator<Computer> itr = computers.iterator();

        while(itr.hasNext()){
            Computer computer = itr.next();
            if(computer.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = computer;
            }
        }
        return mostExpensive;
    }

}