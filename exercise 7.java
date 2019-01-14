
package exercise 7;


import java.util.*;
public class exercise 7 {

    public static void main(String[] args) {
        Properties School = new Properties();
        Set S_Address;
        String str;
        
        School.put("Cathedral", "piassa");
        School.put("St.Joseph", "Meskel square");
        School.put("Nazreth", "4kilo");
        School.setProperty("St.Joseph", "Behind Exhibition centre");
        
        System.out.println(School.getProperty("Cathedral"));
        System.out.println(School.getProperty("Nazreth"));
        System.out.println(School.getProperty("St.Joseph"));
    }    
}
