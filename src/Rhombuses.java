public class Rhombuses extends Quadrangle implements Figure {
    double alpha, beta;

    public Rhombuses(int a, double alpha, double beta, String color ) {
        super(a, a, color);
        this.alpha = alpha;
        this.beta = beta;
    }


    @Override
    double getLargeDiagonal() {
        return a * Math.sqrt(2 + 2 * Math.cos(Math.toRadians(alpha)));
    }

    @Override
    double getHeight() {
        return a * Math.sin(Math.toRadians(alpha));
    }

    @Override
    String getColor() {
        return color;
    }

    @Override
    public double area() {
        return a * getHeight();
    }

    @Override
    public double perimeter() {
        return 4 * a;
    }
}
