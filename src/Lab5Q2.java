import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Lab5Q2 {

	public static void main(String[] args) {

List<Integer> list1 = new ArrayList<>();

for(int i=0;i<10;i++){
	Random rand = new Random();
	int num = rand.nextInt(50) + 1;
list1.add(num);
}

List<Integer> list2 = new ArrayList<>(list1);
list1.set(9, -5);

System.out.println(list1);
System.out.println(list2);

}
	}

    
    

