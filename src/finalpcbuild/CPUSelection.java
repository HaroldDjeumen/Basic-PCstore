package finalpcbuild;

import java.io.*;
import java.util.*;

public class CPUSelection {
    private int position;
    public int size;
    private String name;
    private String price;
    private double priceItem;
    private String core_count;
    private String core_clock;
    private String boost_clock;
    private String tdp;
    private String graphic;
    private boolean smt;   
    private Scanner fileScanner;
    private Scanner scLine;
    public String[] nameArray;
    public String[] priceArray;
    
    public CPUSelection ()
    {
        
    }
    public CPUSelection (int pos)
    {
        position = pos;
    }

    public String [] CpuReadName ()
    {
        List <String> names = new ArrayList<String>();
        List <String> prices = new ArrayList<String>();
        try {
            fileScanner = new Scanner(new File("cpu.txt"));
            String line = "";
            while (fileScanner.hasNext()) 
            {
                line = fileScanner.nextLine();
                scLine = new Scanner(line).useDelimiter(",");
                name = scLine.next();
                names.add(name);
                price = scLine.next();
                prices.add(price);
                core_count = scLine.next();
                core_clock = scLine.next();
                boost_clock = scLine.next();
                tdp = scLine.next();
                graphic = scLine.next();
                smt = scLine.hasNextBoolean(); 
                scLine.close();
                size ++;
            }          
            fileScanner.close();
        }
        catch (FileNotFoundException exception) 
        {
            System.out.println("File not found");
        }
        
        if (price!= null &&!price.equals("")){
        nameArray = new String[names.size()];
        names.toArray(nameArray);
        priceArray = new String[prices.size()];
        prices.toArray(priceArray);}
        return nameArray;
    }
    
    
    public void setPrice ()
    {
        priceItem = Double.parseDouble (priceArray[position]);
    }
    public double getPrice ()
    {
        return priceItem;
    }
    
       
    
}