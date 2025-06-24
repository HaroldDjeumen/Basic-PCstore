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
 * @author hpie9
 */
public class MSelection {
    private int position;
    private String name;
    private String price;
    private double priceItem;
    private String socket;
    private String form_factor;
    private String max_memory;
    private String memory_slots;
    private String color;   
    private Scanner fileScanner;
    private Scanner scLine;
    public String [] nameArray;
    public String [] priceArray;
    
    public MSelection ()
    {
        
    }
    public MSelection (int pos)
    {
        position = pos;
    }

    public String [] mReadName ()
    {
        List <String> names = new ArrayList<String>();
        List <String> prices = new ArrayList<String>();
        try {
            fileScanner = new Scanner(new File("motherboard.txt"));
            String line = "";
            while (fileScanner.hasNext()) 
            {
                line = fileScanner.nextLine();
                scLine = new Scanner(line).useDelimiter(",");
                name = scLine.next();
                names.add(name);
                price = scLine.next();
                prices.add(price);
                socket = scLine.next();
                form_factor = scLine.next();
                max_memory = scLine.next();
                scLine.close();
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
