import java.util.*;

public class Arrays {
	public static void main(String[] args) {
	Scanner sc  = new Scanner (System.in);
	System.out.println("Enter size of your array: ");
	int size = sc.nextInt();
	int [] numbers = new int[size];
	
	//for input
	
	 System.out.println("Enter " + size+ " elements:");
	for(int i=0;i<size; i++){
	    numbers[i]=sc.nextInt();
	}
	
	//for output
	
	System.out.println("Your elements of array are: ");
	for(int i = 0; i<size; i++){
	    System.out.println(numbers[i]);
	}
	}
}