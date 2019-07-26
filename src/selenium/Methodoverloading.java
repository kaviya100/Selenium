package selenium;

public class Methodoverloading {
	
	private void studentdetails() {
	System.out.println("studentdetail is:");

	}
	
	private void studentdetails(int id) {
		System.out.println("student details"+id);
		
		}

	private void studentdetails(int id, int rollno) {
		System.out.println("student details"+id+"\t" +rollno);
		
		}

	private void studentdetails(int year, String name) {
		System.out.println("student details"+year +name);
		
		}

	private void studentdetails(String name, int year) {
		System.out.println("student details"+year+"\t"+name);
	
	}


	public static void main(String[] args) {
		
		Methodoverloading p= new Methodoverloading();
		
		p.studentdetails();
		p.studentdetails(123);
		p.studentdetails(123, 1234);
		p.studentdetails(2019, "karthick");
		p.studentdetails("raja", 2020);
		
		
		
	}
	
	
}
