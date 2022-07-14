class Participants {
	private static int counter;
	private String registrationId;
	private String name;
	private String branch;
	static {
		counter = 1001;
	}

	public Participants(String name, Long contactNumber, String branch) {
		this.registrationId = "DSE" + (counter++);
		this.name = name;
		this.branch = branch;
	}

	public String getRegistrationId() {
		return registrationId;
	}

	public Integer getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getName() {
		return name;
	}

	public void serName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void display() {
		System.out.println(name + ", Your Registration No =  " + registrationId + " and branch = "+ branch + ".");
	}
}

public class student {
	public static void main(String args[]) {
		Participants p1 = new Participants("Rahul", 1234567889L , "Comp");
		Participants p2 = new Participants("Rushi", 1988612300L , "IT");
		System.out.println(p1.getName() + ", Your Registration No = " + p1.getRegistrationId() + " and branch = " +p1.getBranch()+ ".");
		p2.display();
	}
}
