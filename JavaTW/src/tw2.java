import static java.lang.System.exit;
import java.util.Scanner;
class Triangle {
    double a,b,c;
    void getSides(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 3 sides of a triangle:");
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();
    }
    void checkTriangle(){
        if((a+b)>c && (b+c)>a && (a+c)>b){
            if(a==b && b==c && c==a)
                System.out.println("Triangle is equilateral");
            else if(a==b || b==c || c==a)
                System.out.println("Triangle is isosceles");
            else
                System.out.println("Triangle is scalene");
        }
        else{
            System.out.println("Triangle cannot be formed");
            exit(0);
        }
    }
    double computeArea(){
        double s=(a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
}

public class tw2 {
    public static void main(String[] args){
        Triangle t=new Triangle();
        t.getSides();
        t.checkTriangle();
        if((t.computeArea())!=0){
            System.out.println("Area is "+t.computeArea());
        }
    }
}