package co.grandcircus.University.entity;

public class Student extends User {
	private String phone;
	private String address;
	
	public Student() {
		super();
	}
	public Student(Long id, String first, String last, String email, String password, String phone, String address ) {
		super(id, first, last, email, password);
		this.phone = phone;
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [phone=" + phone + ", address=" + address + ", getId()=" + getId() + ", getFirst()="
				+ getFirst() + ", getLast()=" + getLast() + ", getEmail()=" + getEmail() + ", getPassword()="
				+ getPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
}
