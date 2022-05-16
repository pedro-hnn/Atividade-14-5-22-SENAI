import java.util.Date;

public class Pessoa {

    private String nome;
    private String cpf;
    private int idade;
    private String sexo;
    private String cidade_nascimento;
    private Date data_nascimento;

    public Pessoa(String nome, String cpf, int idade, String sexo, String cidade_nascimento, Date data_nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.cidade_nascimento = cidade_nascimento;
        this.data_nascimento = data_nascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", cidade_nascimento='" + cidade_nascimento + '\'' +
                ", data_nascimento=" + data_nascimento +
                '}';
    }
}
