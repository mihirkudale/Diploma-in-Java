package One;

class H 
{ 
     public void test() 
     { 
         System.out.println("hello"); 
     }   
     public static void main(String args[]) 
     { 
         H i1 = new I(); 
         i1.test(); 
     }      
} 
class I extends H 
{ 
     @Override
     public void test() 
     { 
         System.out.println("from test()"); 
     } 
} 