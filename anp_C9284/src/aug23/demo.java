package aug23;

public class demo {

	public static void main(String[] args) {
		
		Employee empl = new Employee();//object
		
			empl.setEmpId(56);//set method called
			empl.setEmpName("Shivam");
			empl.setAddress("kotra");
		
				System.out.println(empl.getEmpId());//get method called and printed
				System.out.println(empl.getEmpName());
				System.out.println(empl.getAddress());
		
				System.out.println(empl.toString());// toString method called and printed 
	
		Delivarypartner dp = new Delivarypartner();
		
			dp.setPartnerId(578);
			dp.setPartnerName("Shivam");
			dp.setSalary(700000);
				
				System.out.println(dp.getPartnerId());
				System.out.println(dp.getPartnerName());
				System.out.println(dp.getSalary());
				
				System.out.println(dp.toString());
				
			
	}
	
}
