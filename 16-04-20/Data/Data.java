public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(){}

    public boolean setData(int d,int m,int a){

        /* Dia */
        if (this.validaData(d,m,a)){
            this.dia = d;
        }else{
            return false;
        }

        /* Mes */
        if (m > 0 && m <= 12){
            this.mes = m;
        }else{
            return false;
        }
        
        /* Ano */
        if(a > 1900 && a <= 2020 ){
            this.ano = a;
        }else{
            return false;
        }

        return true;
        
    }

    public boolean validaData(int d,int m,int a){

        // Mes par tem 30 dias
        if ( m % 2 == 0 && d <= 30 ){ 
            // se for mes 2 
            if ( m == 2  ){
                //não é bissexto e tem no máximo 28 dias
                if ( !anoBissexto(a) && d <= 28 ){
                    return true;
                }
                //é bissexto e tem no máximo 29 dias
                else if (anoBissexto(a) && d <= 29){
                    return true;
                }
                // qualquer coisa fora isso é inválido
                return false;

            }
            return true;
        }else if (d < 31){// 31 dias
            return true;
        }
        // Data inválida
        else{
            return false;
        }
    }

    public boolean anoBissexto(int a){
        if (( a % 4 == 0 && a % 100 != 0 ) || ( a % 400 == 0 )){ // essa linha catei na intenet
             return true; 
        }
        return false;
    }

    public String getData(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}