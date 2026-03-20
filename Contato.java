public class Contato{
    String num;

    boolean isWhat;
    boolean isTel;

    void imprimeContato(){
        String saida = "("+this.num+") ";


        if (this.isWhat) saida+= "Whatts";
        if (this.isTel) saida+= "Tel";

    }
}
