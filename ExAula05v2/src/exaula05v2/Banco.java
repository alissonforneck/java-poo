package exaula05v2;
public class Banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void abrirConta(int nc,String t, String d, float s){
        this.numConta = nc;
        this.tipo = t;
        this.dono = d;
        this.saldo = s;
        this.status = true;
        if (tipo == "CC"){
            saldo = 150f;
        }else{
            saldo = 50f;
        }
    }
    public void fecharConta(){
        if (status == true & this.saldo == 0){
            this.status = false;
            System.out.println(this.dono+" escolheu fechar a conta");
        }else{
            System.out.println("Você precisa ter uma conta ativa para poder fechar!");
        }
    }
    
    public void depositar(float depo){
        if(this.status == true){
         this.saldo=this.saldo+depo;   
        }else{
            System.out.println("Para depositar você precisa ter ma conta ativa");
        }
        
    }
    public void sacar(float sac){
        if (this.status == true){
            if (sac > this.saldo){
                System.out.println("Você tentou sacar mais do que o seu saldo");

            }else if(sac <= this.saldo) {
                this.saldo= this.saldo-sac;
            }else {
                   System.out.println("Para sacar você precisa ter uma conta ativa"); 
                    }
        }
        
    }
    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int nc){
        this.numConta = nc;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getDono(){
        return this.dono;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    public void mostraConta(){
        if(this.status==true){
        System.out.println("Numero da conta: "+this.getNumConta());
        System.out.println("Tipo da conta: "+this.getTipo());
        System.out.println("Dono da conta: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status da conta: "+this.status);
        }else if (this.status == false){
            System.out.println("Sua conta esta fechada");
        }
    }
}
