public class Ex13{
    public static void main(String[] args){
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[2]);
        switch(args[1]){
            case "+":
            System.out.println(soma(a,b));
            break;

            case "-":
            System.out.println(menos(a,b));
            break;

            case "x":
            System.out.println(vezes(a,b));
            break;

            case "/":
            if(b == 0){
                System.out.println("ERROR");
            } else {
                System.out.println(div(a,b));
            }
            break;
        }

    }

    public static double soma(double a, double b){
        return a + b;
    }
    public static double menos(double a, double b){
        return a - b;
    }
    public static double vezes(double a, double b){
        return a * b;
    }
    public static double div(double a, double b){
        return a / b;
    }
}
