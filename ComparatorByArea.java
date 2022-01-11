import java.util.Comparator;

/*Emma Chiusano
 * Date of Creation: 7 October 2021
 * Last Date Edited 15 October 2021
 * HW3*/
public class ComparatorByArea implements Comparator <Country>{//will access country.java
	public int compare(Country code1, Country code2) {//takes in teh countries
		double f1=code1.getArea();//gets area
		double f2=code1.getArea();//gets area
		String s1=String.valueOf(f1);  //turns double to string
		String s2=String.valueOf(f2);  //turns double to string
		return s1.compareTo(s2);//comparator
	}
}