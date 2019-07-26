package selenium;

public class Methodoverriding {
	
	private void studentdetails() {
		System.out.println("studentdetail is:");

		}
		
		

		public void studentdetails(int id, int rollno) {
			System.out.println("student details"+id+"\t" +rollno);
			
			}

		
	
		public static void main(String[] args) {
			
			Methodoverriding p= new Methodoverriding();
			
			p.studentdetails();
		
			p.studentdetails(1574, 1225);
			
			
		}
		

}
