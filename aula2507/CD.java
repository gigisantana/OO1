
public class CD {
    private String titulo;
    private int ano;
    private boolean ehDuplo;
    private Banda banda;
    private EstiloEnum estilo;
    private Musica musica;


    public CD(String titulo, int ano, boolean ehDuplo){
        this.titulo = titulo;
        this.ano = ano;
        this.ehDuplo = ehDuplo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public int getAno(){
        return this.ano;
    }

    public boolean getEhDuplo(){
        return this.ehDuplo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setEhDuplo(boolean ehDuplo){
        this.ehDuplo = ehDuplo;
    }

    public String toString(){
        return "CD: " + this.titulo + "\nAno: " + this.ano + "\nDuplo: " + this.ehDuplo;
    }
}
