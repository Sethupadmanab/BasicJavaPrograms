//concept name: 
public class VarragsVariable {
   public void show(int ...a) // it will consider the each arguments comes from obj.show() as an Array element.
   {
	   for(int i : a)
	   {
	   System.out.println(i);
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarragsVariable obj = new VarragsVariable();
		obj.show(2,4,9,0,4,6,5,9,4); // we can give any number of argument with the same type
	}

}
