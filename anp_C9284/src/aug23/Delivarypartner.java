package aug23;

public class Delivarypartner {

	private int partnerId;
	private String partnerName;
	private	int salary;
	public int getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(int partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerName() {
		return partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Delivarypartner(int partnerId, String partnerName, int salary) {
		super();
		this.partnerId = partnerId;
		this.partnerName = partnerName;
		this.salary = salary;
	}
	
	public Delivarypartner() {}
	@Override
	public String toString() {
		return "Delivarypartner [partnerId=" + partnerId + ", partnerName=" + partnerName + ", salary=" + salary + "]";
	};
	
	
	
}
