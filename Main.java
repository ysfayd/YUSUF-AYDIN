public class Main {
    public static void main(String[] args) {
        Car car = new Car("RS7", "Audi", 2022, 70000, "Black", 5);

        System.out.println(car.toString());

        car.sell(3);

        System.out.println("Model: " + car.getModel());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: $" + car.getPrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());

        car.setColor("RED");
        car.setPrice(75000);

        System.out.println(car.toString());
    }
}


