package øving2;

public class Person {
	StringBuffer navn;
	
	Person(StringBuffer navn) {
		this.navn = navn;
	}
	
	Person(){
	}
	
	public StringBuffer getNavn() {
		return this.navn;
	}
	
	public void setNavn(StringBuffer navn) {
		this.navn = navn;
	}

}
