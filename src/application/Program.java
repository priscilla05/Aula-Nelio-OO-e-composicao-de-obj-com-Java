package application;


import model.entities.Client;
import model.entities.OrderItem;
import model.entities.Product;
import model.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(scanner.next());

        Client client = new Client(name,email, birthDate);
        System.out.println(client);

        System.out.println("Enter order data: ");
        System.out.println("Status: ");
        OrderStatus status= OrderStatus.valueOf(scanner.next()); // o valueOf converte uma
        //String para o valor correspondente definido no OrderStatus (nesse caso PROCESSING)

        entities.Order order = new entities.Order(new Date(), status, client); //aqui instanciei na memoria o
        //objeto Order associado ao client)

        System.out.println("How many items to this order?");
        int N = scanner.nextInt();
        for (int i =0; i<N; i++){
            System.out.println("Enter #"+ (i +1)+ "item data");

            System.out.print("Product name: ");
            scanner.nextLine();
            String productName = scanner.nextLine();
            System.out.print("Product price: ");
            double productPrice = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            Product product = new Product(productName, productPrice);//instanciando Product

            OrderItem item = new OrderItem(quantity, productPrice, product);//criei na memoria um obj
            //OrdemItem e associei a product

            order.addItem(item);
        }

        System.out.println();
        System.out.println(order);
        scanner.close();

    }
}
