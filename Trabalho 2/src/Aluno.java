import java.util.ArrayList;

public class Aluno {

    public String nome;
    public int idade;
    public String curso;
    public String codigo ;
    public double matricula;
    public ArrayList <Disciplina> disciplinas;
    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public double creditos;

    public Aluno(String nome, int idade, String curso, String codigo) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.codigo = codigo;
        this.matricula = creditos * 200;
        this.creditos = creditos;
        this.disciplinas = new ArrayList<>();
    }

        public void matricularDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
        }

}
