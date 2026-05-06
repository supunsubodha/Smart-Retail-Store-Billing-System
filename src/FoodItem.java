public class FoodItem extends Product implements Billable{
    public FoodItem(String productId, String storeName, String productName, float price){
        super(productId, storeName, productName, price);
    }
    @Override
    public void displayDetails() {

    }
    public void printBill() {
        System.out.println("---- Food Item ----");
        System.out.println("Price: " + getPrice());
        System.out.println("Price after discount: " + calculatePrice(50));
        System.out.println("Food Item Details:");
        System.out.println("Product Name: "+ getProductName());
        System.out.println("Bill printed successfully.");
    }
}
