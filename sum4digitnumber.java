import java.io.*;
class Sum4digit
        {
            public static void main(String args[])throws IOException
            {
               int num,sum=0;
               InputStreamReader isr=new InputStreamReader(System.in);
               BufferedReader br=new BufferedReader(isr);
               System.out.println("Enter 4 digit number");
               num=Integer.parseInt(br.readLine());
               sum=(num%10)+sum;
               num=(num/10);
               sum=(num%10)+sum;
               num=(num/10);
               sum=(num%10)+sum;
               num=(num/10);
               sum=(num%10)+sum;
               System.out.println("Sum="+sum);
            }
        }