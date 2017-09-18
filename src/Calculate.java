
public class Calculate {
	
	public int number;
	
	public Calculate(int number) {
		this.number = number;
	}
	
	public String output() {
		String str = "";
		if(this.number%2 == 0) {
			str = "Even";
		}else {
			str = "Odd";
		}
		return str;
	}
}
