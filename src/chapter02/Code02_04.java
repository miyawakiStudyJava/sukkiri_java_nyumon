package chapter02;

import java.util.Random;

//演算子
public class Code02_04 {
	public static void main(String[] args) {
		/*
		 * +=（足し算）
		 * -=（引き算）
		 * *=（乗算）
		 * /=（割り算）
		 * %=（余り）
		 * ++（インクリメント）
		 * --（デクリメント）
		 */
		Random rnd01 = new Random();

		int num01 = rnd01.nextInt(10);
		int num02 = rnd01.nextInt(10);
		int num03 = rnd01.nextInt(10);
		int num04 = rnd01.nextInt(10);
		int num05 = rnd01.nextInt(10)+10;

		int nextInt = rnd01.nextInt(10);
		int nextInt2 = rnd01.nextInt(10);
		int nextInt3 = rnd01.nextInt(10);


		System.out.println(String.format("num01:%d += 1 = %d", num01,num01 += 1));
		System.out.println(String.format("num02:%d -= 1 = %d", num02,num02 -= 1));
		System.out.println(String.format("num03:%d *= 2 = %d", num03,num03 *= 2));
		System.out.println(String.format("num04:%d /= 2 = %d", num04,num04 /= 2));
		System.out.println(String.format("num04:%d /= 2 = %d", num04,num04 /= 2));

		//		System.out.println(String.format("num05:%d %= 2 = %d", num05,num05 % 2));

		String camelsnakestr = "css";

	}
}
