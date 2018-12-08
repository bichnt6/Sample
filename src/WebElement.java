public class WebElement {
	// Khai bao thuoc tinh
	public String Value;
	public String CSS;

	public void Input(String Value) {
		this.Value = Value;
	}

	public void AddClass(String CSS) {
		this.CSS = CSS;
	}

	public void DoAction() {
		System.out.println(Value);
		System.out.println(CSS);
	}

	public static void main(String[] test) {
		WebElement wl = new WebElement();
		wl.Input("t");
		wl.AddClass("10");
		wl.DoAction();
		NewWebelement nw = new NewWebelement();
		nw.Viettel();
		int st = nw.st.length();
		System.out.println(st);
	}
	
}
