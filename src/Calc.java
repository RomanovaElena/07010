public class Calc {
    public String calc(int xA, int yA,  int xB, int yB, int xC, int yC, int r){
        Triangle t = new Triangle(xA, yA, xB, yB, xC, yC);
        String s1;
        if(!t.isTriangle()){
            s1 = "Данные точки лежат на одной прямой";
            return s1;
        }

        Circle c = new Circle(r);
        if(c.getR() < 1){
            s1 = "Некорректное значение радиуса";
            return s1;
        }

        if(Math.abs(t.calcRadius() - c.getR()) < 0.001){
            s1 = "Окружность с радиусом " + c.getR() + " можно вписать в треугольник с вершинами ";
            return s1;
        } else {
            s1 = "Окружность с радиусом " + c.getR() + " нельзя вписать в треугольник с вершинами ";
            return s1;
        }
    }
}
