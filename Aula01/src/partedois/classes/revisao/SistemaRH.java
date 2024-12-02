package partedois.classes.revisao;

import java.text.DecimalFormat;

public class SistemaRH {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Ana Banana", 4578.98, 1200);

        System.out.println("Nome: " + funcionario.nome);
        DecimalFormat df = new DecimalFormat("#,##0.00"); //criando um obj para decimal format - para tratar o valor de saída

        funcionario.setSalarioBase(6578.98);
        System.out.println("Novo Salário Bruto: R$ " + df.format(funcionario.calcularSalarioBruto()));
        System.out.println("Férias: R$ " + df.format(funcionario.calcularFerias()));
        System.out.println("Décimo Terceiro salário: R$ " + df.format(funcionario.calcularDecimoTerceiro(12)));
    }
}
