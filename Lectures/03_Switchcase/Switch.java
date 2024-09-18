public class Switch{
    public static void main(String[] args){
        int a=-10;
        int b=10;

        switch(a+b){
            case 0:
                System.out.println("sum is 0");
                break;
            case 1:
                System.out.println("sum is 1");
                break;
            default:
                System.out.println("sum is nothing");
                break;
        }
    }
} 