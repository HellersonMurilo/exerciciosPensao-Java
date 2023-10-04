package classes;

public class Estudantes extends Pensionato{
    private String nome;
    private String emailEstudante;
    private int quartoEscolhido;

    public Estudantes(String nome, String emailEstudante, int quartoEscolhido) {
        this.nome = nome;
        this.emailEstudante = emailEstudante;
        this.quartoEscolhido = quartoEscolhido;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmailEstudante() {
        return emailEstudante;
    }
    public void setEmailEstudante(String emailEstudante) {
        this.emailEstudante = emailEstudante;
    }
    public int getQuartoEscolhido() {
        return quartoEscolhido;
    }
    public void setQuartoEscolhido(int quartoEscolhido) {
        this.quartoEscolhido = quartoEscolhido;
    }

    public void reservaQuarto() {

    }

    @Override
    public String toString() {
        return "nome=" + nome + ", emailEstudante=" + emailEstudante + ", quartoEscolhido="
                + quartoEscolhido;
    }


    
}