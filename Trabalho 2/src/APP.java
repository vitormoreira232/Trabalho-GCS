import java.util.ArrayList;

public class APP {
    public static void main(String[] args) {
        ArrayList <Aluno> alunos = new ArrayList<>();
        ArrayList <Disciplina> disciplinas = new ArrayList<>();

        Aluno a1 = new Aluno("Ana", 20, "Computação", "A001");
        Aluno a2 = new AlunoBolsa ("Bruno", 22, "Computação", "A002");
        Aluno a3 = new Aluno("Carla", 21, "Computação", "A003");
        Aluno a4 = new AlunoBolsa ("Diego", 23, "Computação", "A004");
        Aluno a5 = new Aluno("Eva", 20, "Computação", "A005");
        Aluno a6 = new Aluno("Felipe", 24, "Computação", "A006");

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);
        alunos.add(a5);
        alunos.add(a6);

        Disciplina d1 = new DisciplinaTeorica("MAT200", "Calculo I", 4);
        Disciplina d2 = new DisciplinaTeorica("PROG200", "programação II", 2 );
        Disciplina d3 = new DisciplinaPratica("LAB101", "Laboratório de Programação " , 2);
        Disciplina d4 = new DisciplinaPratica("LAB102", "Laboratório de Redes " , 2);

        disciplinas.add(d1);
        disciplinas.add(d2);
        disciplinas.add(d3);
        disciplinas.add(d4);
        SolicitarMatricula(a1, d2);
        SolicitarMatricula(a1, d1);
        SolicitarMatricula(a2, d1);
        SolicitarMatricula(a3, d2);
        SolicitarMatricula(a4, d2);
        SolicitarMatricula(a5, d1);
        SolicitarMatricula(a3, d1);
        SolicitarMatricula(a4, d3);

        listarAlunos(d1);
        listarAlunos(d2);
        listarAlunos(d3);
        listarDisciplinas(a1);
        listarDisciplinas(a2);
        listarDisciplinas(a3);
        listarDisciplinas(a4);
        listarDisciplinas(a5);
        System.out.println();
        ValorMatricula(a1);
        ValorMatricula(a2);
        ValorMatricula(a3);
        ValorMatricula(a4);
        ValorMatricula(a5);
}


public static void SolicitarMatricula ( Aluno codigo , Disciplina codigo1){

    if (codigo1 instanceof DisciplinaPratica) {
        DisciplinaPratica dp = (DisciplinaPratica) codigo1;
        if (dp.matriculados.size() < dp.capacidadelab) {
            dp.matricularAluno(codigo);
            codigo.matricularDisciplina(codigo1);
            codigo.creditos = codigo.creditos + codigo1.creditos;
            codigo.matricula = codigo.creditos * 200;;

        } else {
            System.out.println("Matricula negada para o aluno " + codigo.getNome() + " na disciplina " + codigo1.getNome() + ": Capacidade do laboratório atingida.");
        }
    } else {
        codigo1.matricularAluno(codigo);
        codigo.matricularDisciplina(codigo1);
        codigo.creditos += codigo1.creditos;
        codigo.matricula = codigo.creditos * 200;
    }
}
public static void listarAlunos(Disciplina disciplina){
    System.out.println("Alunos matriculados na disciplina " + disciplina.getNome() + ":");
    for (Aluno aluno : disciplina.matriculados) {
        System.out.println("- " + aluno.getNome() + " (Código: " + aluno.getCodigo() + ")");
    }
    }

    public static void listarDisciplinas(Aluno aluno){
        System.out.println("Disciplinas do aluno " + aluno.getNome() + ":");
        for (Disciplina disciplina : aluno.disciplinas) {
            System.out.println("- " + disciplina.getNome() + " (Código: " + disciplina.getCodigo() + ")");
        }
    }
    public static void ValorMatricula(Aluno aluno){
        System.out.println("Valor da matricula do aluno " + aluno.getNome() + ": R$" + aluno.matricula);
    }

    public void listarmatriculanegada (Aluno aluno, Disciplina disciplina){
        System.out.println("Matricula negada para o aluno " + aluno.getNome() + " na disciplina " + disciplina.getNome());

    }
}
