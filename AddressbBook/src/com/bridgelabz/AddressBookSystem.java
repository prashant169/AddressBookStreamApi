package com.bridgelabz;

class Contact {
	private String firstName, lastName, address, city, state, email;
	private int zip;
	private long phoneNumber;

	public Contact(String firstName, String lastName, String address, String city, String state, String email, int zip,
			long phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}

	/*
	 * Used getter and setter to set and get the value. Setter is used to set the
	 * value Getter is used to get the value
	 */
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}

public class AddressBookSystem {
	static void welcome() {
		System.out.println("Welcome to Address Book System Program\n");
	}

	public static void main(String[] args) {
		welcome();
		/*
		 * We are just calling an object using class name. Simply passing the argument
		 * value according to the parameter defined in the constructor.
		 */
		Contact details = new Contact("Prashant", "Phad", "Beed, Ambajogai", "Maharashatra", "Mah", "abc@gmail.com",
				764349, 9970899057L);
		System.out.println("The following contact details is mentioned below : \n");
		System.out.println("First Name : " + details.getFirstName());
		System.out.println("Last Name  : " + details.getLastName());
		System.out.println("Address    : " + details.getAddress());
		System.out.println("City       : " + details.getCity());
		System.out.println("State      : " + details.getState());
		System.out.println("E-mail     : " + details.getEmail());
		System.out.println("Zip Code   : " + details.getZip());
		System.out.println("Phone No   : " + details.getPhoneNumber());
	}
}