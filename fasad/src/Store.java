public class Store {
    Bank bank;
    Customer customer;
    Storage storage;
    Delivery delivery;
    Trader trader;

    public Store(){
        bank = new Bank();
        customer = new Customer();
        storage = new Storage();
        delivery = new Delivery();
        trader = new Trader();
    }
    void doSale() throws InterruptedException {
        customer.chooseProduct();
        customer.inputData();

        if(!storage.isProductInStoreHouse(customer.product)){
            System.out.println("Товар отсутствует на складе");
            return;
        }

        if(!bank.checkCardData(customer.card)) {
            System.out.println("Указаны неверные данные карты");
            return;
        }
        if(!bank.checkCardBalance(customer.card)){
            System.out.println("Недостаточно средств на карте");
            return;
        }
        bank.makeTransaction(customer, trader);

        storage.sellProduct(customer.product);
        storage.transferToDelivery();

        delivery.transferToCustomer();
    }
}