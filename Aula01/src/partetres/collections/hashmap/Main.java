package partetres.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Funcionario> funcionarios = new HashMap<>();


        Funcionario funcionario1 = new Funcionario("001", "Ana Banana", 3000.0);
        Funcionario funcionario2 = new Funcionario("002", "Pafúncio Souza", 3500.0);
        Funcionario funcionario3 = new Funcionario("003", "Esmeraldo Pereira", 4000.0);

        funcionarios.put(funcionario1.getId(), funcionario1);
        funcionarios.put(funcionario2.getId(), funcionario2);
        funcionarios.put(funcionario3.getId(), funcionario3);


        System.out.println("Lista de funcionários:");
        for (Map.Entry<String, Funcionario> entry : funcionarios.entrySet()) {
            System.out.println(entry.getValue());
        }


        Funcionario f = funcionarios.get("002");
        if (f != null) {
            f.setSalario(3800.0);
            System.out.println("Novo salário de " + f.getNome() + ": " + f.getSalario());
        }


        funcionarios.remove("003");


        System.out.println("Lista de funcionários após a remoção:");
        for (Map.Entry<String, Funcionario> entry : funcionarios.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}

