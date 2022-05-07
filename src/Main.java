public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);

        System.out.println(square.getSide());
        System.out.println(square.getField());
        System.out.println(square.getCircuit());

        square.setSide(7);

        System.out.println(square.getSide());
        System.out.println(square.getField());
        System.out.println(square.getCircuit());

        square.setCircuit(17);

        /*final int a;
        a = 6;
        System.out.println("----------------------");
        final Square s = new Square(8);
        System.out.println(s.getSide());
        System.out.println(s.getField());
        System.out.println(s.getCircuit());

        s.setSide(10);

        System.out.println(s.getSide());
        System.out.println(s.getField());
        System.out.println(s.getCircuit());

        s = new Square(15);*/
    }
}
