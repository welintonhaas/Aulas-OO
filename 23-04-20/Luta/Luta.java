import java.util.Random;

public class Luta{
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int vencedor;
    private boolean aprovada;

    // Métodos
    public void marcarLuta(final Lutador l1, final Lutador l2){
        if ( (l1.getCategoria() == l2.getCategoria()) && (l1 != l2) ){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar(){
        if (this.aprovada){
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            final Random gerador = new Random();
            this.vencedor = gerador.nextInt(3) ;
            switch (this.vencedor){
                case 0: //Empate
                    System.out.println("Empatou!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1: // Ganhou Desafiado
                    System.out.println(desafiado.getNome() + " Venceu");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2: // Ganhou Desafiado
                    System.out.println(desafiante.getNome() + " Venceu");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
            }
        }else{
            System.out.println("Esta luta não pode acontecer!");
        }
    }

}