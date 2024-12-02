package partedois.classes.heranca;
//subclasse

public class Aluno extends Pessoa {
    //atributos adicionais da classe Aluno
    private String matricula;
    private String curso;

    public Aluno(String nome, int idade, double altura, String matricula, String curso) {
        super(nome, idade, altura);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //método p mostrar os detalhes do aluno
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();  //chama o método da classe pai
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso:" + curso);
    }

}
