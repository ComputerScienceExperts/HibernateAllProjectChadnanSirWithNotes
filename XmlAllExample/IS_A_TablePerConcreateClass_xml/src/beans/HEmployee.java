package beans;

public class HEmployee extends Employee {
	private int wh;

	public HEmployee() {

	}

	public HEmployee(int id, String name, String email, int salary, int wh) {
		super(id, name, email, salary);
		this.wh = wh;
	}

	public int getWh() {
		return wh;
	}

	public void setWh(int wh) {
		this.wh = wh;
	}

}
