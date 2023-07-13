
import java.util.Scanner;


public class Digits {
          public static void main(String[] args) {
System.out.println("Digits Master Menu: \n" +
"1. Least significant digit \n" +
"2. ith digit \n" +
"3. Sum of digits \n" +
"4. Count digits \n" +
"5. Remove digitK \n" +
"6. Remove digit with value \n" +
"7. Generate random number \n" +
"8. Reverse digits \n" +
"9. Check palindrome \n" +
"10. Quit ");
Scanner scn=new Scanner(System.in);
System.out.println("Choose action to perform:");
int x=scn.nextInt();

    if(x==1){
   System.out.println("Enter the number to find its least significant number:");
  int n=scn.nextInt();
      System.out.println("Least significant number is found as: "+digitZero(n));
}
    else if(x==2){
  System.out.println("Enter the number to find its digit:");
  int n=scn.nextInt();   
   System.out.println("Which digit?");
  int i=scn.nextInt();
  System.out.println("Digit is found as: "+digiti(n,i));
}
    else if(x==3){
     System.out.println("Enter the number to find digit sum:");
  int n=scn.nextInt();
  System.out.println("The digit sum is calculated as: "+digitSum(n));
}          
    else if(x==4){
     System.out.println("Enter the number to find its count of digits that are equal to a value:");
  int n=scn.nextInt();   
   System.out.println("Which value to count?:");
  int k=scn.nextInt();
  System.out.println("The count is found as: "+digitCount(n,k));
}
    else if(x==5){
    System.out.println("Enter the number to remove digit:");
  int n=scn.nextInt();   
   System.out.println("Which digit to remove?:");
  int k=scn.nextInt();
  System.out.println("Removed digit: "+digitRemoveK(n,k));
}
    else if(x==6){
       System.out.println("Enter the number to remove all digits with a value");
  int n=scn.nextInt();   
   System.out.println("Which value to remove?:");
  int k=scn.nextInt();
  System.out.println("Removed value:"+digitRemove(n,k));
}
    else if(x==7){
     System.out.println("Enter a digit value to create a random number:");
  int k=scn.nextInt();
  System.out.println("Random number: "+randomNumber(k));
}
    else if(x==8){
     System.out.println("Enter the number to reverse it:");
  int n=scn.nextInt();
  System.out.println("Reverse is found as: "+reverse(n));    
}
    else if(x==9){
      System.out.println("Enter the number to check if its a palindrome:");
  int n=scn.nextInt();
  System.out.println(isPalindrome(n)); 
}
    else {
  System.out.println("Ok, good bye.");
}

          }     
          public static int digitZero(int n){  // least significant digit
           return n%10;   
          }
          public static int digiti(int n, int i){ // ith digit of n
             if(i==0){
             n=n%10;
             return n;
         }
             else{
              for(int j=0;j<i;i++){
             n=n/10;
              }
         n=n%10;
              return n;
         }
          }
          public static int digitSum(int n){  //sum of its digits
               int sum=0;
             while(n!=0){
                 sum+=n%10;
             n/=10; 
             }
              return sum;
          }
          public static int digitCount(int n, int k){  //count the number of digits that are equal to k in n
               int sum=0;
             while(n!=0){
                if(n%10==k){
              sum+=1;
               n/=10;
}
                else{
                     n/=10;
                 }

}
              return sum;
          }
          public static int digitRemoveK(int n, int k){ //remove the kth digit in n
                  int a=n; 
    //61748,3-->6748
      for(int j=0; j<k+1; j++){ //6
         a/=10;
     }
     for(int i=0; i<k; i++){ //6000
        a*=10; 
     }
     int b=1;
          for(int h=0; h<k;h++){ //10^k
              b*=10;
          }
     int c=n;
              for(int l=0; l<k; l++){
       c=(int)(n%b);  //748
              }
              return a+c;
          }
          public static int digitRemove(int n, int k){  //remove all digits with value k in n
       int a=n;
  int count=0;
   while(a>0){
      a/=10;
      count++;
  }
   int b=n;
   for(int i=0; i<count; i++){ //main for
    int c=1;
         for(int j=0; j<i;j++){ //c=10^i
             c*=10;
         }
         int d=1;
         for(int v=0;v<i+1;v++){ //d=10^i+1
             d*=10;
         }
     if(b%10==k && i==0){
         n/=10;
         b/=10;
     }

     else if(b%10==k){
              n=(int)(((n/d)*c)+(n%c));
           b/=10;
       }
     else{
         b/=10;
     }
   }
 
return n;

          }
          public static int randomNumber(int k){ 
           int a=1;
          for(int i=0; i<k-1; i++){
              a*=10;
          }
              int num = (int)((Math.random()*9+1)*a); //(10^k-1, 10^k)
        return num;     
          }
          public static int reverse(int n){ 
              int reverse =0;
            while(n!=0){
                reverse =reverse*10+n%10;
                n/=10;
            }
        return reverse;
          }
          public static boolean isPalindrome(int n){  
                       int reverse =0;            
            while(n!=0){
                reverse =reverse*10+n%10;
                n/=10;
            }
            
        if(reverse==n)  
            return true;
        
        else 
            return false;
          }
}








