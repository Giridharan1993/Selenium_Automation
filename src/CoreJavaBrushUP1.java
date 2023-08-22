
public class CoreJavaBrushUP1 {

	public static void main(String[] args) {
		
		int[] arr = new int [5];
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		arr[4] = 6;
		
		System.out.println(arr[4]);
		
		int [] arr2 = {0,1,2,3,4};
		System.out.println(arr2[2]);

		//using string concept in the array.
		String [] name = {"Giri", "Jeff", "Testers"};
		
		{
			for (int j=0; j<name.length; j++)
			{
			System.out.println(name[j]);
		}
			//Or use this simple and enchanced forloop.
		
			for ( String s: name)
			{
				System.out.println(s);
			}
		}
	}

}
