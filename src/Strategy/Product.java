package Strategy;

public class Product implements Comparable<Product> {
     String name;
     float price;
     
     public Product(String name, float price) {
         this.name = name;
         this.price = price;
     }
     public float getPrice() {
    	 return price;}
     public String getName() {
    	 return name;}
     
     @Override
     //this is overridden to print the user-friendly information about the Product
     public String toString() {
         return this.name + " " + this.price ;
     }

	@Override
	public int compareTo(Product otherProduct) {
		// if the string are not equal
        if (this.name.compareTo(otherProduct.name) != 0) {
            return this.name.compareTo(otherProduct.name);
        }
        else {
            // we compare float values
            // if the strings are equal
            return (int) (this.price - otherProduct.price);
        }
	}
     
}
