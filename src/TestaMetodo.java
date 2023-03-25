public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        // atribuindo valor com metodo deposita
        contaDoPaulo.deposita(1500);
        // sacando o valor com metodo saca
        contaDoPaulo.saca(50);
        // Criando nova conta e depositando 1000$ a conta da marcela
        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(5000);
        // Transferindo valor atraves do metodo transfere pra conta do paulo
        contaDaMarcela.transfere(500,contaDoPaulo);
        // Printando valor na tela
        System.out.println("ola Marcela seu novo saldo é de $" +contaDaMarcela.saldo);
        System.out.println("ola Paulo Seu novo saldo é de $" +contaDoPaulo.saldo);



    }
}
