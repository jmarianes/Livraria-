package prog;

import java.util.Scanner;

public class Produto {

    private String titulo;
    private float preco;

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Produto() {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o título do produto: ");
        this.titulo = leia.next();
        System.out.println("Informe o preço do produto: ");
        this.preco = leia.nextFloat();
    }

    public void exibir() {
        System.out.println("Título: " + this.titulo + "\nPreço: " + this.preco);
    }

}
