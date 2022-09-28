package prog;

import java.util.*;

public class DVD extends Produto {
    private int duracao;

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
}
