import java.util.ArrayList;

public abstract class Disciplina {
    public String codigo;
    public String nome;
    public int creditos;
    public ArrayList<Aluno> matriculados;

    public Disciplina(String codigo, String nome, int creditos) {
        this.codigo = codigo;
        this.nome = nome;
        this.creditos = creditos;
        this.matriculados = new ArrayList<>();

    }

   public void matricularAluno(Aluno aluno) {
        matriculados.add(aluno);
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }
}
