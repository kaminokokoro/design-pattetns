package adapter;

public class TestAdapter {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        System.out.println(hole.fits(roundPeg));

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);

//        System.out.println(hole.fits(smallSquarePeg));

        SquarePegAdapter smallSquareAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquareAdapter = new SquarePegAdapter(largeSquarePeg);

        System.out.println(hole.fits(smallSquareAdapter));
        System.out.println(hole.fits(largeSquareAdapter));

    }
}
