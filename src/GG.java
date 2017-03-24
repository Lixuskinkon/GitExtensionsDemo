/**
 * Created by Administrator on 2017/3/22 0022.
 */
import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class GG {
    static double f=0;
    static double x=0;

    public static void jisuan(double a)
    {
            System.out.println("请输入答案:");
            Scanner in=new Scanner(System.in);
            double i=in.nextInt();
            x++;
            if(i==a) {
                f++;
                System.out.println("正确,目前正确率为:"+100*f/x+"%");
            }
            else{
                System.out.println("错误,目前正确率为:"+100*f/x+"%");
            }
    }

    public static void jisuan(int e,int f,int g,int h){
        int k=e*g;
        int y=f*h;
        for(int i=2;i<k&&i<h;i++) {
            if(k%i==0&&y%i==0){
                k/=i;
                y/=i;
                i=2;
            }
        }
        x++;
        System.out.println("请输入分子(请输入最简式,否则为错):");
        Scanner in=new Scanner(System.in);
        int i =in.nextInt();
        System.out.println("请输入分母(请输入最简式,否则为错):");
        int j=in.nextInt();
        if(i==k&&j==y){
            f++;
            System.out.println("正确,目前正确率为:"+100*f/x+"%");
        }
        else{
            System.out.println("错误,目前正确率为:"+100*f/x+"%");
        }

    }

    public static void jisuan(int g,int h){
        for(int i=2;i<g&&i<h;i++) {
            if(g%i==0&&h%i==0){
                g/=i;
                h/=i;
                i=2;
            }
        }
        x++;
        System.out.println("请输入分子(请输入最简式,否则为错):");
        Scanner in=new Scanner(System.in);
        int i =in.nextInt();
        System.out.println("请输入分母(请输入最简式,否则为错):");
        int j=in.nextInt();
        if(i==g&&j==h){
            f++;
            System.out.println("正确,目前正确率为:"+100*f/x+"%");
        }
        else{
            System.out.println("错误,目前正确率为:"+100*f/x+"%");
        }
    }

    public static void main(String[] args) {
        double[] a;
        a=new double[100];
        for(int j=0;j<100;j++) {
            int n = (int) (Math.random() * 100);
            int m = (int) (Math.random() * 100);
            int k = 1 + (int) (Math.random() * 4);
            switch (k) {
                case 1:
                    a[j] = n + m;
                    System.out.println(n + "+" + m);
                    jisuan(a[j]);
                    break;
                case 2:
                    a[j] = n - m;
                    System.out.println(n + "-" + m);
                    jisuan(a[j]);
                    break;
                case 3:
                    a[j] = n * m;
                    System.out.println(n + "*" + m);
                    jisuan(a[j]);
                    break;
                case 4:
                    a[j] = n / m;
                    System.out.println(n + "÷" + m);
                    jisuan(n,m);
                    break;
                case 5:
                    int x=1+(int) (Math.random() * 100);
                    int y=1+(int) (Math.random() * 100);
                    System.out.println(n + "/" + x+(m)+"/"+y);
                    a[j]=n/x+m/y;
                    jisuan(n,x,m,y);
                    break;
            }
        }
    }

}
