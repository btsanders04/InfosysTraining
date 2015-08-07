import java.io.*;
import java.util.*;

public class HashMapUse {

	public static void main(String[] args) {
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		String filename = (System.getProperty("user.dir") + File.separatorChar + "HashMap.txt");
		myMap.put(10, "ten");
		myMap.put(4, "four");
		try {
			PrintWriter p = new PrintWriter(filename);
			Scanner sc = new Scanner(System.in);
			String enter = "Y";
			while (enter.equalsIgnoreCase("y")) {
				System.out.println("Enter a number:");
				int num = sc.nextInt();
				sc.nextLine();
				if (myMap.containsKey(num)) {
					p.println("You entered " + myMap.get(num) + ".");
				} else
					System.out.println("Number not found.");
				System.out.println("Would you like to try again? Y/N");
				enter = sc.nextLine();
			}
			p.close();
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Can't read input");
		}

	}
}
