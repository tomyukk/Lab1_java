package task;
public class Laba1 {
	
	public int begin16(int a,int b) {
		return Math.abs(a-b);
	}
	
	///////////////////////////////////////
	public  int integer16(int val){
		int new_val,d,o;
		d=(val%100)/10;
		o=val%10;
		new_val=(val/100)*100+o*10+d;
		return new_val;	
	}
	

	
	////////////////////////////////////////
	public boolean boolean16(int ch) {
		return (ch>9 && ch<100 && ch%2==0);
	}
	
	
	//////////////////////
	public int array33(int[] array, int n) {
		int i;
		for(i=n-2;i>0;i--) {
			if(array[i]>array[i-1] && array[i]>array[i+1])
				return i+1;
		}
		
		return 0;
	}
	
	
	////////////////////////////////
	public static class If16{
		private double A;
		private double B;
		private double C;
		
		public If16() {
			this.A=0;
			this.B=0;
			this.C=0;
		}
		
		public If16(double A,double B, double C ) {
			this.A=A;
			this.B=B;
			this.C=C;
		}
		

		
		@Override
		public boolean equals(Object obj) {
			If16 myobj = (If16) obj;
			return ((this.A == myobj.A) && (this.B == myobj.B) &&(this.C==myobj.C));

		}
	}
	
	
	public If16 if16(double A,double B,double C) {
		If16 ob=new If16();
		if (A<B && B<C) {
			ob.A=2*A;
			ob.B=2*B;
			ob.C=2*C;
		}
		else {
			ob.A=-A;
			ob.B=-B;
			ob.C=-C;
		}
			return ob;
	}
	
	
	//////////////////////////////////
	public static class While16{
		private int K;
		private double S;
		
		public While16() {
			this.K=0;
			this.S=0;
		}
		
		public While16(int K,double S) {
			this.K=K;
			this.S=S;
		} 
		
		@Override
		public boolean equals(Object ob) {
			While16 myob = (While16) ob;
			return ((this.K == myob.K) && (this.S == myob.S));
		}
		
	}
	
	public While16 while16(int P) {
		if(P<0 || P>50) {
			throw new AssertionError("Incorrect input!");
		}
		While16 ob=new While16();
		double way=10;
		while(ob.S<200) {
			ob.S+=way;
			ob.K++;
			way+=(way*P)/100;
		};
		
		return ob;
		
	}

	
	
	///////////////////////////////
	public String case16(int n) {
		String str ="";
		int des,od;
		des=n/10;
		
		switch(des) {
			case 2:
				str+="двадц€ть";
				break;
				
			case 3:
				str+="тридц€ть";
				break;
			
			case 4:
				str+="сорок";
				break;
				
			case 5:
				str+="п'€тдес€т";
				break;
				
			case 6:
				str+="ш≥стдес€т";
				break;
		}
		
		od=n%10;
		
		switch(od) {
		case 1:
			str+="один р≥к";
			break;
			
		case 2:
			str+="два роки";
			break;
			
		case 3:
			str+="три роки";
			break;
			
		case 4:
			str+="чотири роки";
			break;
			
		case 5:
			str+="п'€ть рок≥в";
			break;
			
		case 6:
			str+="ш≥сть рок≥в";
			break;
			
		case 7:
			str+="с≥м рок≥в";
			break;
		
		case 8:
			str+="в≥с≥м рок≥в";
			break;
			
		case 9:
			str+="дев'€ть рок≥в";
			break;
			
		case 0:
			str+="рок≥в";
			break;
		}
		
	return str;		
	}
	
	
	
	//////////////////////////
	public  double[] for16(double a,int n) {
		int i=0;
		double[] arr = new double[n];
		arr[0]=a;
		for(i=1;i<n;i++) {
			arr[i]=arr[i-1]*a;
		}
		return arr;
	}
	
	
	//////////////////////////////
	public int[][] matrix62(int[][] matr,int n, int m, int k){
		
		int i,j;
		int[][] new_matr = new int[n][m-1];
		for(j=0;j<k-1;j++)
			for(i=0;i<n;i++) {
				new_matr[i][j]=matr[i][j];
			}
		
		
		for(j=k-1;j<m-1;j++)
			for(i=0;i<n;i++) {
				new_matr[i][j]=matr[i][j+1];
			}
		
		return new_matr;	
	}
	
	
	public static void main(String... strings) {
			System.out.println("Program is done!!!");
	}

}
