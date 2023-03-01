import java.util.*;

public class A1093306_0224_1{
    public static void main(String[] argv){
        Scanner input=new Scanner(System.in);
        System.out.println("請輸入任意整數：");
        int num=input.nextInt();
        if(num%2==0){
            System.out.println("此數為偶數");
        }
        else{
            System.out.println("此數為奇數");
        }
    }
}