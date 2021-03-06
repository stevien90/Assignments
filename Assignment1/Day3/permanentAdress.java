package Day3;

public class permanentAdress {

	private int aid;
	private String streetname;
	private String city;
	private String state;
	private int zipcode;
	
	public permanentAdress(int aid, String streetname, String city, String state, int zipcode) {
		this.aid = aid;
		this.streetname = streetname;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "permanentAdress [aid=" + aid + ", streetname=" + streetname + ", city=" + city + ", state=" + state
				+ ", zipcode=" + zipcode + "]";
	}
	
	
	
}
