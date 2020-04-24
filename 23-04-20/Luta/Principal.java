
public class Principal {

    public static void main(final String[] args) {
       	Lutador[] l = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "França",31,1.75,68.9, 11, 3, 1);
        l[1] = new Lutador("Putscript", "Brasil", 
                            29,1.68,57.8,
                            14,2,3);
        l[2] = new Lutador("Snapshadow", "EUA", 
                            35,1.65,80.9,
                            12,2,1);
        l[3] = new Lutador("Dead Code", "Australia", 
                            28,1.93,81.6,
                            13,0,2);
        l[4] = new Lutador("Devast", "Alemanha", 
                            99,2.05,130.6,
                            11,1,0);
        l[5] = new Lutador("Bit low", "Ucrânia", 
                            1,1.75,35.9,
                            11,3,0);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0],l[1]);
        UEC01.lutar();

    }

}