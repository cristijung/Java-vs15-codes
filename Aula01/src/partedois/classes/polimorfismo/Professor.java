package partedois.classes.polimorfismo;

public class Professor extends Pessoa {
    private String departamento;

    public Professor(String nome, int idade, double altura, String departamento) {
        super(nome, idade, altura);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Departamento: " + departamento);
    }
}
