public class armstrong {     public static void main(int n)     {         int t1=n,len=0;         while(t1!=0)         {             t1=t1/10;             len=len+1;         }                  int t2=n,arm=0,rem;         while(t2!=0)         {             int mul=1;             rem=t2%10; for(int i=1;i<=len;i++)             {                 mul=mul*rem;             }             arm=arm+mul;             t2=t2/10;         }         if(arm==n)         {             System.out.println("armstrong number");         }         else         {             System.out.println("not armstrong number");         }     } }