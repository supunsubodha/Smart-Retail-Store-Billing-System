public class FoodItem extends Product implements Billable{
    public FoodItem(String productId, String storeName, String productName, float price){
        super(productId, storeName, productName, price);
    }
    @Override
    public void displayDetails() {

    }
    public void printBill() {

    }
}
