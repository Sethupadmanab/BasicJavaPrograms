
class NameException extends Exception{  
  NameException(String name){  
    super(name);  
 }  
}  

class UserDefinedException{  
	  
	   static void getName(String name)throws NameException{  
	     if(name.length() > 4)  
	      throw new  NameException("welcome to vote");  
	     else  
	      System.out.println("not a valid number");  
	   }  
	     
	   public static void main(String args[]){  
	      try{ 
	    	  
	      getName("sethu"); 
	      
	      }catch(Exception m){
	    	  
	    	  System.out.println("Exception occured: "+m);
	    	  
	      }  
	  
	        
	  }  
	}  

