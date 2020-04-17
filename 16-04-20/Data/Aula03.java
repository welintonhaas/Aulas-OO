
public class Aula03 {

    public static void main(final String[] args) {

        Data data1 = new Data();

        if (data1.setData(29,02,2020)){
            System.out.println("data válida");
        }else{
            System.out.println("data inválida");
        }
    }
}