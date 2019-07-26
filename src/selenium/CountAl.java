package selenium;

public class CountAl {
	public static void main() {
		int count=0;
		String name="welcome to green tech ";
		for (int i = 0; i <name.length(); i++) {
			char c=name.charAt(i);
		
		if(Character.isAlphabetic(c))
		{
			 count ++;
		}}
		System.out.println(count);
	}}

