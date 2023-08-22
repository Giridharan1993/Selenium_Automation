import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CorejavaBrushUP2 {

	public static void main(String[] args) 
	{

		int [] arr2 = {1,2,4,5,6,7,8,10,122};
		
		for (int i = 0; i<arr2.length; i++)
		{
			if (arr2[i] % 2 == 0)
			{
		System.out.println(arr2[i]);
		//break;
		}
			else
			{
				System.out.println(arr2[i] +"is not multiple of 2");
			}
		}
	
		//Dynamically represent the array
	 	List<String> a = new ArrayList<String>();
	 	a.add("I'm");
	 	a.add("an");
	 	a.add("Automation Tester");
	 	a.add("at Est");
	 	//a.remove(3);
	 	System.out.println(a.get(3));
//	for(int i=0; i<a.size(); i++)
//	{
//		System.out.println(a.get(i));
//	}
	for(String val : a)
	{
		System.out.println(val);
	}
	// Item is present in Arraylist
	System.out.println(a.contains("Autmation Tester"));
	String [] name = {"Udemy","Course","449"};
	List<String> nameArrayList = Arrays.asList(name);
	nameArrayList.contains("Course");
  }
	}
