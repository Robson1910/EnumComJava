package io.github.robson;

import io.github.robson.Enum.OrdemStatus;
import io.github.robson.Model.Compra;

public class Main {
    public static void main(String[] args) {

        Compra compra1 = new Compra("TV",1.572, OrdemStatus.PAGAMENTO_CANCELADO);
        Compra compra2 = new Compra("NoteBook",1.255, OrdemStatus.PAGAMENTO_CONFIRMADO);
        Compra compra3 = new Compra("Celular",1.405, OrdemStatus.PROCESSANDO_PAGAMENTO);

        System.out.println(compra1);
        System.out.println(compra2);
        System.out.println(compra3);
    }
}