public class CriarConta {
    public static void main(String[] args) {
        // Instanciando e criando a Primeira Conta atraves da classe conta
        Conta primeiraConta = new Conta();
        // Atribuindo valor pra primeira conta
        primeiraConta.saldo = 200;
        // Criando segunda conta obs: primeira conta nao tem nada a ver com a segunda conta são objetos diferente
        Conta segundaConta = new Conta();
        segundaConta.saldo = 100;
        // Printando o valor de cada conta na tela
        System.out.println("A primeira conta tem " +primeiraConta.saldo);
        System.out.println("A segunda conta tem " +segundaConta.saldo);
        // Criando condição pra ver se sao as mesmas contas
        if (primeiraConta == segundaConta){
            System.out.println("Sao a mesma conta");
        }
        else {
            System.out.println("Sao contas diferentes");
        }


    }
}


