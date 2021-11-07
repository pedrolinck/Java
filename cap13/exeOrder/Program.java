package cap13.exeOrder;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        System.out.println();
        
        Client c = new Client(name, email, birthDate);
        
        
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        
        Order order = new Order(new Date(), status,c);
        
        System.out.print("How many items to this order? ");
        int item = sc.nextInt();
        for(int i = 1; i<=item; i++){
            System.out.println("Enter #"+ i +" item data:");
            sc.nextLine();
            System.out.print("Product name: ");
            String pName = sc.nextLine();
            System.out.print("Product price: ");
            double pPrice = sc.nextDouble();
            
            Product product = new Product(pName, pPrice);
            
            System.out.print("Quantity: ");
            int quan = sc.nextInt();
            System.out.println();

            OrderItem it = new OrderItem(quan, pPrice,product);
            order.addItem(it);

        }
        System.out.println();
        System.out.println(order);

        sc.close();
    }
}
