/*

Crie uma classe Pessoa com os atributo nome, cpf, idade, data nascimento, sexo, cidade de nascimento, crie uma classe aluno,
que recebe os mesmos parametros da classe Pessoa insira os dados via teclado e mostre os dados das duas classes

*/


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    //adicionar nova pessoa
    //adicionar novo aluno
    //ver todas as pessoas
    //ver todos os alunos

    public static int SelecaoTexto(){
        int selecao;
        while(true){
            try{
                System.out.println("1\t\t=>\t\tCadastrar nova Pessoa\n" +
                        "2\t\t=>\t\tCadastrar nova Aluno\n" +
                        "3\t\t=>\t\tVer todas as Pessoas\n" +
                        "4\t\t=>\t\tVer todos os Alunos\n" +
                        "0\t\t=>\t\tFECHA O PROGRAMA\n\n");

                System.out.print("Digite sua opção: ");
                selecao = new Scanner(System.in).nextInt();

                if (selecao < 0) {
                    System.out.println("\n\nDIGITE UMA OPÇÃO VÁLIDA!\n\n");
                    continue;
                } else if (selecao > 4) {
                    System.out.println("\n\nDIGITE UMA OPÇÃO VÁLIDA!\n\n");
                    continue;
                }else{
                    break;
                }
            } catch (Exception e) {
                System.out.println("\n\nDIGITE UMA OPÇÃO VÁLIDA!\n\n");
                continue;
            }
        }
        return selecao;

    }

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        List<Aluno> alunos = new ArrayList<>();

        String nome, cpf, cidade_nascimento,matricula,sexo;
        int idade;
        Date data_nascimento;
        int dia_nascimento, mes_nascimento,ano_nascimento;

        Boolean run = true;
        while(run){
            int selecionado = SelecaoTexto();

            switch (selecionado) {
                case 1:
                    try {
                        System.out.print("\n\nNome da Pessoa: ");
                        nome = new Scanner(System.in).nextLine();
                        System.out.print("\n\nCPF da Pessoa: ");
                        cpf = new Scanner(System.in).nextLine();
                        System.out.print("\n\nCidade de Nascimento da Pessoa: ");
                        cidade_nascimento = new Scanner(System.in).nextLine();
                        System.out.print("\n\nIdade da Pessoa: ");
                        idade = new Scanner(System.in).nextInt();
                        System.out.print("\n\nSexo da Pessoa: ");
                        sexo = new Scanner(System.in).nextLine();
                        System.out.print("\n\nAno da data de nascimento: ");
                        ano_nascimento = new Scanner(System.in).nextInt();
                        System.out.print("\n\nMês da data de nascimento: ");
                        mes_nascimento = new Scanner(System.in).nextInt();
                        System.out.print("\n\nDia da data de nascimento: ");
                        dia_nascimento = new Scanner(System.in).nextInt();

                        data_nascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dia_nascimento + "/" + mes_nascimento + "/" + ano_nascimento);

                        pessoas.add(new Pessoa(nome, cpf, idade, sexo, cidade_nascimento, data_nascimento));

                        System.out.println("\n\nPESSOA CADASTRADA COM SUCESSO!\n\n");
                    }catch (Exception e){
                        System.out.println("\n\nDIGITE UM VALOR VÁLIDO!\n\n");
                    }
                    continue;

                case 2:
                    try {
                        System.out.print("\n\nNome do Aluno: ");
                        nome = new Scanner(System.in).nextLine();
                        System.out.print("\n\nCPF do Aluno: ");
                        cpf = new Scanner(System.in).nextLine();
                        System.out.print("\n\nCidade de Nascimento do Aluno: ");
                        cidade_nascimento = new Scanner(System.in).nextLine();
                        System.out.print("\n\nIdade do Aluno: ");
                        idade = new Scanner(System.in).nextInt();
                        System.out.print("\n\nSexo do Aluno: ");
                        sexo = new Scanner(System.in).nextLine();
                        System.out.print("\n\nAno da data de nascimento: ");
                        ano_nascimento = new Scanner(System.in).nextInt();
                        System.out.print("\n\nMês da data de nascimento: ");
                        mes_nascimento = new Scanner(System.in).nextInt();
                        System.out.print("\n\nDia da data de nascimento: ");
                        dia_nascimento = new Scanner(System.in).nextInt();
                        System.out.print("\n\nMatricula do aluno: ");
                        matricula = new Scanner(System.in).nextLine();

                        data_nascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dia_nascimento + "/" + mes_nascimento + "/" + ano_nascimento);

                        alunos.add(new Aluno(nome, cpf, idade,sexo,cidade_nascimento,data_nascimento,matricula));

                        System.out.println("\n\nALUNO CADASTRADO COM SUCESSO!\n\n");
                    }catch (Exception e){
                        System.out.println("\n\nDIGITE UM VALOR VÁLIDO!\n\n");
                    }
                    continue;

                case 3:
                    if(!pessoas.isEmpty()){
                        for(Pessoa p :pessoas){
                            System.out.println(p.toString());
                        }
                    }else{
                        System.out.println("\n\nCADASTRE UMA PESSOA ANTES DE RODAR ESSA OPÇÃO!\n\n");
                    }

                    continue;

                case 4:
                    if(!alunos.isEmpty()){
                        for(Aluno a :alunos){
                            System.out.println(a.toString());
                        }
                    }else{
                        System.out.println("\n\nCADASTRE UM ALUNO ANTES DE RODAR ESSA OPÇÃO!\n\n");
                    }

                    continue;

                case 0:
                    run = false;
                    break;
            }
        }
    }
}
