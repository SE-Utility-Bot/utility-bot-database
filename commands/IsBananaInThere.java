import java.util.Arrays;

public class IsBananaInThere {
	public static void main(String[] args) {
		if (Arrays.stream(args).anyMatch("banana"::equals)) {
			System.out.println("banana found! :)");
		} else {
			System.out.println("banana not found! :(");
		}
	}
}