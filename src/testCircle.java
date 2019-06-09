public class testCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle( "indigo", false ,3.5);
        System.out.println(circle);

        Comparator comparator = new Circle();

        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle( "indigo", false,3.5);

        System.out.println("Pre-sorted:");
        for (int i=0;i<circles.length;i++) {
            System.out.println(circles[i].getRadius());
        }

        System.out.println("compare: ");
        System.out.println( comparator.compare(circles[0],circles[1]));


    }
}
