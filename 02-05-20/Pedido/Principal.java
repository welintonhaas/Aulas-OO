import java.util.Scanner;

public class Principal {

    private static Produto produto[];

    public static void main(final String[] args) {
        int opcao = 0;
        int codprod;
        int quantprod;

        final Scanner input = new Scanner(System.in);

        produto = new Produto[10];

        produto[0] = new Produto(0, 20, "Teclado");
        produto[1] = new Produto(1, 300, "Monitor");
        produto[2] = new Produto(2,90,"Gabinete");
        produto[3] = new Produto(3,120,"Placa Mãe");
        produto[4] = new Produto(4,320,"Placa de Vídeo");
        produto[5] = new Produto(5,650,"Processador");
        produto[6] = new Produto(6,150,"HD");
        produto[7] = new Produto(7,200,"SSD");
        produto[8] = new Produto(8,50,"Fonte");   
        produto[9] = new Produto(9,50,"Mouse");   
        
        final Pedido pedido1 = new Pedido(); 

        while(opcao != 2){
            System.out.println("+---------------------------------+");
            System.out.println("| Menu de Opções                  |");
            System.out.println("| 1 - Adicionar item ao pedido    |");
            System.out.println("| 2 - Apresentar total do pedido  |");
            System.out.println("+---------------------------------+");

            opcao = input.nextInt();

            if (opcao!=2){
            
                System.out.println("Digite o código do produto que você deseja adicionar");
                codprod = input.nextInt();
                System.out.println("Digite quantidade que deseja adicionar");
                quantprod = input.nextInt();
                final itemPedido item = new itemPedido(produto[codprod],quantprod);
                pedido1.adicionar_item(item);
            }
            else{
                System.out.println("Valor total do pedido R$"+pedido1.obter_total());
            }
            
        };
       
    }
}
