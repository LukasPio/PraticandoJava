package praticando.gerenciandoFuncionarios.dominio;

import java.util.Random;

public abstract class Funcionario {

    protected String nome;
    protected int id;
    protected double salarioBase;

    public Funcionario(String nome) {
        Random random = new Random();
        this.nome = nome;
        this.id = random.nextInt(90000) + 10000;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", salarioBase=" + salarioBase +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
