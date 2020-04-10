public class Caneta {

    private String modelo;
    private String cor;
    private float ponta; 
    private int carga; 
    private boolean tampada;

    public void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Uma Caneta "+this.cor);
        System.out.println("Ponta "+this.ponta);
        System.out.println("Carga "+this.carga);
        System.out.println("Está tampada? "+this.tampada);
    }

    public void rabiscar(){
        if (tampada == true){
            System.out.println("Não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setPonta(float ponta){
        this.ponta = ponta;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }


}