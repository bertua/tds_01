public class Ex14{
    public static void main(String[] args){
        Ex14 objeto = new Ex14();
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[2]);
        switch(args[1]){
            case "+":
            System.out.println(objeto.soma(a,b));
            break;

            case "-":
            System.out.println(objeto.menos(a,b));
            break;

            case "x":
            System.out.println(objeto.vezes(a,b));
            break;

            case "/":
            if(b == 0){
                System.out.println("ERROR");
            } else {
                System.out.println(objeto.div(a,b));
            }
            break;
        }

    }

    public double soma(double a, double b){
        return a + b;
    }
    public double menos(double a, double b){
        return a - b;
    }
    public double vezes(double a, double b){
        return a * b;
    }
    public double div(double a, double b){
        return a / b;
    }
}
