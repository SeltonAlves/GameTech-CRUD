import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;

public class Locacao {
    Scanner sc = new Scanner(System.in);
    private double valor;
    private String dataInicio;
    private String dataFim;
    private Funcionario funcionario;
    private Cliente cliente;
    private Jogo jogo;
    private ArrayList<Locacao> locacaos = new ArrayList<Locacao>();


    public Locacao(){}

    public Locacao(double valor, String dataInicio, String dataFim, Funcionario funcionario,
            Cliente cliente, Jogo jogo) {
        this.valor = valor;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.jogo = jogo;
    }

    private double getValor() {
        return valor;
    }

    
    private void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    private String getDataInicio() {
        return dataInicio;
    }

    private String getDataFim() {
        return dataFim;
    }

    private Jogo getJogo() {
        return jogo;
    }
    

    public void adicionarlocacao() throws ParseException {
        int idFuncionario = Util.getInt("Digite o Id do Funcionário: ", "ERRO ao processar, Coloque apenas numeros!");
        String CargoFuncionario = Util.getString("Digite o Cargo do Funcionário:\n ");

        String locacaoNomeCliente = Util.getString("Digite o nome do cliente:\n");
        long locacaoCpfCliente = Util.getlong("Digite o Cpf do Cliente: ", "ERRO ao processar, Coloque apenas numeros!");
        String nomeJogo = Util.getString("Digite o nome do jogo:\n");


        /* DATA INÍCIO */
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();
        DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
        String dataInicio = f.format(data);

        /* DIA DA DEVOLUÇÃO */
        int diadevolucao = Util.getInt("Quantos dias para a devolução:  ", "ERRO ao processar, Coloque apenas numeros!");
        Calendar d = Calendar.getInstance();
        d.add(Calendar.DATE, diadevolucao);
        Date data1 = d.getTime();
        String dataFim = f.format(data1);

        Double valor = Util.getDouble("Valor: ", "ERRO ao processar, Coloque apenas numeros!");


        Funcionario funcionario = new Funcionario(idFuncionario,CargoFuncionario);
        Cliente cliente = new Cliente(locacaoNomeCliente,locacaoCpfCliente);
        Jogo jogo =  new Jogo(nomeJogo);
        Locacao locacao = new Locacao(valor,dataInicio,dataFim,funcionario,cliente,jogo);


        locacaos.add(locacao);


    }

    public void deletarlocacao() {
        if (!locacaos.isEmpty()) {
            int deleteLocacao = Util.getInt("Você deseja deletar uma locação! \n Digite a posição da locação:", "ERRO ao processar, Coloque apenas numeros! \n");
            locacaos.remove((deleteLocacao) - 1);
            System.out.println("Locação Deletada!");
        } else {
            System.out.println("IMPOSSÍVEL DELETAR, ADICIONE UMA LOCAÇÃO. ");
        }

    }

    public Locacao lerLocacoes(String nome) {
        if (!locacaos.isEmpty()) {
            for (Locacao locacao : locacaos) {
                if (locacao.getJogo().getNome().equals(nome)) {
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("Posição: " + (locacaos.indexOf(locacao) + 1));
                    System.out.println("INFORMAÇÕES DA LOCAÇÃO: ");
                    System.out.println("Id do funcionário: " + locacao.funcionario.getId());
                    System.out.println("Cargo do funcionário: " + locacao.funcionario.getCargo());
                    System.out.println("Nome do cliente: " + locacao.cliente.getNome());
                    System.out.println("CPF do cliente: " + locacao.cliente.getCpf());
                    System.out.println("Nome do Jogo: " + locacao.jogo.getNome());
                    System.out.println("Data da Locação: " + locacao.getDataInicio());
                    System.out.println("Data de entrega: " + locacao.getDataFim());
                    System.out.println("Valor:  " + locacao.getValor());
                } else {
                    System.out.println("O NOME DO JOGO ESTÁ INCORRETO , TENTE NOVAMENTE");
                }
            }
        } else {
            System.out.println("NÃO FOI POSSÍVEL REALIZAR A LEITURA, POR FAVOR ADICIONE LOCAÇÃO\n");
        }
        return null;
    }

    public void lerLocacoes() {
        if (!locacaos.isEmpty()) {

            for (Locacao locacao : locacaos) {
                System.out.println("--------------------------------------------------------------------------------------------");
                System.out.println("Posição: " + (locacaos.indexOf(locacao) + 1));
                System.out.println("INFORMAÇÕES DA LOCAÇÃO: ");
                System.out.println("Id do funcionário: " + locacao.funcionario.getId());
                System.out.println("Nome do cliente: " + locacao.cliente.getNome());
                System.out.println("CPF do cliente: " + locacao.cliente.getCpf());
                System.out.println("Nome do Jogo: " + locacao.jogo.getNome());
                System.out.println("Data da Locação: " + locacao.getDataInicio());
                System.out.println("Data de entrega: " + locacao.getDataFim());
                System.out.println("Valor:  " + locacao.getValor());
                System.out.println("--------------------------------------------------------------------------------------------");

            }
        } else {
            System.out.println("NÃO FOI POSSÍVEL REALIZAR A LEITURA, POR FAVOR ADICIONE LOCAÇÃO\n");
        }
    }

    public void alterarLocacao() {
        if (!locacaos.isEmpty()) {
            int alterarLocacao1 = Util.getInt("Você deseja alterar dados da locação!\nPor favor, digite a posição: ", "ERRO ao processar, Coloque apenas numeros!");
            int alterarLocacao2 = Util.getInt("Selecione o que deseja alterar: \n1. Nome do Cliente:\n2. CPF:\n3. Nome do Jogo;\n4. Dias para Devolução\n5.Não alterar nada", "ERRO ao processar, Coloque apenas numeros!");
            switch (alterarLocacao2) {
                case 1 -> {
                    String nome = Util.getString("Digite o novo nome do CLiente:\n");
                    locacaos.get(alterarLocacao1 - 1).cliente.setNome(nome);
                    break;
                }
                case 2 -> {
                    long cpf = Util.getlong("Digite o novo Cpf do Cliente: ", "ERRO ao processar, Coloque apenas numeros!\n");
                    locacaos.get(alterarLocacao1 - 1).cliente.setCpf(cpf);
                    break;
                }
                case 3 -> {
                    String locacaoNomeJogo = Util.getString("Digite o novo nome do jogo:\n");
                    locacaos.get(alterarLocacao1 - 1).jogo.setNome(locacaoNomeJogo);
                    break;
                }
                case 4 -> {
                    int data = Util.getInt("Por favor, digite quantos dias para a devolução da Locação: ", "ERRO ao processar, Coloque apenas numeros!\n");
                    Calendar a = Calendar.getInstance();
                    a.add(Calendar.DATE, data);
                    Date data2 = a.getTime();
                    DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
                    String dataFim = f.format(data2);
                    locacaos.get(alterarLocacao1 - 1).setDataFim(dataFim);
                    break;
                }
                case 5 -> {
                    System.out.println("Saindo Sem alteração. ");
                    break;
                }

                default -> {
                    System.out.println("OPÇÃO INCORRETA!! ");
                }
            }
            System.out.println("Dados Atualizados!");
        } else {
            System.out.println("NÃO FOI POSSÍVEL REALIZAR A ALTERAÇÃO, POR FAVOR ADICIONE LOCAÇÃO");
        }
    }

    public void pagar() {
        for (Locacao locacao : locacaos) {
            int resposta = Util.getInt("Forma de pagamento \n 1.CARTÃO \n 2.PIX \n 3.DINHEIRO ", "ERRO ao processar, Coloque apenas numeros!");

            switch (resposta) {
                case 1, 2, 3 -> {
                    System.out.println("VALOR A SER PAGO: " + locacao.getValor());
                    break;
                }
                default -> {
                    System.out.println("OPÇÃO, NÃO CORRESPONDENTE! ");
                }
            }
        }
    }

}

