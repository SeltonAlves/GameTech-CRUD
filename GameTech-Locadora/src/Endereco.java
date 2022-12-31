public class Endereco{

    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String complemento;
    private int cep;

    
    public Endereco(String rua, int numero, String bairro, String cidade, String estado, String complemento, int cep) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.complemento = complemento;
        this.cep = cep;
    }

    protected String getRua() {
        return rua;
    }

    protected int getNumero() {
        return numero;
    }

    protected String getBairro() {
        return bairro;
    }

    protected String getCidade() {
        return cidade;
    }

    protected String getEstado() {
        return estado;
    }

    protected String getComplemento() {
        return complemento;
    }

    protected int getCep() {
        return cep;
    }
}
