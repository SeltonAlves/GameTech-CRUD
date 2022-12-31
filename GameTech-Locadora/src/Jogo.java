public class Jogo {

    private String nome;
    private String Categoria;
    private int anoLancamento;

    public Jogo(String nome){
        this.nome = nome;
    }

    public Jogo(String nome, String categoria, int anoLancamento) {
        this.nome = nome;
        this.Categoria = categoria;
        this.anoLancamento = anoLancamento;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected void setCategoria(String categoria) {
        Categoria = categoria;
    }

    protected void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    protected String getNome() {
        return nome;
    }

    protected String getCategoria() {
        return Categoria;
    }

    protected int getAnoLancamento() {
        return anoLancamento;
    }
}
