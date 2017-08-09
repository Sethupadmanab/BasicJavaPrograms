import java.util.Random;

public class RandomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Random r = new Random();
  int s[] = new int[20];
   
  for(int i=0; i<s.length; i++){
  s[i] = r.nextInt(40);
  System.out.println(s[i]);
  }
  
	}

}
