

public class GuessGame {
	public static void main(String[] args) {
	boolean s=true ;
	int N=0;
	while(s) {
		N++;
		int number = (int)(Math.random()*10);
		System.out.print("the right number is "+ number + "\n");
		Player p1= new Player();
		Player p2 = new Player();
		p1.name="yuhang";
		p2.name="yuanxiu";
		
		if (number==p1.guess()) {
			System.out.print(p1.name + "is winner" +"    ");
			s=false;
		}
		if(number==p2.guess()) {
			System.out.print(p2.name + "  is winner"+"    ");
			s=false;
		}
		System.out.println("\n"+"--------------------------------------------------------------------");		
		System.out.println("the time of game is" + N);
		System.out.println("--------------------------------------------------------------------");	
	}
}
}