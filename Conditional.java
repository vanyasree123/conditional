public class Conditional {
    public static void main (String[] args){
         int a=-1;
         int b=20;
// if condition
         if (b%2==0){
            System.out.println("a is a even number");
        }
// if-else conditional statements
        if (a%2==0){
            System.out.println("a is the even number");
        }else {
            System.out.println("a is an odd number");
        }
 //if_else if conditional statements
        if (a>0){
            System.out.println("the number is positive");
        }else if (a<0){
            System.out.println("the number is negative");
        }else{
            System.out.println("the number is zero");
        }
//switch case ,conditional statements
        int day=3;
        switch (day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("invalid day number");

        }
//nestled if conditional statements
        if (a%2==0){
            System.out.println("a is the even number");
            if(a>b){
                System.out.println("a is greater than b");
            }else{
                System.out.println("b is the greatest number");
            }
        }else{
            System.out.println("x is the odd number");
            if(a>b){
                System.out.println("a is greater than b");
            }else{
                System.out.println("b is the greatest number");
            }
        }
    }
}
