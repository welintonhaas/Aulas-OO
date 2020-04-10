public class Aula02{

    public static void main(final String[] args) {
        final Caneta c1 = new Caneta();

        c1.setCor("Azul");
        c1.setPonta(0.5f);
        c1.tampar();
        c1.status();

        c1.rabiscar();

        final Caneta c2 = new Caneta();

        c2.setCor("Vermelha");
        c2.setPonta(0.1f);
        c2.destampar();

        c2.status();
        c2.rabiscar();

    }
}
    