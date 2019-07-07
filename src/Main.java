public class Main {
    public static void main(String[] args){
        // Данные для проверки: (0, 0); (0, 12); (16, 0); 10
        System.out.println ("Программа проверяет, можно ли вписать в тругольник с заданными координатами вершин A, B и С окружность радиуса R.");
        Triangle t = new Triangle();
        if(!t.isTriangle()){
            System.out.println("Данные точки лежат на одной прямой");
            return;
        }

        Circle c = new Circle();
        if(c.getR() < 1){
            System.out.println("Некорректное значение радиуса");
            return;
        }

        if(Math.abs(t.calcRadius() - c.getR()) < 0.001){
            System.out.print("Окружность с радиусом " + c.getR() + " можно вписать в треугольник с вершинами ");
            t.printT();
        } else {
            System.out.print("Окружность с радиусом " + c.getR() + " нельзя вписать в треугольник с вершинами ");
            t.printT();
        }
    }
}
