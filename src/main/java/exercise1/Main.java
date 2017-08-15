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
		
		
		Employee emp2 = new Employee();
		User user2 = new User();
		
		user2.setLogin("JAVABOYZ");
		user2.setPassword("2015");
		
		contract.setName("TEAMRBW");
		contract.setUser(user);
		
		emp2.setClientId("2015");
		emp2.setContract(contract);
		emp2.setName("J A V A B O Y S  2 0 1 7");
		emp2.setTeam(team);
		emp2.setUser(user2);
		emp2.setWiproEmail("java.boys@wipro.com");
//		
		emp2.registerMe(count,emp2);
		
		register.addEmployee(emp2);
	}
}
