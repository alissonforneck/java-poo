package exaula05;
public class ExAula05 {
    
    public static void main(String[] args) {
        Banco c1 = new Banco("Jubileu","Poupança",300.0f);
        c1.Status();
        Banco c2 = new Banco("Creuza","Conta Corrente",500.f);
        c2.Status();
        c2.setValor(c2.getValor()-100.0f);
        c2.Status();
    }
    
}
