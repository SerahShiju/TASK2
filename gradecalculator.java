
import java.util.Scanner;
public class gradecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your english marks");
        int eng=sc.nextInt();
        System.out.println("Enter your math marks");
        int math=sc.nextInt();
        System.out.println("Enter your social studies marks");
        int ss=sc.nextInt();
        System.out.println("Enter your language 1 marks");
        int lang1=sc.nextInt();
        System.out.println("Enter your science marks");
        int science=sc.nextInt();
         if(eng<50 || math<50 || ss<50 || lang1<50 || science<50){
            System.out.println("FAIL");
            return;
        }
        float total=eng+math+ss+lang1+science;
        System.out.println("total:"+total);
        double avg=(total/500)*100;
        System.out.println("average:"+avg);
        if(avg>=95){
           System.out.println("GRADE:A");  
        }
        else if(avg>=85 && avg<95){
            System.out.println("GRADE:B");  
        }
         else if(avg>=75 && avg<85){
            System.out.println("GRADE:C");  
        }
         else if(avg>=65 && avg<75){
            System.out.println("GRADE:D");  
        }
         else{
            System.out.println("GRADE:F");  
        }
        }
        
}