import java.util.*;

public class A1093306_0224_2{
    public static void main(String[] argv){
        Scanner input=new Scanner(System.in);
        System.out.println("請輸入攝氏溫度：");
        double Celsius=input.nextDouble();
        double Fahrenheit=Celsius*9/5+32;
        System.out.printf("轉換成華氏溫度為:%.2f%n",Fahrenheit);
    }
}