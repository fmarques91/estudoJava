import javax.swing.JOptionPane;

public class Taboada {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite a taboada desejada: "));

		System.out.println("*Taboada " + num + "*\n------------");
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}

	}

}
