package _00_Text_Funkifier;

public class CustomString extends SpecialString{

	public CustomString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String temp = s;
		
		temp = temp.toUpperCase();
		
		return temp;
	}
	
}
