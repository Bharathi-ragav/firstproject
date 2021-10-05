import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\tCalculator");
        System.out.println("Enter operator for operation i.e +,-,*,/,%.");
        String str = input.next();
        if(str.equals("+")||str.equals("-")||str.equals("*")||str.equals("/")||str.equals("%")){
        System.out.print("Enter operands : ");
        int a = input.nextInt();
        int b = input.nextInt();
           System.out.print("Result : ");
           switch(str){
                case "+" : 
                          System.out.print(a+b);
                          break;
                case "-" : 
                          System.out.print(a-b);
                          break;
                case "*" : 
                          System.out.print(a*b);
                          break;
                case "/" : 
                          System.out.print(a/b);
                          break; 
                case "%" : 
                          System.out.print(a%b);
                          break; 
             
           }
        }
        else if(str.equals("!")){
            System.out.print("Enter No. : ");
            int result = 1 ;
            int c = input.nextInt();
            for(int i = 1 ; i <= c ; ++i){
                result*=i;
            }
            System.out.println("factorial : " + result);

        }else System.out.println("Invalid Operator");

        input.close();

        
    }
  
}

