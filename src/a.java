package arraylistsort;
import java.util.*;

public class ArrayListDemo {
    
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();

        list.add(34);
        list.add(55);
        list.add(4);
        list.add(11);
        list.add(29);
        list.add(75);

        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("John", 25));
        employeeList.add(new Employee("Alex", 29));
        employeeList.add(new Employee("Bob", 50));

        Collections.sort(employeeList);

        for(Employee e : employeeList){
            System.out.println(e.name + " : " +e.age);
        } 
    }
}

//user-defined type called Employee
class Employee implements Comparable<Employee> {
    String name;
    int age;

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {
        // return this.age - o.age;
        return o.age - this.age;
    }


    
}
