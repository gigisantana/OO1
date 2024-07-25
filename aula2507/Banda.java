public class Banda {
    private String nome;
    private EstiloEnum estilo;
    private CD cd;
    private Musica musica;
    
    public Banda(String nome, EstiloEnum estilo){
        this.nome = nome;
        this.estilo = estilo;
    }

    public String getNome(){
        return this.nome;
    }

    public EstiloEnum getEstilo(){
        return this.estilo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEstilo(EstiloEnum estilo){
        this.estilo = estilo;
    }

    public String toString(){
        return "Banda: " + this.nome + "\nEstilo:  " + this.estilo;
    }
}
