public class Conta {

    String titular;
    int numero;
    String agencia;
    double saldo;
    Data dataDeAbertura;

    void saca(double valor) {
        this.saldo -= valor;
    }

    void deposita(double valor) {
        this.saldo += valor;
    }

    double calculaRendimento() {
        return this.saldo*0.1;
    }
    String recuperaDadosParaImpressao(){
        String dados = "Titular: " + this.titular;
             dados += "\n Número: " + this.numero;
             dados += "\n agencia: " + this.agencia;
             dados += "\n saldo: " + this.saldo;
             dados += "\n dataDeAbertura: " + this.dataDeAbertura.formatada();
             // imprimir aqui os outros atributos...
             // também pode imprimir this.calculaRendimento()
             return dados;
    }
}