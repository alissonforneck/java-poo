package exaula05;
public class Banco {
    private String dono;
    private String conta;
    private float valor;
    public Banco(String d,String c, float v){
        this.setDono(c);
        this.setValor(v);
        this.setConta(c);
    }
    public String getDono(){
        return this.dono;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public String getConta(){
        return this.conta;
    }
    public void setConta(String c){
        this.conta = c;
    }
    public float getValor(){
        return this.valor;
    }
    public void setValor(float v){
        this.valor = v;
    }
    public void Status(){
        System.out.println("Extrato Bancario");
        System.out.println("Beneficiario: "+this.getDono());
        System.out.println("Valor: "+this.getValor());
        System.out.println("Tipo de conta: "+this.conta);
    }
}
