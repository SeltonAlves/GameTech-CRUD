
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cliente extends Pessoa {

    Scanner sc = new Scanner(System.in);

    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public Cliente(){}
    public Cliente(String nome, int idade, long cpf, int telefone, String email, Endereco endereco) {
        super(nome, idade, cpf, telefone, email, endereco);
    }

    public Cliente(String nome,long cpf) {
        super(nome,cpf);
    }


    public void adicionarCliente() {
        String nomeCliente = Util.getString("Digite o nome do cliente:\n");
        int idadeCliente = Util.getInt("Digite a idade do cliente: ", "ERRO ao processar, Coloque apenas numeros! ");
        long cpfCliente = Util.getlong("Digite o Cpf do cliente: ", "ERRO ao processar, Coloque apenas numeros! ");
        int telefoneCliente = Util.getInt("Digite o telefone do cliente: ", "ERRO ao processar, Coloque apenas numeros!");
        String emailCliente = Util.getString("Digite o Email do cliente:\n");

        System.out.println("\n Digite o Endereço do Cliente : ");
        String ruaCliente = Util.getString("RUA:\n");
        int numerocliente = Util.getInt("NÚMERO", "ERRO ao processar, Coloque apenas numeros!");
        String bairroCliente = Util.getString("BAIRRO:\n");
        String cidadeCliente = Util.getString("CIDADE:\n");
        String estadoCliente = Util.getString("ESTADO:\n");
        String complementoCliente = Util.getString("COMPLEMENTO:\n");
        int cepCliente = Util.getInt("CEP", "ERRO ao processar, Coloque apenas numeros! ");

        Endereco end = new Endereco(ruaCliente, numerocliente, bairroCliente,cidadeCliente,estadoCliente,complementoCliente,cepCliente);

        
        Cliente cliente = new Cliente(nomeCliente , idadeCliente , cpfCliente, telefoneCliente ,emailCliente,end);


        clientes.add(cliente);
        System.out.println("Cliente adicionado com Sucesso! ");
    }

    public void deletarcliente() {
        if (!clientes.isEmpty()) {
            int deleteCliente = Util.getInt("Você deseja deletar um cliente! \n Digite a posição do cliente:", "ERRO ao processar, Coloque apenas numeros! \n");
            clientes.remove((deleteCliente) - 1);
            System.out.println("Cliente Deletado!");
        } else {
            System.out.println("IMPOSSÍVEL DELETAR, ADICIONE UM CLIENTE. ");
        }

    }

    public Cliente lerclientes(long cpf) {
        if (!clientes.isEmpty()) {
            for (Cliente cliente : clientes) {
                if (cliente.getCpf().equals(cpf)) {
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("Posição: " + (clientes.indexOf(cliente) + 1));
                    System.out.println("INFORMAÇÕES DO CLIENTE: ");
                    System.out.println("Nome: " + cliente.getNome());
                    System.out.println("Idade: " + cliente.getIdade() + " ANOS.");
                    System.out.println("CPF: " + cliente.getCpf());
                    System.out.println("Telefone: " + cliente.getTelefone());
                    System.out.println("Email: " + cliente.getEmail() + "\n");
                    System.out.println("ENDEREÇO ABAIXO:");
                    System.out.println("Rua: " + cliente.getEndereco().getRua());


                    System.out.println("Número da Casa: " + cliente.getEndereco().getNumero());
                    System.out.println("Bairro: " + cliente.getEndereco().getBairro());
                    System.out.println("Cidade: " + cliente.getEndereco().getCidade());
                    System.out.println("Estado: " + cliente.getEndereco().getEstado());
                    System.out.println("Complemento: " + cliente.getEndereco().getComplemento());
                    System.out.println("Cep: " + cliente.getEndereco().getCep());
                    System.out.println("--------------------------------------------------------------------------------------------");
                }else {
                    System.out.println("O NOME DO CLIENTE ESTÁ INCORRETO , TENTE NOVAMENTE");
                }
            }
        } else {
            System.out.println("NÃO EXISTE, NENHUM CLIENTE! ");
        }
        return null;
    }


    public void lerclientes() {
        if (!clientes.isEmpty()) {
            for (Cliente cliente : clientes) {
                System.out.println("--------------------------------------------------------------------------------------------");
                System.out.println("Posição: " + (clientes.indexOf(cliente) + 1));
                System.out.println("INFORMAÇÕES DO CLIENTE: ");
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("Idade: " + cliente.getIdade() + " ANOS.");
                System.out.println("CPF: " + cliente.getCpf());
                System.out.println("Telefone: " + cliente.getTelefone());
                System.out.println("Email: " + cliente.getEmail() + "\n");
                System.out.println("ENDEREÇO ABAIXO:");
                System.out.println("Rua: " + cliente.getEndereco().getRua());


                System.out.println("Número da Casa: " + cliente.getEndereco().getNumero());
                System.out.println("Bairro: " + cliente.getEndereco().getBairro());
                System.out.println("Cidade: " + cliente.getEndereco().getCidade());
                System.out.println("Estado: " + cliente.getEndereco().getEstado());
                System.out.println("Complemento: " + cliente.getEndereco().getComplemento());
                System.out.println("Cep: " + cliente.getEndereco().getCep());
                System.out.println("--------------------------------------------------------------------------------------------");
            }
        } else {
            System.out.println("NÃO EXISTE, NENHUM CLIENTE! ");
        }
    }

    public void alterarCliente() {
        if (!clientes.isEmpty()) {
            int alterarcliente1 = Util.getInt("Você deseja alterar dados do Cliente!\nPor favor, digite a posição: ", "ERRO ao processar, Coloque apenas numeros!");
            int alterarcliente2 = Util.getInt("Selecione o que deseja alterar: \n1. Nome do Cliente;\n2. Idade;\n3. CPF;\n4. Telefone\n5. Email\n6.Não alterar nada", "ERRO ao processar, Coloque apenas numeros!");
            switch (alterarcliente2) {
                case 1 -> {
                    String nome = Util.getString("Digite o novo nome do cliente:\n");
                    clientes.get(alterarcliente1 - 1).setNome(nome);
                    break;
                }
                case 2 -> {
                    int idade = Util.getInt("Digite a nova idade do Cliente: ", "ERRO ao processar, Coloque apenas numeros!");
                    clientes.get(alterarcliente1 - 1).setIdade(idade);
                    break;
                }
                case 3 -> {
                    long cpf = Util.getlong("Digite o novo Cpf do Cliente: ", "ERRO ao processar, Coloque apenas numeros!");
                    clientes.get(alterarcliente1 - 1).setCpf(cpf);
                    break;
                }
                case 4 -> {
                    int telefone = Util.getInt("Digite o novo telefone do Cliente: ", "ERRO ao processar, Coloque apenas numeros!");
                    clientes.get(alterarcliente1 - 1).setTelefone(telefone);
                    break;
                }
                case 5 -> {
                    String email = Util.getString("Digite o Email do cliente:\n");
                    clientes.get(alterarcliente1 - 1).setEmail(email);
                    break;
                }
                case 6 -> {
                    System.out.println("Não haverá alteração em nada, você retornará ao menu inicial!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    break;
                }
                default -> {
                    System.out.println("DIGITE UM NÚMERO CORRESPONDENTE!! ");
                }
            }
            System.out.println("Dados Atualizados!");
        } else {
            System.out.println("NÃO EXISTE NENHUM CLIENTE, SEM POSSIBILIDADE DE ALTERAÇÃO! ");
        }
    }
}
