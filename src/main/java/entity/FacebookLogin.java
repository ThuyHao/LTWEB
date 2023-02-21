package entity;

public class FacebookLogin {
	private String idFacebookLogin;
	private String name;
	private String email;
	private String numberPhone;
	private Customer customer;
	public FacebookLogin(String idFacebookLogin, String name, String email, String numberPhone, Customer customer) {
		super();
		this.idFacebookLogin = idFacebookLogin;
		this.name = name;
		this.email = email;
		this.numberPhone = numberPhone;
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "FacebookLogin [idFacebookLogin=" + idFacebookLogin + ", name=" + name + ", email=" + email
				+ ", numberPhone=" + numberPhone + ", customer=" + customer + "]";
	}
	public String getIdFacebookLogin() {
		return idFacebookLogin;
	}
	public void setIdFacebookLogin(String idFacebookLogin) {
		this.idFacebookLogin = idFacebookLogin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumberPhone() {
		return numberPhone;
	}
	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}