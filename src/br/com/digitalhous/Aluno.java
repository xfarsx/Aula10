package br.com.digitalhous;

public class Aluno {

    private String nome;
    private String sobrenome;
    private int ra;
    private Curso curso;

    public Aluno() {
    }
    public Aluno(String nome, String sobrenome, int ra, Curso curso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ra = ra;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }


    public boolean verificarAluno(Object outroAluno) {
        if (!(outroAluno instanceof Aluno)){return false;}
        //Se Objeto outroAluno não é uma instância do Objeto Aluno RETORNA FALSE.
        if (((Aluno) outroAluno).getRa() == this.getRa() && ((Aluno) outroAluno).getNome().equals(this.getNome())){
            //SE classe Aluno que recebe "outroAluno" e pega seu RA é igual ao Ra da da variável inserida no Ra e Nome da variável
            // outroAluno é igual a variável inserida no Nome da classe aluno. RETORNA TRUE;
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ra + nome.hashCode();
    }

    @Override
    public String toString() {
        return "\nRa: " + getRa() + "\nNome: " + getNome() + "\nSobrenome: " + getSobrenome() + "\nCurso: " + getCurso().getNome() + "\n=====================";
    }
}
