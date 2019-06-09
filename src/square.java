public class square extends Rectangle {
    private double side =1.0;

    public square(){
    }

    public square(double side){
        super(side,side);
    }

    public  square(String color,boolean filled ,double side){
        super(color,filled,side,side);
    }

    public double getSide(){
        return getWidth();
    }

    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width){
        setWidth(width);
    }

    @Override
    public  void setLength(double length){
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        square square = new square();
        System.out.println(square);

        square = new square(2.3);
        System.out.println(square);

        square = new square( "yellow", true,5.8);
        System.out.println(square);
    }

}
