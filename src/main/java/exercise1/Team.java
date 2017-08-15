package exercise1;
import java.util.HashSet;
import java.util.Set;

public class Team {

	private String name;
	private Set<Employee> employees = new HashSet<Employee>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
}
