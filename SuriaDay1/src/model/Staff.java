package model;

public class Staff {
	
	private String name;
	private int id;
	private String nickName;
	private double pay;
	public Staff(String name, int id, String nickName, double pay) {
		super();
		this.name = name;
		this.id = id;
		this.nickName = nickName;
		this.pay = pay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return "Staff [name=" + name + ", id=" + id + ", nickName=" + nickName + ", pay=" + pay + "]";
	}
	
	
}
