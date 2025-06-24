/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalpcbuild;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author harold
 */
public class PSUSelection {
     private int position;
     public  int size;
    private String name;
    private String price;
    private double priceItem;
    private String type;
    private String efficiency;
    private String wattage;
    private String modular;
    private String color;   
    private Scanner fileScanner;
    private Scanner scLine;
    public String [] nameArray;
    public String [] priceArray;
    
    public PSUSelection ()
    {
        
    }
    public PSUSelection (int pos)
    {
        position = pos;
    }

    public String [] PsuReadName ()
    {
        List <String> names = new ArrayList<String>();
        List <String> prices = new ArrayList<String>();
        try {
            fileScanner = new Scanner(new File("power-supply.txt"));
            String line = "";
            while (fileScanner.hasNext()) 
            {
                line = fileScanner.nextLine();
                scLine = new Scanner(line).useDelimiter(",");
                name = scLine.next();
                names.add(name);
                price = scLine.next();
                prices.add(price);
                efficiency = scLine.next();
                wattage = scLine.next();
                modular = scLine.next();
                color = scLine.next();
               
                scLine.close();
                size++;
            }          
            fileScanner.close();
        }
        catch (FileNotFoundException exception) 
        {
            System.out.println("File not found");
        }
        
        if (price != ""){
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


