
class itemPedido {
    private final int quantidade;
    private final Produto produto;
    
    itemPedido(Produto p, int q){
        this.quantidade = q;
        this.produto = p;
    }

    public Produto getProduto(){
        return this.produto;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

}
