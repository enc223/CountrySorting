/*Emma Chiusano
 * Date of Creation: 7 October 2021
 * Last Date Edited 14 October 2021
 * HW3*/
import java.util.ArrayList;
import java.util.Comparator;
public class OrderedArrayList<E> {
	//data members
	private ArrayList<E> list;
	private Comparator<E> comparator;
	//constructors
	/*Method to make ordered array list
	 * @param comparator E
	 * @return none*/
	public OrderedArrayList(Comparator<E> c) {
		list=new ArrayList<>();
		comparator=c;
	}
	/*Method to initialize ordered array list
	 * @param comparator E, int cap
	 * @return none*/
	public OrderedArrayList(int cap, Comparator<E> c) {
		list = new ArrayList<>(cap);
		comparator=c;
	}
	/*Method too find
	 * @param item E
	 * @return index found*/
	public E find (E item) {
		return find(item,0);
	}
	/*Method to find with index
	 * @param item E, int index
	 * @return index found*/
	public  E find (E item, int index) {//helper//going to implement
		if(index>=list.size()) {
			return null;
		}
		if (item.equals(list.get(index))) {
			return list.get(index);
		}else {
			return find(item,index+1);
		}
	}
	/*Method to insert a country
	 * @param item e
	 * @return none*/
	public void insert (E item) {
		int i;
		for(i=0; i<list.size(); i++) {
			if(comparator.compare(item, list.get(i))<0) {
			break;
			}
		}
		list.add(i, item);
	}
	/*Method to remove a country
	 * @param item E
	 * @return code*/
	public boolean remove(E item) {
		int i=0;
		for(i=0; i<list.size();i++) {
			if(item.equals(list.get(i))) {
				list.remove(i);
				return true;
			}
		}
		return false;
	}
	/*Method to get the sixe of the aray
	 * @param int size
	 * @return size*/
	public int size(int size) {
		size=list.size();
		return size;
		
	}
	/*Method to check if list is emptyu
	 * @param none
	 * @return true or false*/
	public boolean isEmpty(){
		return list.isEmpty();		
	}
	/*Method toclear
	 * @param none
	 * @return none*/
	public void clear() {
		list.clear();
	}
	/*Method for comparator
	 * @param comparator c
	 * @return none*/
	public void setComparator(Comparator<E> c) {
		comparator=c;
		list.sort(comparator);
	}
	/*Method to format string
	 * @param none
	 * @return string*/
	public String toString() {
		String s="";
		for (int i=0; i<list.size(); i++) {
			s+=list.get(i)+"\n";
		}
		return s;
		
	}
}
