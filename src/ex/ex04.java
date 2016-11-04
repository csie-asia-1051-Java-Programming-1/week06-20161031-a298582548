package ex;
/*
 * Topic: 撰寫一函數void square(arr)，在呼叫square(arr) 函數後，一維陣列arr 裡的每一個元素皆會被平方。
 * 例如:輸入1 3 5 7, 則輸出1  9   25  49
 * Date: 2016/10/31
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("要輸入幾個數?:");
		int v1 = scn.nextInt();
		System.out.print("輸入你所要的值:");
		int[] data=new int[v1];
		for(int i = 0;i<v1;i++){
			data[i] = scn.nextInt();
		}
		fun1(data,v1);	
	}
	public static void fun1(int data[],int v1){
	for(int i = 0;i<v1;i++){
		System.out.print(Math.pow(data[i], 2)+"\t");
	}
			
	}
      
}
