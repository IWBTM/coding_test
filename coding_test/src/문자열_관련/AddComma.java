package 문자열_관련;

/*
 * 금액을 입력하면 콤마(,)를 붙여서 리턴하라.
 * 
 * ex)
 * 1000000 -> 1,000,000
 */
public class AddComma {

	private static String priceToString;
	private static StringBuffer sb;

	public static String addComma(int price) {
		priceToString = String.valueOf(price);
		sb = new StringBuffer();
		sb.append(priceToString);

		for (int i = 3; i < priceToString.length(); i += 3) {
			sb.insert((priceToString.length() - i), ",");
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(AddComma.addComma(1000000));
		System.out.println(AddComma.addComma(48613866));
		System.out.println(AddComma.addComma(77778564));
	}
}
