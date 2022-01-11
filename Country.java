/*Emma Chiusano
 * Date of Creation: 7 October 2021
 * Last Date Edited 15 October 2021
 * HW3*/
public class Country {
	//data members
	private String code;
	private String name;
	private String capital;
	private double area;
	//constructors
	public Country(String code, String name, String capital, double area) {
		this.code=code;
		this.name=name;
		this.capital=capital;
		this.area=area;
	}
	//getters
	/*Method to get code
	 * @param none
	 * @return code*/
	public String getCode() {
		return code;
	}
	/*Method to get name
	 * @param none
	 * @return name*/
	public String getName() {
		return name;
	}
	/*Method to get capital
	 * @param none
	 * @return capital*/
	public String getCapital() {
		return capital;
	}
	/*Method to get area
	 * @param none
	 * @return area*/
	public double getArea() {
		return area;
	}
	//setters
	/*Method to set code
	 * @param Code c
	 * @return none*/
	public void setCode(String c) {
		code=c;
	}
	/*Method to set name
	 * @param Name n
	 * @return none*/
	public void setName(String n) {
		name=n;
	}
	/*Method to set capital
	 * @param Capital c
	 * @return none*/
	public void setCapital(String c) {
		capital=c;
	}
	/*Method to set area
	 * @param area a
	 * @return none*/
	public void setArea(double a) {
		area=a;
	}
	//return a formatted string with the information about the country
	public String toString() {
		return String.format("%-10s\t%-25s\t%-20s\t%-10.2f",code, name, capital, area);
	}
	//method to override the .equals that returns true if countries have hte same name, false otherwise
	@Override
	public boolean equals (Object o) {
		if (o instanceof Country) {
			Country c=(Country)o;
			return name.equals(c.name);
		}else {
			return false;
		}
	}
}
