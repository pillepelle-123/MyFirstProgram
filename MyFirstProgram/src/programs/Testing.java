package programs;

public class Testing {
	
	public String var_instance = "abc";
	public static String var_class = "abc";
	

	public static void compareTest() {

		if ("Hallo" == "Hallo") {
			System.out.println("==");
		} 
		if ("Hallo".equals("Hallo")) {
			System.out.println("equals");
//		} else {
//			// nix
		}
	}
	
	public static void whileSchleifenNummer(int iterationen) {
		int i = 0;
		while(i < iterationen) {
			int shownNumber = i+1;
			boolean uneven = Testing.isUneven(shownNumber);
			System.out.println(shownNumber + ". Iteration (" + ( uneven ? "ungerade" : "gerade") + ")");
			i++;
		}
	}
	
	public static boolean isUneven(int number) {
		return number % 2 == 1;
	}
	
}
