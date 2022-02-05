public class Parallelogram extends Quadrangle implements Figure {
    double alpha;
    double beta;

    public Parallelogram(int a, int b, String color, double alpha, double beta) {
        super(a, b, color);
        this.alpha = alpha;
        this.beta = beta;
    }


    @Override
    public double area() {
        return a*getHeight();
    }

    @Override
    public double perimeter() {
        return 2 * (a+b);
    }

    @Override
    double getLargeDiagonal() {
        return a* Math.sqrt(a*a +b*b - 2*a*b*Math.cos(Math.toRadians(beta)));
    }

    @Override
    double getHeight() {
        return a*Math.sin(Math.toRadians(alpha));
    }

    @Override
    String getColor() {
        return color;
    }
}
