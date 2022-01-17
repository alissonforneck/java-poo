package aula06;
public class ControleRemoto implements Controlador{
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //Métodos especiais
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    private int getVolume(){
        return this.volume;
    }
    private void setVolume(int v){
        this.volume = v;
    }
    private boolean getLigado(){
        return this.ligado;
    }
    private void setLigado(boolean l){
        this.ligado = l;
    }
    private boolean getTocando(){
        return this.tocando;
    }
    private void setTocando(boolean t){
        this.tocando = t;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado()){
            System.out.println("Está ligado? " +this.getLigado() );
            System.out.println("Está tocando? "+this.getTocando());
            System.out.print("Volume "+this.getVolume());
            for ( int i =0 ; i <= this.getVolume(); i+=10){
                System.out.print("|");
            }
        }else{
            System.out.println("Só posso abrir o menu com a TV ligada");
        }
        
    }

    @Override
    public void fecharMenu() {
        if(this.getLigado()){
            System.out.println("Fechando Menu...");
        }else{
            System.out.println("Só posso fechar o menu com a TV ligada");
        }
        
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()+5);
        }else{
            System.out.println("Ligue a TV antes de tentar aumentar o volume");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()-5);
        }else{
            System.out.println("Ligue a TV antes de tentar diminuir o volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(this.getVolume()-this.getVolume());
        }else{
            System.out.println("Para colocar no mudo você precisa estar com a TV ligada");
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0 ){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && (this.getTocando())){
            this.setTocando(false);
        }
    }
    
}
