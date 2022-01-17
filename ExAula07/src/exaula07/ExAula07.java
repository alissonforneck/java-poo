package exaula07;
public class ExAula07 {
    public static void main(String[] args) {
        Lutador l1 = new Lutador("Pretty Boy","França",31,11,2,1,1.75f,68.9f);
        Lutador l2 = new Lutador("Putscript","Brazil",29,14,2,3,1.68f,57.8f);
        Lutador l3 = new Lutador("Snapshadow","EUA",35,12,2,1,1.65f,80.9f);
        Lutador l4 = new Lutador("Dead Code", "Australia",28,13,0,2,1.93f,81.6f);
        Lutador l5 = new Lutador("Ufocobol","Brazil",37,5,4,3,1.70f,119.3f);
        Lutador l6 = new Lutador("Nerdard","EUA",30,12,2,4,1.81f,105.7f);
        l1.status();
        l1.empatarLuta();
        l1.status();
        
    }
} 
