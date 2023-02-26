package bt2b3;
import java.util.Scanner;
public static void main(String[] args){

   public class Point2D 
   {
    private double x;
    private double y;
    public Point2D() 
    {
        this.x = 0;
        this.y = 0;
    }
    public Point2D(double x, double y) 
    {
        this.x = x;
        this.y = y;
    }
    public void move(double dx, double dy) 
    {
        x += dx;
        y += dy;
    }
    public double distance(Point2D d2) 
    {
        return Math.sqrt((this.x - d2.x) * (this.x - d2.x) + (this.y - d2.y) * (this.y - d2.y));
    }
    public String toString() 
    {
        return "(" + this.x + "; " + this.y + ")";
    }
    public void setX(double x) 
    {
        this.x = x;
    }
    public void setY(double y) 
    {
        this.y = y;
    }
   }
public class MainClass {
     {
        Scanner sc = new Scanner(System.in);

        Point2D A = new Point2D();
        Point2D B = new Point2D();
        System.out.print("Nhap vao hoanh do diem A: ");
        A.setX(sc.nextDouble());
        System.out.print("Nhap vao tung do diem A: ");
        A.setY(sc.nextDouble());

        System.out.print("Nhap vao hoanh do diem B: ");
        B.setX(sc.nextDouble());
        System.out.print("Nhap vao tung do diem B: ");
        B.setY(sc.nextDouble());

        // Hien thi
        System.out.println("Toa diem diem A la: A" + A.toString());
        System.out.println("Toa diem diem A la: B" + B.toString());

        System.out.println("Khoang cach giua 2 diem A va B la: " + A.distance(B));

        sc.close();
    }
}
}