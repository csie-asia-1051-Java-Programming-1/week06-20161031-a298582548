package ex;
/*
 * Topic: 使用者輸入一個大正整數值，請設計一個函數fun1(n)可以計算該大數字裡的數字總合。例如:輸入: 4832 則輸出 17
 * Date: 2016/10/31
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		double v1 = scn.nextDouble();
		int v2 = 0;
		fun1 (v1,v2);
	}
	public static void fun1(double v1,int v2){
	for(int i= 1;v1>0;i++){
		v2 = (int)(v2+v1%10);
	v1 = v1/10;

	}
	System.out.print(v2);
	}

}
