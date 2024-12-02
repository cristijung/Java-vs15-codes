package partedois.classes.heranca;

public class Escola {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ana", 16, 1.89, "A111234", "Engenharia");
        Professor proo1 = new Professor("Bia", 45, 1.90, "Matemática", "matemática e física", 7, 6500.00);

        aluno1.mostrarDetalhes();
        proo1.mostrarDetalhes();
    }
}
