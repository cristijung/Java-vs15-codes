package partetres.collections.treemap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        TreeMap<String, Aluno> alunos = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Atualizar nota do aluno");
            System.out.println("3. Remover aluno");
            System.out.println("4. Listar todos os alunos");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a matrícula do aluno: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Digite o nome do aluno: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a nota do aluno: ");
                    double nota = scanner.nextDouble();
                    scanner.nextLine();

                    Aluno novoAluno = new Aluno(matricula, nome, nota);
                    alunos.put(novoAluno.getMatricula(), novoAluno);
                    System.out.println("Aluno adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite a matrícula do aluno: ");
                    matricula = scanner.nextLine();
                    Aluno aluno = alunos.get(matricula);
                    if (aluno != null) {
                        System.out.print("Digite a nova nota do aluno: ");
                        nota = scanner.nextDouble();
                        scanner.nextLine();
                        aluno.setNota(nota);
                        System.out.println("Nota atualizada com sucesso!");
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite a matrícula do aluno: ");
                    matricula = scanner.nextLine();
                    alunos.remove(matricula);
                    System.out.println("Aluno removido com sucesso!");
                    break;

                case 4:
                    System.out.println("Lista de alunos:");
                    for (Map.Entry<String, Aluno> entry : alunos.entrySet()) {
                        System.out.println(entry.getValue());
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

