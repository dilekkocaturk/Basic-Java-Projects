import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer ahmet = new Customer(1, "Ahmet", "Yıldız");
        customers.add(ahmet);
        customers.add(new Customer(2, "Mehmet", "Yıldız"));

        customers.remove(ahmet);
        for (Customer customer : customers) {
            System.out.println(customer.firstName);
        }

    }
}