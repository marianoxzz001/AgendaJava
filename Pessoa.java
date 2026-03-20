public class Pessoa {
    String nome;
    Data nasc;
    Contato contato[]= new Contato[4];
    int numContatos = 0 ;
    void cadastrarContato(String num, boolean isW, boolean isT)
    {
        this.contato[numContatos].num =num;
        this.contato[numContatos].isTel = isT;
        this.contato[numContatos].isWhat = isW;
        numContatos++;



    }
    void listarContatos(){
        for(int i =0; i < numContatos; i++){
            contato[1].imprimeContato();
            System.out.println();
        }
    }
}
