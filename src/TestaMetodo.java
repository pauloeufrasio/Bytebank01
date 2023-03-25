public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();

        contaDoPaulo.deposita(100);
        System.out.println(contaDoPaulo.saldo);
        contaDoPaulo.saca(50);
        System.out.println(contaDoPaulo.saldo);
    }
}
