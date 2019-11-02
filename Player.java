
import java.util.Scanner;

public class Player {
	int age;
	String name;
	int guess() {
		int g=(int)(Math.random()*10);
		System.out.print(this.name + " number is" + g  + "           ");
		return g;
	}
}
