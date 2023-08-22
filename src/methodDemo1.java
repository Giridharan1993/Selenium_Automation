
public class methodDemo1 {

	public static void main(String[] args) {
		methodDemo1 d1 = new methodDemo1();
		String name = d1.getData();
		System.out.println(name);
		methodDemo2 d2 = new methodDemo2();
		d2.getData2();
	

	}

	public String getData() {
	
		System.out.println("Hello Automation Tester");
		return "Giridharan";
	}
	
	public methodDemo1() {
		
	}
}
