package prog;

import java.util.*;

public class Menu {
    private Scanner leia;
    private ArrayList<Produto> produtos = new ArrayList<>();
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<CD> cds = new ArrayList<>();
    private ArrayList<DVD> dvds = new ArrayList<>();
    private int op = 0;

    Menu() {
        leia = new Scanner(System.in);
        while (op != 7) {
            System.out.println("\n======================= M E N U =======================");
            System.out.println("1 - Cadastrar produtos");
            System.out.println("2 - Consultar produtos");
            System.out.println("3 - Exibir produtos");
            System.out.println("4 - Exibir os valores dos produtos");
            System.out.println("5 - Atualizar um produto");
            System.out.println("6 - Excluir produto ");
            System.out.println("7 - Sair");
            System.out.println("========================================================");
            System.out.println("Digite o número que corresponde ao que você deseja:");
            op = leia.nextInt();
            System.out.println("========================================================");

            switch (op) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    consultarProdutos();
                    break;
                case 3:
                    exibirProdutos();
                    break;
                case 4:
                    exibirValores();
                    break;
                case 5:
                    atualizarProduto();
                    break;
                case 6:
                    excluirProduto();
                    break;
                case 7:
                    System.out.println("Saindo do sistema...");
                    break;
            }
        }

    }

    private void cadastrarProduto() {
        Scanner leia = new Scanner(System.in);
        int x = 0;
        System.out.println("O que você deseja cadastrar? ");
        System.out.println("1 - Livro ");
        System.out.println("2 - CD ");
        System.out.println("3 - DVD ");
        x = leia.nextInt();

        if (x == 1) {
            Livro livro = new Livro();
            livros.add(livro);
        } else if (x == 2) {
            CD cd = new CD();
            cds.add(cd);
        } else if (x == 3) {
            DVD dvd = new DVD();
            dvds.add(dvd);
        }

        System.out.println("==============================");
        System.out.println("Produto cadastrado com sucesso!");
        System.out.println("==============================");
    }

    private void consultarProdutos() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o título do livro:");
        String tituloConsulta = leia.nextLine();
        System.out.println("Digite o nome do autor:");
        String nomeConsulta = leia.nextLine();

        for (int i = 0; i < livros.size(); i++) {
            if (tituloConsulta.equalsIgnoreCase(livros.get(i).getTitulo())) {
                System.out.println("LIVRO ENCONTRADO!");
                livros.get(i).exibir();
            }
        }
    }

    private void exibirProdutos() {
        System.out.println("======== EXIBINDO OS PRODUTOS  ========");
        System.out.println("----------> LIVROS <----------");
        for (int i = 0; i < livros.size(); i++) {
            livros.get(i).exibir();
        }
        System.out.println("-----------> DVDS <-----------");
        for (int i = 0; i < dvds.size(); i++) {
            dvds.get(i).exibir();
        }
        System.out.println("-----------> CDS <-----------");
        for (int i = 0; i < cds.size(); i++) {
            cds.get(i).exibir();
        }
        System.out.println("===================================================");
    }

    private void exibirValores() {

    }

    private void atualizarProduto() {
        Scanner leia = new Scanner(System.in);
        Scanner leiaNum = new Scanner(System.in);
   
           System.out.println("\nDigite o título do livro:");
           String tituloProcurar = leia.nextLine();
   
               for(int i = 0; i < livros.size(); i++){
                 if(tituloProcurar.equalsIgnoreCase(livros.get(i).getTitulo())){
                   System.out.println("Informe o nome do novo autor:");
                   String novoAutor = leia.nextLine();
                   livros.get(i).setAutor(novoAutor);
                 }
               } 
   
               for(int i = 0; i < dvds.size(); i++){
                 if(tituloProcurar.equalsIgnoreCase(dvds.get(i).getTitulo())){
                   System.out.println("Informe a nova duração:");
                   int newDuracao = leia.nextInt();
                   dvds.get(i).setDuracao(newDuracao);
                 }
               } 
   
               for(int i = 0; i < cds.size(); i++){
                 if(tituloProcurar.equalsIgnoreCase(cds.get(i).getTitulo())){
                   System.out.println("Informe o novo número de faixas:");
                   int newNumeroFaixas = leia.nextInt();
                   cds.get(i).setNumero_faixa(i);(newNumeroFaixas);
                 }
               }
    }

    private void excluirProduto() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o título do produto que deve ser removido: ");
        String tituloConsultar = leia.nextLine();

        for (int i = 0; i < livros.size(); i++) {
            if (tituloConsultar.equalsIgnoreCase(livros.get(i).getTitulo())) {
                livros.remove(i);
            }
        }

        for (int i = 0; i < dvds.size(); i++) {
            if (tituloConsultar.equalsIgnoreCase(dvds.get(i).getTitulo())) {
                dvds.remove(i);
            }
        }

        for (int i = 0; i < cds.size(); i++) {
            if (tituloConsultar.equalsIgnoreCase(cds.get(i).getTitulo())) {
                cds.remove(i);
            }
        }
    }

}
