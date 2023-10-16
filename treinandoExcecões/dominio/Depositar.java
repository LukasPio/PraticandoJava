package praticando.treinandoExcecões.dominio;

public class Depositar {

   public static void depositar (Usuario usuario, double saldoParaDeposito) {
       usuario.saldoEmConta += saldoParaDeposito;
       usuario.relatorioUsuario();
   }

}
