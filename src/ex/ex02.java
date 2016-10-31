package ex;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		int v2 = scn.nextInt();
		int v3 = v2-v1;
		
		fun1(v1,v2,v3);
	    }
	    public static void fun1(int v1,int v2,int v3){
	    double sum = 1;
	    for(int c = v1;c>0;c--){
	    sum = sum*c;
	    }
	    double sum1 = 1;
	    for(int d = v2;d>0;d--){
	    sum1 = sum1*d;
	    }
	    
	    double sum2 = 1;
	    
	    for(int e = v3;e>0;e--){
	    sum2 = sum2*e;
	    }
	    System.out.print(sum/sum1*sum2);
}
}
