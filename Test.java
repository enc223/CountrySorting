import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*Emma Chiusano
 * Date of Creation: 7 October 2021
 * Last Date Edited 14 October 2021
 * HW3*/
public class Test{
	public static void main(String[]args) {
	OrderedArrayList<Country> countries=new OrderedArrayList<>(250, new ComparatorByCode());
	readCountriesFromFile(countries, "countries.txt");
	
	Scanner keyboard = new Scanner(System.in);
	int operation =0;
	do {
		printMenu();
		operation = Integer.parseInt(keyboard.nextLine());
		switch (operation) {
		case 1://view all
			System.out.println(countries.toString());
			break;
		case 2://search
			System.out.println("Enter a Country:");
			String country=keyboard.nextLine();//if use token base use only token base if use linebase onlyuse linebase
			Country find=new Country("", country, "", 0.0);
			Country countryFind=countries.find(find);
			if(countryFind==null) {
				System.out.println("Country not found.");
			}else {
				System.out.println("Country found: "+countryFind);
			}
			break;
		case 3://remove
			System.out.println("Enter a Country:");
			country=keyboard.nextLine();//if use token base use only token base if use linebase onlyuse linebase
			find=new Country("", country, "", 0.0);
			if(countries.remove(find)) {
				System.out.println("Country removed.");
			}else {
				System.out.println("Country not found.");
			}
			break;
		case 4://sort by area
			countries.setComparator(new ComparatorByArea());
			System.out.println("Countries sorted by Area");
			break;
		case 5://sort by code
			countries.setComparator(new ComparatorByCode());
			System.out.println("Countries sorted by Code");
			break;
		case 6://sort by name
			countries.setComparator(new ComparatorByName());
			System.out.println("Countries sorted by Name");
			break;
		case 7://exit
			System.out.println("Goodbye.");
			break;
		default:
			System.out.println("Invalid operation. Select 1 to 7");
		}
		}while (operation!=7);
	}
	/*Method to print menu
	 * @param none
	 * @return printed menu*/
	public static void printMenu() {
		System.out.println("Select an Operation:");
		System.out.println("1. View a List of Countries:");
		System.out.println("2. Search for a Country:");
		System.out.println("3. Remove a Country:");
		System.out.println("4. Sort the Countries by Code:");
		System.out.println("4. Sort the Countries by Name:");
		System.out.println("6. Sort the Countries by Area:");
		System.out.println("7. Exit:");
	}
	/*Method to get fild into code
	 * @param ordered array list countries string filename
	 * @return countries read into file*/
	public static void readCountriesFromFile(OrderedArrayList<Country> countries, String filename) {
		File file=new File(filename);
		try {
			Scanner readFile=new Scanner(file);
			while(readFile.hasNextLine()) {
				String line=readFile.nextLine();
				String[]tokens=line.split("\\|");
				String code=tokens[0];
				String name=tokens[1];
				String capital=tokens[2];
				double area=Double.parseDouble(tokens[3]);
				Country c=new Country(code, name, capital, area);
				countries.insert(c);
			}
			readFile.close();
		}catch(FileNotFoundException e) {
			System.out.println("File not found.");
			System.exit(0);
		}
	}
}
