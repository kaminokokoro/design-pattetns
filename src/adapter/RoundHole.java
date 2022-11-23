package adapter;

public class RoundHole {
    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    public boolean fits(RoundPeg peg){
        if (peg.getRadius()<=this.getRadius()){
            return true;
        }
        return false;
    }
}
