package first_project_bank_account;

public class Client {

	private String fullName;
	private String dateOfBirth;
	private String address; // Include street, door number and postcode
	private long steuerId;
	private String city;

	public Client(String fullName, String dateOfBirth, String address, String city) {
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.city = city;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public long getSteuerId() {
		return steuerId;
	}

	public void setSteuerId(long steuerId) {
		this.steuerId = steuerId;
	}

	public String toString() {
		return "Client [fullName=" + fullName + ", dateOfBirth=" + dateOfBirth + ", address=" + address + ", steuerId="
				+ steuerId + ", city=" + city + "]";
	}

}
