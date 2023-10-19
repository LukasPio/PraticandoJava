package praticando.soCodando;

public class Dog {
    protected String nome;
    protected String raca;
    protected People dono;

    public Dog(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public People getDono() {
        return dono;
    }

    public void setDono(People dono) {
        this.dono = dono;
    }
}
