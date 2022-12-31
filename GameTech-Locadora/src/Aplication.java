import java.text.ParseException;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) throws ParseException {


        Scanner sc = new Scanner(System.in);

        System.out.println("------- Olá Seja bem vindo a Locadora de Jogos -------");
        System.out.println("Digite o Login e a senha pra acessar");
        System.out.println("LOGIN:");
        String login = sc.next();
        System.out.println("SENHA:");
        String senha = sc.next();
        if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {


            Locadora locadora = new Locadora();
            Cliente cliente = new Cliente();
            Locacao locacao = new Locacao();
            Funcionario funcionario = new Funcionario();

            int decisao = 0;


            do {
                System.out.println("------- Olá Seja bem vindo a Locadora de Jogos -------");
                System.out.println("\nDigite a opção que deseja:\n1. Adicionar um jogo\n2. Atualizar dados do Jogo \n3. Ler Jogos\n4. Deletar Jogo \n5. Cadastrar cliente\n6. Atualizar dados do Cliente \n7. Ler Clientes\n8. Deletar Cliente\n9. Adicionar Locação\n10. Atualizar dados da Locação \n11. Ler Locações\n12. Deletar Locação \n13. Adicionar Funcionário\n14. Atualizar dados do Funcionário \n15. Ler Funcionários\n16. Deletar Funcionário \n17. Sair da aplicação");
                decisao = sc.nextInt();

                switch (decisao) {
                    case 1 -> {
                        locadora.adicionarjogo();
                        break;
                    }
                    case 2 -> {
                        locadora.alterarJogo();
                        break;
                    }
                    case 3 -> {
                        int percorrerJogo = Util.getInt("\nInsira a opção que deseja:\n1. Ler todos os Jogos\n2. Ler pelo nome Do Jogo\n3. Sair", "ERRO ao processar, Coloque apenas numeros! \n");
                        switch (percorrerJogo) {
                            case 1 -> {
                                locadora.lerJogos();
                                break;
                            }
                            case 2 -> {
                                String titulo = Util.getString("Informe o Nome:\n");
                                locadora.lerJogos(titulo);
                                break;
                            }
                            case 3 -> {
                                System.out.println("Saindo sem alteração");
                                break;
                            }
                            default -> {
                                System.out.println("Insira um Número Correspondente. ");
                                break;
                            }
                        }
                    }
                    case 4 -> {
                        locadora.deletarJogo();
                        break;
                    }
                    case 5 -> {
                        cliente.adicionarCliente();
                        break;
                    }
                    case 6 -> {
                        cliente.alterarCliente();
                        break;
                    }
                    case 7 -> {
                        int percorrer = Util.getInt("\nInsira a opção que deseja:\n1. Ler todos os Clientes\n2. Ler pelo nome Do Cliente\n3. Sair", "ERRO ao processar, Coloque apenas numeros! \n");
                        switch (percorrer) {
                            case 1 -> {
                                cliente.lerclientes();
                                break;
                            }
                            case 2 -> {
                                long cpfCliente = Util.getlong("Informe o CPF do Cliente:\n", "APENAS NÚMEROS");
                                cliente.lerclientes(cpfCliente);
                                break;
                            }
                            case 3 -> {
                                System.out.println("Saindo sem alterações. :) ");
                                break;
                            }
                            default -> {
                                System.out.println("Insira um Número Correspondente. ");
                                break;
                            }
                        }
                        break;
                    }
                    case 8 -> {
                        cliente.deletarcliente();
                        break;
                    }
                    case 9 -> {
                        locacao.adicionarlocacao();
                        locacao.pagar();
                        break;
                    }
                    case 10 -> {
                        locacao.alterarLocacao();
                        break;
                    }
                    case 11 -> {
                        int percorrer = Util.getInt("\nInsira a opção que deseja:\n1. Ler todas Locações\n2. Ler pelo nome do Jogo\n3. Sair", "ERRO ao processar, Coloque apenas numeros! \n");
                        switch (percorrer) {
                            case 1 -> {
                                locacao.lerLocacoes();
                                break;
                            }
                            case 2 -> {
                                String nomeLoacao = Util.getString("Informe o nome Do Jogo:\n");
                                locacao.lerLocacoes(nomeLoacao);
                                break;
                            }
                            case 3 -> {
                                System.out.println("Saindo sem alteração");
                                break;
                            }
                            default -> {
                                System.out.println("Insira um Número Correspondente. ");
                                break;
                            }
                        }
                        break;
                    }
                    case 12 -> {
                        locacao.deletarlocacao();
                        break;
                    }
                    case 13 -> {
                        funcionario.contratarFuncionario();
                        break;
                    }
                    case 14 -> {
                        funcionario.alterarFuncionario();
                        break;
                    }
                    case 15 -> {
                        int percorrer = Util.getInt("\nInsira a opção que deseja:\n1. Ler todos os Funcionários\n2. Ler pela Id\n3. Sair", "ERRO ao processar, Coloque apenas numeros! \n");
                        switch (percorrer) {
                            case 1 -> {
                                funcionario.lerFuncionarios();
                                break;
                            }
                            case 2 -> {
                                int matricula = Util.getInt("Informe o ID: ", "ERRO ao processar, Coloque apenas numeros! \n");
                                funcionario.lerFuncionarios(matricula);
                                break;
                            }
                            case 3 -> {
                                System.out.println("Saindo sem alteração");
                                break;
                            }
                            default -> {
                                System.out.println("Insira um Número Correspondente. ");
                                break;
                            }
                        }
                        break;
                    }
                    case 16 -> {
                        funcionario.deletarFuncionario();
                        break;
                    }
                    case 17 -> {
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        break;
                    }

                    default -> {
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nDIGITE UM NÚMERO CORRESPONDENTE! ");
                    }
                }
            } while (decisao != 17);
        } else {
            System.out.println("Não foi possivel Acessar a Locadora!\nLIGUE PARA: (11) 4002-8922");
        }
    }
}
