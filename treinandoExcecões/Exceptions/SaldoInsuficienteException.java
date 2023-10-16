package praticando.treinandoExcecões.Exceptions;

public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException() {
        super("É necessário ter o valor do saldo que será transferido/sacado em caixa");
    }
}
