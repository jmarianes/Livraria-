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
                    Scanner leia = new Scanner (System.in);
                    int x = 0;
                    System.out.println("O que você deseja cadastrar? ");
                    System.out.println("1 - Livro ");
                    System.out.println("2 - CD ");
                    System.out.println("3 - DVD ");
                    x = leia.nextInt();

                    if (x == 1){
                        Livro livro = new Livro();
                        livros.add(livro);
                    }
                    if (x == 2){
                        CD cd = new CD();
                        cds.add(cd);
                    }
                    if (x == 3){
                        DVD dvd = new DVD();
                        dvds.add(dvd);
                    }
                    System.out.println("==============================");
                    System.out.println("Produto cadastrado com sucesso! ");
                    System.out.println("==============================");    
            

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
        produtos.add(new Produto());
        System.out.println("==============================");
        System.out.println("Produto cadastrado com sucesso! ");
        System.out.println("==============================");
    }

    private void consultarProdutos() {
    }

    private void exibirProdutos() {
    }

    private void exibirValores() {
    }

    private void atualizarProduto() {
    }

    private void excluirProduto() {
    }


}
