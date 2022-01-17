package exaula07;
public class Lutador implements Controlador{
    private String nome,nacionalidade,categoria;
    private int idade,vitoria,empate,derrotas;
    private float altura,peso;

    public Lutador(String nome, String nacionalidade, int idade, int vitoria, int empate, int derrotas, float altura, float peso) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setVitoria(vitoria);
        this.setEmpate(empate);
        this.setDerrotas(derrotas);
        this.setAltura(altura);
        this.setPeso(peso);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(categoria);
    }
    
    private String getCategoria() {
        return categoria;
    }

    private void setCategoria(String categoria) {
        if(this. getPeso()< 52.2){
            this.categoria = "invalido";
        }else if (this.getPeso() <= 70.3){
            this.categoria = "leve";  
        }else if (this.getPeso() <= 83.9){
            this.categoria = "medio";
        }else if (this.getPeso() <= 120.2){
            this.categoria = "pesado";
        }else{
            this.categoria = "Esta muito gordo";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public float getAltura() {
        return altura;
    }

    public  void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public void apresentar() {
        System.out.println("Lutador: "+this.getNome());
        System.out.println("Origem: "+this.getNacionalidade());
        System.out.println(this.getIdade()+" anos");
        System.out.println("Pesando: "+this.getPeso());
        System.out.println("Ganhou: "+this.getVitoria());
        System.out.println("Perdeu: "+this.getDerrotas());
        System.out.println("Empatou: "+this.getEmpate());
    }

    @Override
    public void status() {
        System.out.println(this.getNome());
        System.out.println("é um peso "+this.getCategoria());
        System.out.println(this.getVitoria() +" vitórias");
        System.out.println(this.getDerrotas()+" derrotas");
        System.out.println(this.getEmpate()+" empates");
    }

    @Override
    public void ganharLuta() {
        this.setVitoria(this.getVitoria()+1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas()+1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpate(this.getEmpate()+1);
    }
    
}
