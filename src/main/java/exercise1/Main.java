package exercise1;

public class Main {

	public static void main(String[] args) {
		
		GlobalCounter count;
		Register register;
		count = GlobalCounter.getInstance();
		register = Register.getInstance(); 
		Employee emp = new Employee();
		User user = new User();
		Contract contract = new Contract();
		Team team = new Team();
		
		team.setName("TEAMRBW");
		
		user.setLogin("luizfr");
		user.setPassword("1234");
		
		contract.setName("TEAMRBW");
		contract.setUser(user);
		
		emp.setClientId("1234");
		emp.setContract(contract);
		emp.setName("Luiz Fernando");
		emp.setTeam(team);
		emp.setUser(user);
		emp.setWiproEmail("luiz.barbosa@wipro.com");
//		
		emp.registerMe(count,emp);
		
		register.addEmployee(emp);
	}
}
