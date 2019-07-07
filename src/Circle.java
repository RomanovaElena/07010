import java.util.Scanner;

public class Circle {
    private int r; // радиус окружнсти
    Scanner sc;

    public Circle(){
        sc = new Scanner (System.in);
        System.out.print("Введите радиус окружности: ");
        r = sc.nextInt();
    }

    public void setR(int r){
        this.r = r;
    }

    public int getR(){
        return r;
    }
}
