import java.util.Comparator;

/*Emma Chiusano
 * Date of Creation: 7 October 2021
 * Last Date Edited 15 October 2021
 * HW3*/
public class ComparatorByCode implements Comparator <Country>{//will access country.java
	public int compare(Country code1, Country code2) {//takes in teh countries
		String f1=code1.getCode();//gets area
		String f2=code1.getCode();//gets area
		return f1.compareTo(f2);//comparator
	}
}