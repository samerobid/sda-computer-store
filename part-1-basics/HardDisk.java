
/**
 * Write a description of class HardDisk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HardDisk
{
    public String manufacturer;
    public String size;
    public String type;
    public int cost;
   

    public HardDisk()
    {
        manufacturer = "WD";
        size = "1 Tera";
        type = "SSD";
        cost = 2200;
    }
    
    public void getHardDisk()
    {
        System.out.println(manufacturer);
        System.out.println(size);
        System.out.println(type);
        System.out.println(cost);
    }
}
