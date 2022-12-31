public class Pessoa {

    private String nome;
    private int idade;
    private long cpf;
    private int telefone;
    private String email;
    private Endereco endereco;

    public Pessoa(){}
    
    public Pessoa(String nome, int idade, long cpf, int telefone, String email, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public Pessoa(String nome, long cpf) {
        this.nome = nome;
        this.cpf= cpf;
    }


    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected void setIdade(int idade) {
        this.idade = idade;
    }

    protected void setCpf(long cpf) {
        this.cpf = cpf;
    }

    protected void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    protected String getNome() {
        return nome;
    }

    protected int getIdade() {
        return idade;
    }

    protected long getCpf() {
        return cpf;
    }

    protected int getTelefone() {
        return telefone;
    }

    protected String getEmail() {
        return email;
    }

    protected Endereco getEndereco() {
        return endereco;
    }
}
