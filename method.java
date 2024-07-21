package Test;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a []= {"Bharat","India","Hindustan"};
		/*int a1=a.length;
		System.out.println(a1);
		
		for (int i=0;i<a.length;i++)
			System.out.println(a[i]);*/
		
		for (int i=a.length-1;i>=0;i--)
			System.out.println(a[i]);
		
		
		int b[]= {10,20,30,40,50,60,70,80,90};
		System.out.println(b[7]);
		int b1=b.length;
				System.out.println(b1);
				
				for (int i=0;i<b.length;i++)
					System.out.println(b[i]);
				
				for (int i=b.length-1;i>=0;i--)
					System.out.println(b[i]);
	}

}
