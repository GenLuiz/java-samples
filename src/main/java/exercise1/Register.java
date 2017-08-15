package exercise1;
import java.util.HashSet;
import java.util.Set;

public class Register {

	private static Register instance = new Register();
	
	public static Register getInstance(){
		return instance;
	}
	
	private Set<Employee> employees = new HashSet<Employee>();
	
	public void addEmployee(Employee employee){
		employees.add(employee);
		
		EmailMe.SendMail(employee.getName(),employee.getWiproId());
	}
	
	public void removeEmployee(Employee employee){
		employees.remove(employee);
	}
	
	public Set<Employee> getEmployees(){
		return this.employees;
	}
}
