import java.util.Scanner;

public class RecebendoDados{
    public static void main(String[] args) {
        Pessoa user = new Pessoa();

        String maiorMenor;

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o seu nome: ");
        user.setNome(scan.nextLine());

        System.out.print("Digite sua idade " + user.getNome() + ": ");
        user.setIdade(scan.nextInt());
        scan.nextLine();

        System.out.print("Digite seu número de telefone: ");
        user.setTel(scan.nextLine());

        System.out.print("Digite seu CPF: ");
        user.setCpf(scan.nextLine());

        if (user.getIdade() < 18){
            maiorMenor = "menor";
        }
        else{
            maiorMenor = "maior";
        }

        user.apresentar();
        System.out.println("É " + maiorMenor + " de idade.");

    }
}