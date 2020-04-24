public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // Métodos
    public Lutador (String no,
                    String na,
                    int id,
                    double al,
                    double pe,
                    int vi,
                    int de,
                    int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public double getPeso() {
        return this.peso;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public int getEmpates() {
        return this.empates;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public void setCategoria() {
        if (this.peso<52.2){
            this.categoria = "Inválido";
        }else if(this.peso <= 70.3){
            this.categoria = "leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }else if (this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "inválido";
        }
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void ganharLuta(){
        this.vitorias++;
    }

    public void perderLuta(){
        this.derrotas++;
    }

    public void empatarLuta(){
        this.empates++;
    }

    public void apresentar(){
        System.out.println("Lutador "+ getNome());
        System.out.println("Origem "+ getNacionalidade());
        System.out.println("Idade "+ getIdade());
        System.out.println("Altura "+ getAltura());
        System.out.println("Pesando "+ getPeso());
        System.out.println("Ganhou "+ getVitorias());
        System.out.println("Perdeu "+ getDerrotas());
        System.out.println("Empatou "+ getEmpates());
    }

    public void status(){
        System.out.println(getNome());
        System.out.println("é um peso "+getCategoria());
        System.out.println(getVitorias()+" Vitórias");
        System.out.println(getDerrotas()+" Derrotas");
        System.out.println(getEmpates()+" Empates");
    }

}