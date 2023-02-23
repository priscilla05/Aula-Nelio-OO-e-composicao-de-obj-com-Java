package model.entities;
/*Implementar um programa de console conforme enunciado:
Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar
um sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido
 deve ser o instante do sistema*/


public class Product {

    private String name;
    private double price;

    public Product(){

    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
