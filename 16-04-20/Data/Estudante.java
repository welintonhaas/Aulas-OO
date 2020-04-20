
public class Estudante {

    private final int codigo;
    private final String nome;
    private Data dataNasc;
    private double notaMat;
    private double notaPort;
    private double notaCien;
    private double media;

    public Estudante(int c, String n) {
        this.codigo = c;
        this.nome = n;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getNotas() {
        return "Matematica:" + notaMat + " Portugues:" + notaPort + " Ciências:" + notaCien;
    }

    public void setNotas(final int m, final int p, final int c) {
        this.notaMat = m;
        this.notaPort = p;
        this.notaCien = c;
    }

    public double calculaMedia(){
        this.media = this.notaCien + this.notaMat + this.notaPort;
        return this.media/3;
    }

    public double calculaMedia(int e){
        this.media = this.notaCien + this.notaMat + this.notaPort;
        return (this.media/3) + e;
    }
    
}