
public class Mobile {
	private String name;
	private String color;
	private String brand;
	
	public Mobile (String name, String color, String brand) {
		this.name = name;
		this.color = color;
		this.brand = brand;
	}
	
	public String call(String message) {
		System.out.println(message);
		return message;
	}
	
	public void introduce () {
		System.out.println("名称：" + name + " 颜色：" + color + " 品牌：" + brand);
	}
}
