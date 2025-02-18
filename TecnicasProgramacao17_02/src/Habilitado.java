import java.util.Scanner;

public class Habilitado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Passou no psicotécnico? (s para Sim e n para não): ");
		char psico = scan.next().charAt(0);
		System.out.print("Passou no exame médico? (s para Sim e n para não): ");
		char medico = scan.next().charAt(0);
		System.out.print("Passou no exame prático? (s para Sim e n para não): ");
		char pratico = scan.next().charAt(0);

		if( (psico == 's') && (medico == 's') && (pratico == 's') ){ //Aspas simples para char
			System.out.println("O aluno está habilitado!");
		} else {
			System.out.println("O aluno não está habilitado :(");
		}

	}

}
