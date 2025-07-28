package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;

public class CarrinhoDeCompras {

    private List<Item> carrinhoList;

    public CarrinhoDeCompras() {
        this.carrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : carrinhoList){
            if(i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }

        }

        carrinhoList.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double total = 0.0;

        for(Item t: carrinhoList){
            total += t.getPreco() * t.getQuantidade();
        }

        return total;
    }

    public void exibirItens(){
        System.out.println(carrinhoList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Leite", 7.89, 3);
        carrinhoDeCompras.adicionarItem("Nescau", 6.89, 2);
        carrinhoDeCompras.adicionarItem("Leite em pó", 13.59, 8);

        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total do carrinho: R$" + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("Leite em pó");
        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total do carrinho: R$" + carrinhoDeCompras.calcularValorTotal());
    }
}
