public class Triangle {
    public Coord a;
    public Coord b;
    public Coord c;

    public Triangle() {
        a = new Coord("A");
        b = new Coord("B");
        c = new Coord("C");
    }

    public boolean isTriangle(){
        if((a.getX() - b.getX())*(a.getY() - c.getY()) == (a.getX() - c.getX())*(a.getY() - b.getY()) ||
                (a.getX() == b.getX() && b.getX() == c.getX()) ||
                (a.getY() == b.getY() && b.getY() == c.getY())){
            return false;
        }
        return true;
    }

    public double calcAb() {
        return Math.sqrt(
                Math.pow(b.getX() - a.getX(), 2) +
                        Math.pow(b.getY() - a.getY(), 2)
        );
    }

    public double calcBc() {
        return Math.sqrt(
                Math.pow(c.getX() - b.getX(), 2) +
                        Math.pow(c.getY() - b.getY(), 2)
        );
    }

    public double calcAc() {
        return Math.sqrt(
                Math.pow(c.getX() - a.getX(), 2) +
                        Math.pow(c.getY() - a.getY(), 2)
        );
    }

    public double calcPerimeter() {
        return calcAb() + calcBc() + calcAc();
    }

    public double calcArea() {
        double p = calcPerimeter() / 2;
        return Math.sqrt(
                p * (p-calcAb()) * (p - calcBc()) * (p - calcAc())
        );
    }

    public double calcRadius() {
        double rc = calcAb() * calcBc() * calcAc()/(4 * calcArea());
        return rc;
    }

    public void printT(){
        System.out.print(a.getName() + "(" + a.getX() + ", " + a.getY() + "); ");
        System.out.print(b.getName() + "(" + b.getX() + ", " + b.getY() + "); ");
        System.out.print(c.getName() + "(" + c.getX() + ", " + c.getY() + ")");
    }
}