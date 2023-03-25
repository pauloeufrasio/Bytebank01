public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        // atribuindo valor com metodo deposita
        contaDoPaulo.deposita(200);
        System.out.println(contaDoPaulo.saldo);
        // sacando o valor com metodo saca
        contaDoPaulo.saca(50);

    }
}
