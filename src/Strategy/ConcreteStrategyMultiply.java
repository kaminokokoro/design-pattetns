package Strategy;

public class ConcreteStrategyMultiply implements Strategy{
    @Override
    public double execute(double a, double b) {
        return a*b;
    }
}
