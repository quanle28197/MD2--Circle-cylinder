public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3, "red");
        System.out.println(circle);
        System.out.println("Area of a circle: " + circle.getArea());

        Cylinder cylinder = new Cylinder(4,"blue",4);
        System.out.println("Volume of cylinder: " + cylinder.getvolume());

    }
}
