public class TesteReferecia {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.saldo = 100;

        System.out.println("Saldo da conta 1 é "+ conta1.saldo);
        // Criando duas referencia pro mesmo objeto obs: o sinal de = copia da direita pra esquerda
            Conta segundaConta = conta1;
        // Printando valor da segunda conta pegando de referencia a conta1
        System.out.println("Saldo da segunda conta " +segundaConta.saldo);
        // atribuindo valo pra segunda conta
        segundaConta.saldo += 100;
        System.out.println("Saldo da segunda conta " +segundaConta.saldo);
        // O resultado vai ser o mesmo por que estamos se referindo a uma conta só que é a conta 1
        System.out.println("Saldo da conta 1 é "+ conta1.saldo);
        // criando condição pra ver se sao as mesmas contas
        if (conta1 == segundaConta){
            System.out.println("Sao a mesma conta");
        }

    }
}
