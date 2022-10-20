import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lab5Q1 {

	public static void main(String[] args) {

List<Integer> list = new ArrayList<Integer>();

for(int i=0;i<10;i++){
	Random rand = new Random();
	int num = rand.nextInt(50) + 1;
list.add(num);
}

System.out.println(list);
System.out.println("Prompt an integer.");


Scanner scan = new Scanner(System.in);
int in = scan.nextInt();

if(list.contains(in)){
System.out.println("The number is in the list.");
} else {
	System.out.println("The number is not in the list.");
}



scan.close();
}

}

