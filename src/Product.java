public abstract class Product {
    final String productID;
    final String storeName;
    private String productName;
    private float price;

    Product(String productID, String storeName,String productName, float price) {
        this.productID = productID;
        this.storeName = storeName;
        this.price = price;
        this.productName = productName;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public float getPrice() {
        return price;
    }
    abstract void displayDetails();

    float calculatePrice() {
        return price;
    }

    float calculatePrice(float discount) {
        return price-((price/100) * discount);
    }


}
