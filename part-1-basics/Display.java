
/**
 * Write a description of class Display here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Display
{
    // instance variables - replace the example below with your own
    public String manufacturer;
    public String resolution;
    public String model;
    public int cost;
   

    public Display()
    {
        manufacturer = "Nvidia";
        resolution = "2800 px";
        model = "N80";
        cost = 2000;
    }
    
    public void getDisplay()
    {
        System.out.println(manufacturer);
        System.out.println(resolution);
        System.out.println(model);
        System.out.println(cost);
    }
}
