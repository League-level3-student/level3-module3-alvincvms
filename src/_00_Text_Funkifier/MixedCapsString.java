package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		char[] a = s.toCharArray();
		String c = "";
		for(int i = 0; i < a.length; i++) {
			if(i % 2 == 1) {
				a[i] = Character.toUpperCase(a[i]);
			}
			if(i % 2 == 0) {
				a[i] = Character.toLowerCase(a[i]);
			}
		}
		for(char d : a) {
			c += d;
		}
		return c;
	}

}
