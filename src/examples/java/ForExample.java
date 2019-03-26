package examples.java;

public class ForExample {
	
	 
		public static void main(String[] args) {  
			System.out.println("Outside loop ");
			
			//int j=2;
			
		    //Code of Java for loop  
//		    for(int i=1;i<=3;i++){  
//		    	
//		        System.out.println("Inside loop " +i);
//		        if(i==4) {
//		        	break;
//		        }
//		        
//		        //j++;
//		    }  
		        
		    //Code for Nested for loop
		    for(int i=1;i<=3;i++){    
                //inner loop  
                for(int j=1;j<=3;j++){    
                    if(i==3&&j==2){    
                        //using break statement inside the inner loop  
                        break;    
                    }    
                    System.out.println(i+" "+j); 
                }    
        }
		    //System.out.println("Outside loop " +j);
		}  
		 

}
