import java.util.*;
public class HashMapUse {

	public static void main(String[] args) {
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		myMap.put(10, "ten");
		myMap.put(4, "four");
		Scanner sc = new Scanner(System.in);
		String enter = "Y";
		while(enter.equalsIgnoreCase("y")){
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		sc.nextLine();
		if(myMap.containsKey(num)){
			System.out.println("You entered " + myMap.get(num) + ".");
		}
		else System.out.println("Number not found.");
		System.out.println("Would you like to try again? Y/N");
		enter = sc.nextLine();
		}
	}

}
