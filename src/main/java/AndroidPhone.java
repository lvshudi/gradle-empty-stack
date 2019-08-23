
public class AndroidPhone extends Mobile {
	public AndroidPhone(String name, String color, String brand) {
		super(name, color, brand);
	}

	@Override
	public String call(String message) {
		System.out.println("android message: " + super.call(message));
		return message;
	}
}
