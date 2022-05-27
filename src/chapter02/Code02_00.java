package chapter02;

/*
 * オペランド
 * リテラル
 * エスケープシーケンス
 *
 * 文字列
 * String.format("文字=%s 数字=%d 少数=%.2f",str,num1,num2)
 */


public class Code02_00 {
	public static void main(String[] args) {
		int i = 10;
		long l = 20L;
		double d = 3.3;
		float f = 4.4F;
		boolean b = true;
		char c = '5';
		String str = "6666";

		System.out.println(String.format(
				"i=%d \n"
				+ "l=%d \n"
				+ "d=%.2f", i,l,d));

		System.out.println(String.format(
				"str=%s \n"
				+ "c=%s \n"
				+ "f=%.2f", str,c,f));
	}
}
