package constructor;

public class PrConstructor {

	public PrConstructor()
	{
		System.out.println("vdhsjdbjsdfkjb");
	}
	public PrConstructor(int []g)
	{
		g[2]=14;
		
	//	for(int rv:g)
	//	System.out.println(rv);

		for(int i=0;i<4;i++)	
		System.out.println(g[i]);
	}
public static void main(String[] args) {
	int [] g= {1,6,7,9};
	PrConstructor tyy=new PrConstructor(g);
	PrConstructor ty=new PrConstructor();

	
}
}
