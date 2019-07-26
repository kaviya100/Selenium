package selenium;

public class Methodoverriding1 extends Methodoverriding{
	

	@Override
	public void studentdetails(int id, int rollno) {
		System.out.println("studentdetailis"+id+"\t"+rollno);
	}
		
		
	
	public static void main(String[] args) {
		Methodoverriding1 m=new Methodoverriding1();
		
		m.studentdetails(2145, 1245879);
	}

}
