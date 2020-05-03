public class Pedido {
    private float valor_total;
    private itemPedido itempedido;
        
    public void adicionar_item(final itemPedido item){
        int quant;
        float valor;
        this.itempedido = item;
        valor = itempedido.getProduto().getValor();
        quant = itempedido.getQuantidade(); 
        valor_total += quant*valor;
    }
    
    public float obter_total(){
        return this.valor_total;
    }
    
}