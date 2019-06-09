public class testsquare {

    public static void main(String[] args) {
        square square = new square();
        System.out.println(square);

        square = new square(2.3);
        System.out.println(square);

        square = new square( "yellow", true,5.8);
        System.out.println(square);
    }
}
