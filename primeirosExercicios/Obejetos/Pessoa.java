public class Pessoa{
    private String nome;
    private int idade;
    private String cpf;
    private String tel;

    public Pessoa(){
        this.nome = " ";
        this.idade = 0;
        this.cpf = " ";
        this.tel = " ";
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getTel(){
        return this.tel;
    } 

    public void setTel(String tel){
        this.tel = tel;
    }

    public void apresentar(){
        System.out.println("=-".repeat(20));
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone: " + this.tel);
        System.out.println("=-".repeat(20));
    }
}