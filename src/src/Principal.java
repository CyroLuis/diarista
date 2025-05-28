import Model.Diarista;
import repository.DiaristaRepository;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       var repository = new DiaristaRepository();
       var opcao = "q";
        do {
            exibirMenu();
            opcao = scanner.nextLine();
            System.out.println("opção selecionada " + opcao);
            switch (opcao){
                case "1" -> listarDiaristas(repository);
                case "2" -> cadastrarDiaristas(scanner,repository);
            }
        } while (!opcao.equals("q"));

       scanner.close();

    }

    private static void cadastrarDiaristas(Scanner scanner, DiaristaRepository repository) {
        System.out.print("Nome: ");
        var nome = scanner.nextLine();
        System.out.print("Telefone: ");
        var telefone = scanner.nextLine();
        System.out.print("CPF: ");
        var cpf = scanner.nextLine();
        System.out.print("Endereço: ");
        var endereco = scanner.nextLine();

        var diarista = new Diarista(nome,telefone,cpf,endereco);

        repository.cadastrar(diarista);
    }

    private static void listarDiaristas(DiaristaRepository repository) {
        var diaristas = repository.buscarTodos();
        for (Diarista d: diaristas){
            System.out.println(d.getId() + " - " + d.getNome());
        }
    }

    private static void exibirMenu(){
        System.out.println("Escolha uma Opção!!");
        System.out.println("1- Listar Diaristas");
        System.out.println("2- Cadastrar Diaristas");
        System.out.println("3- Buscar Diaristas");
        System.out.println("4- Excluir Diaristas");
        System.out.println("q- Sair do Sistema");
    }
}
