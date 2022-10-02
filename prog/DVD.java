package prog;

import java.util.*;

public class DVD extends Produto {
    private int duracao;    
    private float preco_desconto;

    public DVD() {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o tempo de duração do DVD: ");
        this.duracao = leia.nextInt();
    }

    @Override
    public void exibir() {
        System.out.println("===== DADOS DO DVD =====");
        super.exibir();
        System.out.println("Duração: " + this.duracao);

    }

    public void calcularPreco() {
        float preco = getPreco();
        preco_desconto = preco *(25/100);
    }
    
    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
