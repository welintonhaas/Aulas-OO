class Produto {
    private final int codigo;
    private final float valor;
    private final String descricao;
    
    public Produto(int c, float v, String d){
        this.codigo = c;
        this.valor = v;
        this.descricao = d;
    }

    public float getValor(){
        return this.valor;
    }
        
}
