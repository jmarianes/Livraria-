package prog;

import java.util.*;

public class Livro extends Produto {
    private String autor;

    public Livro() {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o nome do Autor: ");
        this.autor = leia.nextLine();
    }

    @Override
    public void exibir() {
        System.out.println("===== DADOS DO LIVRO =====");
        super.exibir();
        System.out.println("Autor: " + this.autor);
    }

    public void calcularPreco() {

    }

}
