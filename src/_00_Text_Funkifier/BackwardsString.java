package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		char[] a = s.toCharArray();
		String c = "";
		for(int i = 0; i < a.length/2; i++) {
			char b = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = b;
		}
		for(char d : a) {
			c += d;
		}
		return c;
	}

}
