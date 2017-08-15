package exercise1;
import java.util.Set;

public class Employee {

	private String name;
	private String wiproId;
	private String clientId;
	private String wiproEmail;
	private User user;
	private Contract contract;
	private Team team;
	private Register register;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWiproId() {
		return wiproId;
	}
	public void setWiproId(String wiproId) {
		this.wiproId = wiproId;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getWiproEmail() {
		return wiproEmail;
	}
	public void setWiproEmail(String wiproEmail) {
		this.wiproEmail = wiproEmail;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Contract getContract() {
		return contract;
	}
	public void setContract(Contract contract) {
		this.contract = contract;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	
	public void registerMe(GlobalCounter c1,Employee emp){
		//TODO: implement me 
		try{
			emp.wiproId = Integer.toString(c1.getNumber());
			c1.increase();
		}catch(Exception e){
			System.out.println("Algo de errado ocorreu");
		}
	}
	
	public Set<Employee> listCollegues(){
		return register.getEmployees();
	}
}
