
public class ReturnTypepgm {
	
	 float add(float x, int y)
		{
			float res=x+y;
			
			return res;
			//System.out.println("1st method " + res);
		}
		int add(int x, int y, int z)
		{
			int res=x+y+z;
			System.out.println("2nd method " + res);
			return res;
			
		}
		
		public static void main(String[] args) 
		{
			ReturnTypepgm r = new ReturnTypepgm();
			float x= r.add(10.52f, 10);
			int y= r.add(10, 10, 10);
			System.out.println(x+y);
		}
}
