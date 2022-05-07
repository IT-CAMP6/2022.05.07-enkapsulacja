public class Square {
    private int side;
    private int field;
    private int circuit;

    public Square(int side) {
        this.side = side;
        this.field = side * side;
        this.circuit = 4 * side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
        this.field = side * side;
        this.circuit = 4 * side;
    }

    public int getField() {
        return field;
    }

    public int getCircuit() {
        return circuit;
    }

    public void setCircuit(int circuit) {
        this.circuit = circuit;
        //??
        //??

        //??
        //??
    }
}
