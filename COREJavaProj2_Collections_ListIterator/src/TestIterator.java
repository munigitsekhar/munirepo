import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class TestIterator {
	public static void main(String[] args) {
		Add_Elements_To_Collection col=null;
		List<Employee> al=null;
		ListIterator<Employee> ir=null;
		//Get The List Obj
		try {
		col=new Add_Elements_To_Collection();
		al=col.getEmployeeList();
		
		//Get The Iterator cursor Obj
		ir=al.listIterator(3);
		while(ir.hasNext()) {
			Employee e=ir.next();
			System.out.println("Employeee Details");
			System.out.println("Eno  "+e.getEmpno());
			System.out.println("Ename   "+e.getEmpname());
			System.out.println("Salary  "+e.getSalary());
			System.out.println("Experience  "+e.getExperiance());
			System.out.println("hiiiiiiiii");
			if(e.getExperiance()>=10) {
			ir.remove();
			System.out.println(e.getEmpname()+"  Is Remover From The Company................Because Management Problem");
			}
		 }
		
	}
    catch(IllegalStateException is) {
    	is.printStackTrace();
    }
    catch(NoSuchElementException nsee) {
	  	nsee.printStackTrace();
   }
	catch(Exception e) {
	  e.printStackTrace();
   }
}//method
}//class
