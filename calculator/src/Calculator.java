public class Calculator {

    static void cal (int num1 , int num2) {
        Div div = new Div();
        System.out.println(Sum.sum(num1, num2));
        System.out.println(Sub.sub(num1, num2));
        System.out.println(div.div(num1, num2));
        System.out.println(Multi.multi(num1, num2));
    }



    public static void main(String[] args) throws Exception {


        cal(5, 5);

        
    }
}
