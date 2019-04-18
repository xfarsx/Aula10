package Aula10_Exc1;

public class Pessoa {

    private String nome;
    private int rg;

    public Pessoa() {
    }

    public Pessoa(String nome, int rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    @Override
    public boolean equals(Object outraPessoa) {
        if (!(outraPessoa instanceof Pessoa)){return false;}
        if (((Pessoa) outraPessoa).getRg() == this.getRg()){return true;}
        return false;
    }
}
