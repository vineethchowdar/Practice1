package employeelist;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
//import java.util.Comparator;
//import java.util.Iterator;
import java.util.List;

import com.sun.javafx.image.impl.ByteIndexed.Getter;

//import jdk.nashorn.internal.runtime.linker.JavaAdapterFactory;

public class employee {	
	int id;
	int salary;
	String name;
	employee(int i,int s, String n){
		id=i;
		salary=s;
		name=n;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	};

	public static void main(String[] args) {
		
		employee e1=new employee(4,2200,"Hary");
		employee e2=new employee(5,3000,"raj");
		employee e3=new employee(9,9000,"Kumar");
		employee e4=new employee(2,4500,"Jhon");
		employee e5=new employee(1,6200,"Steve");
		employee e6=new employee(3,8000,"Abdul");
		employee e7=new employee(6,3500,"Ashfaq");
		employee e8=new employee(8,6800,"Ravi");
		employee e9=new employee(9,8900,"Rachel");
		employee e10=new employee(10,6100,"Arcana");



List<employee> list = new LinkedList<employee>();
list.add(e1);
list.add(e2);
list.add(e3);
list.add(e4);
list.add(e5);
list.add(e6);
list.add(e7);
list.add(e8);
list.add(e9);
list.add(e10);

Iterator<employee> i = list.iterator();
int maxsalary=0;
int sal = 0;
while(i.hasNext()){
employee e = i.next();
sal = e.salary;
if(sal > maxsalary){
maxsalary= sal;
}
}
System.out.println("maximum salary..."+maxsalary);



//stem.out.println( Collections.max(get.salary(list));

//Iterator det= list.iterator();
//while (det.hasNext()) {
	//employee ep = (employee)det.next();
	//System.out.println(ep.id+ "  " +ep.salary+ "  " +ep.name );
	
for (employee employee: list) {
	System.out.println("id :"+employee.getId()+ "  " +employee.getName()+ "  " +employee.getSalary());
	//System.out.println("name :"+employee.getName());
	//System.out.println("salary :"+employee.getSalary());
	//System.out.println();}

}

//Collections.sort(list,new MySalaComp());
//System.out.println("Sorted list entries: ");
//for(employee e:list){
   // System.out.println(e);
//}
//System.out.println(e1.equals(e2));


	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true; 
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		employee other = (employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
			return false;
		return true;
	}

	public int compare(employee o1, employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}}