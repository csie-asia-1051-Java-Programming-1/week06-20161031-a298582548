package hw;
/*
 * Topic: 讓使用者輸入性別與身高，透過函數呼叫，依據男女不同, 幫她(他)計算並輸出其標準體重 ((1)男：(身高-170)*0.6+62 , 
 * (2)女：(身高-158)*0.5+52)。函數算出結果後要回傳至主程式再印出結果。例如:輸入 1 170 則輸出 62.0, 輸入 2 165 則輸出 55.5 
 * Date: 2016/10/31
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("生理性別?(1=男性，2=女性):");
		int v1 = scn.nextInt();
		System.out.print("目前身高:");
		float v2 = scn.nextInt();
		System.out.print(fun1(v1,v2));
	}
	public static float fun1(int v1,float v2){
	if(v1==1){
	v2 = (v2-170f)*(6/10f)+62;
	}else if(v1==2){
	v2 = (v2-158f)*(5/10f)+52;
	}
	return v2;	
	}
	}



