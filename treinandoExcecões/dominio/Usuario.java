package praticando.treinandoExcecões.dominio;

public class Usuario {
    protected String name;
    protected double saldoEmConta;

    public Usuario(String name, double saldoEmConta) {
        this.name = name;
        this.saldoEmConta = saldoEmConta;
    }

    public Usuario(String name) {
        this.name = name;
        this.saldoEmConta = 0;
    }

    public void relatorioUsuario () {
        System.out.println("Nome: " + this.name);
        System.out.println("Saldo em conta: " + this.saldoEmConta);
        System.out.println("--------------");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaldoEmConta() {
        return saldoEmConta;
    }

    public void setSaldoEmConta(double saldoEmConta) {
        this.saldoEmConta = saldoEmConta;
    }
}
