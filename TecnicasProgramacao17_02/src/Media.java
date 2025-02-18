import javax.swing.JOptionPane;

public class Media {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 1ª nota"));
		float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 2ª nota"));

		float media = (n1 + n2) / 2;

		if (media >= 7) {
			JOptionPane.showMessageDialog(null, nome + " a sua média é " + media + " você está aprovado!");
		} else if (media < 4) {
			JOptionPane.showMessageDialog(null, nome + " a sua média é " + media + " você está reprovado!");
		} else {
			JOptionPane.showMessageDialog(null, nome + " a sua média é " + media + " você está de recuperação!");
		}
	}
}
