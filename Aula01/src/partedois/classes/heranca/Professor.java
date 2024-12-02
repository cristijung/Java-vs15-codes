package partedois.classes.heranca;

public class Professor extends Pessoa {
    //atributos adicionais da classe Professor
    private String formacao;
    private String materias;
    private int nivel;
    private double salario;

    //construtor
    public Professor(String nome, int idade, double altura, String formacao, String materias, int nivel, double salario) {
        super(nome, idade, altura);
        this.formacao = formacao;
        this.materias = materias;
        this.nivel = nivel;
        this.salario = salario;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }



    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("A formação deste professor é: " + formacao);
        System.out.println("A(s) matéria(s) que ele(a) leciona é(são): " + materias);
        System.out.println("O nível deste professor é: " + nivel);
        System.out.println("Com salário de : " + salario);
    }
}
