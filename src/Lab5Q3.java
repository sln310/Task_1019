import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;


public class Lab5Q3 {
    
    public static void main(String[] args){
        
        List<Integer> list = new ArrayList<>();

        Collections.sort(list, Collections.reverseOrder());

        // System.out.println(list);

        List<car> carList = new ArrayList<>();

        carList.add(new car("Jo", "a", 1925));
        carList.add(new car("Al", "b", 1956));
        carList.add(new car("Bo", "c", 2000));

        Collections.sort(carList);

        for(car e : carList){
            System.out.println(e.brand + " : " +e.model + " : " + e.year);
        } 
    }
}

class car implements Comparable<car> {
    String brand;
    String model;
    int year; 

    public car(String brand, String model, int year){
    this.brand = brand;
    this.model = model;
    this.year = year;;
    }

    @Override
    public int compareTo(car o) {
       
        return  this.year - o.year;
    }
    
    
}


