
public class Aula02{

    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = true;
        c1.status();

        c1.rabiscar();

        Caneta c2 = new Caneta();

        c2.cor ="Vermelha";
        c1.ponta = 0.1f;
        c2.tampada = false;

        c2.status();
        c2.rabiscar();

    }
}
    