package parteum.aula02.Task02;

import java.util.Scanner;

public class ClinicaDePets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int CAPACIDADE = 100;
        String[] nomes = new String[CAPACIDADE];
        String[] tipos = new String[CAPACIDADE];
        int contador = 0;

        while (true) {
            System.out.println("Menu de Opções:");
            System.out.println("1. Inserir novo pet");
            System.out.println("2. Exibir todos os pets");
            System.out.println("3. Buscar pet pelo nome");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            if (opcao == 1) {
                if (contador < CAPACIDADE) {
                    System.out.print("Digite o nome do pet: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o tipo do pet: ");
                    String tipo = scanner.nextLine();
                    nomes[contador] = nome;
                    tipos[contador] = tipo;
                    contador++;
                    System.out.println("Pet inserido com sucesso!");
                } else {
                    System.out.println("Capacidade máxima atingida!");
                }
            } else if (opcao == 2) {
                System.out.println("Lista de Pets:");
                for (int i = 0; i < contador; i++) {
                    System.out.println("Nome: " + nomes[i] + ", Tipo: " + tipos[i]);
                }
            } else if (opcao == 3) {
                System.out.print("Digite o nome do pet a ser buscado: ");
                String nomeBuscado = scanner.nextLine();
                boolean encontrado = false;
                for (int i = 0; i < contador; i++) {
                    if (nomes[i].equalsIgnoreCase(nomeBuscado)) {
                        System.out.println("Pet encontrado! Tipo: " + tipos[i]);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Pet não encontrado!");
                }
            } else if (opcao == 4) {
                System.out.println("Saindo do sistema...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}

