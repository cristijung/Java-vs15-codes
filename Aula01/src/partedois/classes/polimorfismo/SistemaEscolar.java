package partedois.classes.polimorfismo;

public class SistemaEscolar {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Ana", 34, 1.80);
        Aluno aluno = new Aluno("Bia", 20, 1.80, "As1234", "ADS");
        Professor professor = new Professor("Pafúncio", 45, 156, "TI");

            Pessoa[] pessoas = {pessoa, aluno, professor};

            for (Pessoa p : pessoas) {
                p.mostrarDetalhes();
                System.out.println();
            }
    }
}
