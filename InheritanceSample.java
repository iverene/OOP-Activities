public class InheritanceSample {
	public static void main(String[] args) {
		Student student1 = new Student ("Iverene Grace M. Causapin", "Balayan, Batangas", "BSIT", 2);
		System.out.println("Student Name: " + student1.getname());
		System.out.println("Student Address: " + student1.getaddress());
		System.out.println("Student Program: " + student1.getprogram());
		System.out.println("Student Year: " + student1.getyear());
		
		System.out.println(" \n ");
		
		Staff staff1 = new Staff ("Iverene Grace M. Causapin", "Balayan, Batangas", "BSU Balayan", 100000.00);
		System.out.println("Staff Name: " + staff1.getname());
		System.out.println("Staff Address: " + staff1.getaddress());
		System.out.println("Staff School: " + staff1.getschool());
		System.out.println("Staff Salary: " + staff1.getsalary());
	}
}
