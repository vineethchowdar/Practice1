import java.util.ArrayList;
import java.util.ListIterator;
public class AList {

	public static void main(String[] args) {
		ArrayList<String> a= new ArrayList<String>();
		a.add("SQL");
		a.add("mongo");
		a.add("css");
		a.add("bootstrap");
	ListIterator<String> itr=a.listIterator();
		//while(lang.hasPrevious()){
			//System.out.println(lang.previous());	
			while(itr.hasPrevious()){  
				System.out.println(itr.previous());  
				}  
		}}
 
  