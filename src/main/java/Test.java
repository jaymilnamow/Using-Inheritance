public class Test {

    public static void main(String[] args) {
        Car g35 = new Car();
        g35.color = "Black";
        g35.speed = 155;
        g35.size = 3500;
        g35.gears = 6;
        g35.hp = 299;
        g35.attributesCar();

        System.out.println("\n");

        g35.attributes();
    }
}
