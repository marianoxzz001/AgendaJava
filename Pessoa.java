import java.util.ArrayList;

public class Pessoa {
    String nome;
    Data nasc;
    ArrayList<Contato>contatos;



    public Pessoa(){
        this.contatos = new ArrayList<Contato>();
    }
    void cadastrarContato(String num, boolean isW, boolean isT)
    {
        Contato t = new Contato(num, isW, isT);
        this.contatos.add(t);
        this.contatos

                                                        




    }
    void listarContatos(){
        for(int i =0; i < this.contatos.size(); i++){
            contatos.get(i).imprimeContato();

            System.out.println();
        }
    }
}
