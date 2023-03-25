public class Conta {
    // Declarando os atributos da classe conta
    public double saldo;
    public int agencia;
    public int numero;
    String titular;
    // Criando o metodo deposita que recebe (valor) como parametro e retorna saldo o que ta nele mesmo mais o (valor)
    public void deposita(double valor){
        this.saldo += valor;
    }
    // Criando o metodo saca que tambem recebe valor como parametro obs: A variavel (valor) � diferente da variavel do metodo deposita.
    public boolean saca(double valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println(" Voce retirou $" + valor + " e o valor atual � $" +this.saldo);
            return true;
        }
        else {
            System.out.println("Voce nao tem saldo suficiente pra completar essa transa��o seu saldo � "+ this.saldo);
            return false;
        }

    }

}
