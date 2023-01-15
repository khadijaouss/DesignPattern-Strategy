package Strategy;

public class Test {
public static void main(String args[]) throws InterruptedException{
	//we can provide any strategy to do the sorting
	Product[] objArray= {
         new Product("A", 10000),
         new Product("X", 20099),
         new Product("C", 3000),
         new Product("A", 4000),
	};
	Context ctx=new Context(new BubbleSort());
	ctx.arrange(objArray);
	System.out.print("\n");

	
	//we can change the strategy without changing the context
	ctx= new Context(new SelectionSort());
	ctx.arrange(objArray);
	System.out.print("\n");
	
	ctx= new Context(new InsertionSort());
	ctx.arrange(objArray);
	
	
}

}
