import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Add_Elements_To_Collection {

	public List<Employee> getEmployeeList() throws Exception {
		Scanner sc = null;
        Employee emp=null;
		// Create The Scanner Obj
		sc = new Scanner(System.in);
		int count = 0;
		List<Employee> al = new ArrayList<>();//Using The Generic's Is The Good practice In The Project Development
		System.out.println("Enter The Employee Count");
		count = sc.nextInt();
		for (int i = 1; i <= count; i++) {
			emp = new Employee();
			System.out.println("Enter The Emp no");
			emp.setEmpno(sc.nextInt());
			System.out.println("Enter The Emp name");
			emp.setEmpname(sc.next());
			System.out.println("Enter The Emp Salary");
			emp.setSalary(sc.nextFloat());
			System.out.println("Enter The Employee experiance");
			emp.setExperiance(sc.nextFloat());

			al.add(emp);
		}
		// Returning The List Ref
		return al;

}//method
}//class