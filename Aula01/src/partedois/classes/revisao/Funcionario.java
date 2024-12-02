package partedois.classes.revisao;

public class Funcionario {
    //atributos
    public String nome;
    protected double salarioBase;
    private final double valeRefeicao;

    //construtor
    public Funcionario(String nome, double salarioBase, double valeRefeicao) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.valeRefeicao = valeRefeicao;
    }

    //métodos acessores
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double novoSalario) {
        if (novoSalario > 0) {
            this.salarioBase = novoSalario;
        } else {
            System.out.println("Salário Base inválido");
        }
    }

    //métodos específicos
    public double calcularSalarioBruto() {
        return salarioBase + valeRefeicao;
    }

    public double calcularFerias() {
        return  salarioBase * (1 + (1.0/3));
    }

    public double calcularDecimoTerceiro(int mesesTrabalhados) {
        if (mesesTrabalhados > 0 && mesesTrabalhados <= 12) {
            return (salarioBase /12) * mesesTrabalhados;
        } else {
            System.out.println("Referência inválida");
            return 0;
        }
    }

}
