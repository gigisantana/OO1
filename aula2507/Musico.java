public class Musico{
    private String nome;
    private String email;
    private Banda banda;

    public Musico(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return "Nome: " + this.nome + "\nEmail: " + this.email;
    }
}