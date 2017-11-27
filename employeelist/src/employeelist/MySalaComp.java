package employeelist;

import java.util.Comparator;

public class MySalaComp implements Comparator<employee> {	 

		public int compare(employee e1, employee e2) {
			if(e1.getSalary() > e2.getSalary()){
	            return 1;
	        } else {
	            return -1;
	        }
		}
}