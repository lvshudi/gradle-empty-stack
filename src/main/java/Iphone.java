
public class Iphone extends Mobile{
	public Iphone(String name, String color, String brand) {
		super(name, color, brand);
		
	}

	@Override
	public String call(String message) {
		System.out.println("iphone message: " + super.call(message));
		return message;
	}
}
