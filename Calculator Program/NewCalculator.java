package assignment;

public class NewCalculator {

public static void Division(int a, int b, int c){
	  int div;
	   div = (a+b+c)/100;
	   
	   System.out.println(div);
	}
	
   public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	int a = s.nextInt();
	int b = s.nextInt();
	int c = s.nextInt();
	
	Division(a,b,c);
	
	
}
   
}

	

}
