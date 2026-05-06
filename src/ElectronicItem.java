public class ElectronicItem extends Product{
    public ElectronicItem(String productId,String storeName,String name, float price){
        super(productId,storeName,name,price);
    }
    public void displayDetails() {
        System.out.println("---Electronic Item ---");
        System.out.println("Price: " + getPrice());
        System.out.println("Price after discount: " + calculatePrice(50));
        System.out.println("Electronic Item details:");
        System.out.println("Product Name: " + getProductName());
    }
}
