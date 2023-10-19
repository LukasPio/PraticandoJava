package praticando.soCodando.dominio;

public class Dog {
    protected String name;
    protected String raca;
    protected People dono;

    public Dog(String name, String raca, People dono) {
        this.name = name;
        this.raca = raca;
        this.dono = dono;
    }

    public void bark() {
        System.out.println(this.name + ": " + "Au Au");
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
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
