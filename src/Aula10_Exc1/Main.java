package Aula10_Exc1;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Fernando", 1233);
        Pessoa pessoa1 = new Pessoa("Nadia", 1234);

        System.out.println(pessoa.equals(pessoa1));

    }
}
