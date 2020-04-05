class TestaConta {

    public static void main(final String[] args) {
        Conta c1 = new Conta();
        Data data = new Data();
        c1.titular = "Danilo";
        c1.numero = 123;
        c1.agencia = "45678-9";
        c1.saldo = 50.0;
        data.dia = 04;
        data.mes = 06;
        data.ano = 2015;
        c1.dataDeAbertura = data;
 
        Conta c2 = new Conta();        
        c2.titular = "Danilo";
        c2.saldo = 100;

        //Conta c3 = new Conta();        
        //c3.titular = "Danilo";
        //c3.saldo = 100;

        Conta c3 = c2; // Apona para a mesma conta - fazendo com que a resposta seja que as contas são iguais
   
        if (c3 == c2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");        
        }

        c1.deposita(100.0);
        System.out.println(c1.recuperaDadosParaImpressao());
        c1.saca(50.00);
        c1.deposita(100.00);
        System.out.println(c1.recuperaDadosParaImpressao());

        //Conta.saldo = 1234; // Não é possível pois devemos criar um novo objeto informar os valores dele
        //Conta.calculaRendimento(); // Não é possível pois devemos criar um novo objeto informar os valores dele
    }
}