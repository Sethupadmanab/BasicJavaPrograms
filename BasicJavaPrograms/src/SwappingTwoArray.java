
public class SwappingTwoArray {

	public static void main(String[] args) {
		int numTens[] = {1, 2, 3, 4, 5}; // First array of numbers
        int numHundred[] = {100, 200, 300, 400, 500}; //Second Array of Numbers
        for (int i = 0; i < numTens.length; i++)
        {
            numTens[i] = numTens[i] + numHundred[i];      // statement 1
            numHundred[i] = numTens[i] - numHundred[i];   // statement 2
            numTens[i] = numTens[i] - numHundred[i];      // statement 3
        }
        for(int tens : numTens)
        {
        	 System.out.println("the value of tens are "+tens );
        }
        for(int hundred : numHundred)
        {
        	 System.out.println("the value of hundreds are "+hundred );
        }
        
	}

}
