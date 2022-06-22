package demo;

public class Demo {
	public static void main(String[] args) {
		String s1="The box is {height} inches high and {length} inches in length";
		String n = s1.replaceAll("[{}]", " ");
		System.out.println(n);
	}
}
