import java.util.Scanner;

public class Coord {
    private int x;
    private int y;
    private String name;

    public Coord(String name){
        Scanner sc = new Scanner (System.in);
        System.out.print("Введите координаты Х и Y точки " + name + ": ");
        x = sc.nextInt();
        y = sc.nextInt();
        this.name = name;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public String getName(){
        return name;
    }
}
