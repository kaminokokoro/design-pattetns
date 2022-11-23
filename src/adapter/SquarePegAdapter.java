package adapter;

public class SquarePegAdapter extends RoundPeg{
    private SquarePeg peg;

    public SquarePegAdapter(int radius, SquarePeg peg) {
        super(radius);
        this.peg = peg;
    }
    public int getRadius(){
        return (int) Math.round(peg.getWidth()*Math.sqrt(2)/2);
    }
}
