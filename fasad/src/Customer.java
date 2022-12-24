import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
//покупатель
public class Customer {
    String product;
    Visa card;
    String delieveryData;

    public Customer() {
        card = new Visa();
    }

    public String getProduct() {
        return product;
    }

    void chooseProduct() throws InterruptedException {
        System.out.println("Покупатель выбирает товар");
        ArrayList<String> productsArr = new ArrayList<>();
        productsArr.add("Milk");
        productsArr.add("Eggs");
        productsArr.add("Apple");
        productsArr.add("Banana");

        Random random = new Random();
        product = productsArr.get(random.nextInt(3));
        Thread.sleep(1000);
    };

    void inputData() throws InterruptedException {
        inputCardData();
        inputDiliveryData();
    }
    void inputCardData() throws InterruptedException {
        System.out.println("Введите номер карты");
        Scanner scanner = new Scanner(System.in);
        card.setId(scanner.nextInt());
        Random rand = new Random();
        card.setBalance(rand.nextInt(10000));

    };

    void inputDiliveryData() throws InterruptedException {
        System.out.println("Введите адрес");
        Scanner scanner = new Scanner(System.in);
        delieveryData = scanner.next();
    };
}