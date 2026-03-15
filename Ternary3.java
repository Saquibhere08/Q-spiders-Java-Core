class Ternary3
{
	public static void main(String[] args)
	{
		int a=50;
		int b=20;
		int c=30;
		int d=0;
		int e=44;
		int res = (a<b && a<c && a<d && a<e) ? a :
          			(b<c && b<d && b<e) ? b :
          			(c<d && c<e) ? c :
          			(d<e) ? d : e;
				
		
		System.out.println(res);
	}
}