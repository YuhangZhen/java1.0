import java.util.ArrayList;
import java.util.Scanner;

public class startAddGame {
	static int guesstimes=0;
	public static void main(String[] args) {
		add dot=new add();//ʵ����	
		ArrayList<Integer> x = new ArrayList<Integer>();
		x=dot.location(x);//�Զ���������λ�ã�
		for (int i = 0; i < x.size(); i++) {
			System.out.println(x.get(i));
		}

		//dot.setLocationCells(x);
		boolean s=true;
		while(s) {
			guesstimes++;
			Scanner in = new Scanner(System.in);
			int userguess = in.nextInt();
			String result = dot.checkYourself(userguess,x);
			if(result=="kill") {
				s=false;
				System.out.println("Yours numofGuesses is " + guesstimes);
			}
		}
}
}
