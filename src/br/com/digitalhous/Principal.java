package br.com.digitalhous;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Curso fullstack = new Curso("Fullstack");
        Curso android = new Curso("Mobile Android");

        Aluno fernando = new Aluno ("Fernando","Santos",01,android);
        Aluno erick = new Aluno ("Erick","Stefan",02,fullstack);
        Aluno vini = new Aluno ("Vinicius","Oliveira",03,android);
        Aluno vini2 = new Aluno ("Vinicius","Oliveira",03,android);
        Aluno ana = new Aluno ("Ana","Pereira",04,fullstack);


        List<Aluno> alunos = new ArrayList<>();

        alunos.add(vini);
        alunos.add(fernando);
        alunos.add(erick);
        alunos.add(ana);

        System.out.println(alunos.contains(vini2));
        System.out.println(vini.verificarAluno(vini2));

        System.out.println(alunos.contains(vini2));
        System.out.println(alunos.toString());
}

}
