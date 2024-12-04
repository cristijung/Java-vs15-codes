package partetres.collections.linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Funcionario> funcionarios = new LinkedList<>();

        Funcionario funcionario1 = new Funcionario("001", "Esmeraldo Silva", 3000.0);
        Funcionario funcionario2 = new Funcionario("002", "Jacinto Souza", 3500.0);
        Funcionario funcionario3 = new Funcionario("003", "Ana Banana", 4000.0);

        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);


        System.out.println("Lista de funcionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }


        Funcionario f = findFuncionarioById(funcionarios, "002");
        if (f != null) {
            f.setSalario(3800.0);
            System.out.println("Novo salário de " + f.getNome() + ": " + f.getSalario());
        }


        funcionarios.removeIf(funcionario -> funcionario.getId().equals("003"));


        System.out.println("Lista de funcionários após a remoção:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }

    private static Funcionario findFuncionarioById(LinkedList<Funcionario> funcionarios, String id) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId().equals(id)) {
                return funcionario;
            }
        }
        return null;
    }
}

