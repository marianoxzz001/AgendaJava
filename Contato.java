public class Contato{
    String num;

    boolean isWhat;
    boolean isTel;


    public Contato(String num, boolean isW, boolean isT){
        void imprimeContato(){
        String saida = "("+this.num+") ";


        if (this.isWhat) saida+= "Whatts";
        if (this.isTel) saida+= "Tel";

         }
    }
}