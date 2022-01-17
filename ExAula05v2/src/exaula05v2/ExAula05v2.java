package exaula05v2;

public class ExAula05v2 {
    
    public static void main(String[] args) {
        Banco c1 = new Banco();
        
        /*String action;
        System.out.println("O que voce deseja fazer? ");
        //action = ;*/
        c1.abrirConta(123, "CC", "Jubileu", 300);
        //c1.mostraConta();
        //c1.fecharConta();
        c1.depositar(100);
        c1.sacar(250);
        c1.fecharConta();
        c1.depositar(350);
        c1.mostraConta();
        Banco c2 = new Banco();
        c2.abrirConta(122, "CP", "Creuza", 500);
    }
}
