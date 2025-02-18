
public class LacoFor {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			System.out.println("Linha: " + i);
		}
		System.out.println("============================");
		
		for(int i = 1; i <= 100; i += 2) {
			System.out.println("Linha: " + i);
		}
		System.out.println("============================");
		
		for(int i = 0; i <= 100; i+=2) {
			System.out.println("Linha: " + i);
		}

	}

}
