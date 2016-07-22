public class Fibo{
       public static void main(String[] args) {
        int n1=-1;
       int n2=1;
       int sum=0;
       for(int i=0;i<5;i++){
    	   sum=n1+n2;
    	   n1=n2;
    	   n2=sum;  
    	   system.out.println(sum);
       
    }
