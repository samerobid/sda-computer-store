
public class Computer
{
    // instance variables - replace the example below with your own
    private Processor processor;
    private HardDisk hardDisk;
    private Display display;

    public Computer()
    {
  
    }
    Processor pro = new Processor();
    HardDisk hd = new HardDisk();
    Display d = new Display();
    
    public void printComputerSummary()
    {
       System.out.println("Processor: " + pro.manufacturer);
       System.out.println("Model: " + pro.model);
       System.out.println("Speed: " + pro.speed);
       System.out.println("Cost: " + pro.cost);
       System.out.println("----------");
       System.out.println("Hard Disk: " + hd.manufacturer);
       System.out.println("Type: " + hd.type);
       System.out.println("Size: " + hd.size);
       System.out.println("Cost: " + hd.cost);
       System.out.println("----------");
       System.out.println("Graphics Card: " + d.manufacturer);
       System.out.println("Model: " + d.model);
       System.out.println("Resolution: " + d.resolution);
       System.out.println("Cost: " + d.cost);
       System.out.println("----------");
       System.out.println("Total: " + (pro.cost+hd.cost+d.cost) + "Kr");
    }
}
