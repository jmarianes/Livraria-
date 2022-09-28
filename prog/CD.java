package prog;

import java.util.*;

public class CD extends Produto {
    private int numero_faixa;

    public CD() {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o número de faixas do CD: ");
        this.numero_faixa = leia.nextInt();
    }

    @Override
    public void exibir() {
        System.out.println("===== DADOS DO CD =====");
        super.exibir();
        System.out.println("Autor: " + this.numero_faixa);
    }

    public void calcularPreco() {

    }

}
