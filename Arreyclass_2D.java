package Test;

public class Arreyclass_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a[][]= {{1,2,3,4,},{1,2,3,4,}};
		int sum=0;
		for(int i=0;i<a.length;i++)
		for (int j=0;j<a[i].length;i++)
		{
			sum=sum+a[i][j];
			System.out.println(sum);
		}
		
		
		
	}

}
