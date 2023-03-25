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
    // Criando o metodo saca que tambem recebe valor como parametro obs: A variavel (valor) é diferente da variavel do metodo deposita.
    public void saca(double valor){
        this.saldo -= valor;
    }

}
