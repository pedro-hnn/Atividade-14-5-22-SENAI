import java.util.Date;

public class Aluno extends Pessoa{
    String matricula;

    public Aluno(String nome, String cpf, int idade, String sexo, String cidade_nascimento, Date data_nascimento,String matricula) {
        super(nome, cpf, idade, sexo, cidade_nascimento, data_nascimento);
        this.matricula = matricula;
    }



    @Override
    public String toString() {
        return super.toString()+
                "\nAluno{" +
                "matricula='" + matricula + '\'' +
                '}';
    }
}
