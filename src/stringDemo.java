
public class stringDemo {

	public static void main(String[] args) {
		
		String s1  = "Best Automation Tester @EST";
		String s2 = "Expert Solutions Technologies";
		//or
		
		String s3 = new String("Welcome to the EST family");
		String s4 = new String("Welcome to the ExpertDen family");
		
		String [] splittedString = s1.split("Tester");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());

		for(int i=0; i<s1.length(); i++)
		{
			System.out.println(s1.charAt(i));
		}

	}

}
