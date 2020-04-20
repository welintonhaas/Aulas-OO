
public class Principal {

    public static void main(final String[] args) {

        Data data1 = new Data();

        if (data1.setData(29,02,2020)){
            System.out.println("data válida");
        }else{
            System.out.println("data inválida");
        }

        Estudante aluno = new Estudante(01,"Samuka");

        aluno.setNotas(5, 3, 4);

        System.out.println(aluno.getNotas());

        System.out.println(aluno.calculaMedia());

        System.out.println(aluno.calculaMedia(1));
    }
}