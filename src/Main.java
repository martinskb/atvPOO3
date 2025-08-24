public class Main {
    public static void main(String[] args) {
        aluno aluno1 = new aluno();
        aluno aluno2 = new aluno();

        aluno1.nome = "Gabriel Barbosa";
        aluno1.matricula = 101;
        aluno1.notaav1 = 5;
        aluno1.notaav2 = 7;

        aluno2.nome = "Giorgian De Arrascaeta";
        aluno2.matricula = 102;
        aluno2.notaav1 = 9;
        aluno2.notaav2 = 9;

        aluno1.dados();
        aluno1.verificarAprovacao();

        aluno2.dados();
        aluno2.notaav1 = 10;
        aluno2.verificarAprovacao();
    }
}
