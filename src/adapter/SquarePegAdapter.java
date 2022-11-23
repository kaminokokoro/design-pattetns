package adapter;

public class SquarePegAdapter extends RoundPeg{
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        super((int) Math.round(peg.getWidth()*Math.sqrt(2)/2));
        this.peg = peg;
    }
    public int getRadius(){
        return (int) Math.round(peg.getWidth()*Math.sqrt(2)/2);
    }
}
