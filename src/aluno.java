public class aluno {
    String nome;
    int matricula;
    double notaav1;
    double notaav2;
    double media;

    public void dados() {
        System.out.println("Nome do aluno: " + nome + " | Matrícula: " + matricula);
    }

    public void verificarAprovacao() {
        System.out.println("Notas: " + notaav1 + ", " + notaav2);
        media = (notaav1 + notaav2) / 2;
        System.out.println("Média: " + media);
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
