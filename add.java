import java.util.ArrayList;
public   class add {
	
	int numofHits=0;
	//private ArrayList<String> x;
	public ArrayList<Integer> location(ArrayList<Integer> x) {
		int s = (int)(Math.random()*10);
		if(s==1) {
			x.add(s);
			x.add(s+1);
			x.add(s+2);
			return x;
			
		}
		else if(s==10){
			x.add(s);
			x.add(s-1);
			x.add(s-2);
			return x;
		}
		else {
			x.add(s);
			x.add(s+1);
			x.add(s-1);
			return x;
		}
		

	}
	 //public void setLocationCells(ArrayList<String> locs) {
		//x = locs;
	//}
	public String checkYourself(int userinput , ArrayList<Integer> x) {
		int index = x.indexOf(userinput);
		// 查询用户输入在ARRAYLIST的位置；
		String result = "miss";
		if(index >= 0) {     //如果有
			
			x.remove(index);//去除位置存的数据
			if(x.isEmpty()) {
				result = "kill";
			}else {
				result="kit";
			}		
	}
		System.out.print(result);
		return result;
	}
}
