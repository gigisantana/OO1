public class Musica {
    private String titulo;
    private int duracao;
    private EstiloEnum estilo;

    public Musica(String titulo, int duracao){
        this.titulo = titulo;
        this.duracao = duracao;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public int getDuracao(){
        return this.duracao;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setDuracao(int duracao){
        this.duracao = duracao;
    }

    public String toString(){
        return "Titulo: " + this.titulo + "\nDuracao: " + this.duracao;
    }
}
