//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FoodItem fd1 = new FoodItem("P101", "Carils","Bread",5000.00f);
        ElectronicItem e1 = new ElectronicItem("P202", "Singer", "Electric Kettle", 5000);

        fd1.calculatePrice();
        fd1.calculatePrice(50);
        fd1.displayDetails();
        fd1.printBill();
        System.out.println();

        e1.calculatePrice();
        e1.calculatePrice(50);
        e1.displayDetails();

    }
}