public class Ex14{
    public static void main(String[] args){
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[2]);
        Calcular calc = new Calcular(a,b);
        switch(args[1]){
            case "+":
                System.out.println(calc.soma());
                break;

            case "-":
                System.out.println(calc.menos());
                break;

            case "x":
                System.out.println(calc.vezes());
                break;

            case "/":
                if(b == 0){
                  System.out.println("ERROR");
                } else {
                    System.out.println(calc.div());
                }
                break;

            case "!":
                System.out.println(calc.fatorial());
                break;

            case "r":
                System.out.println(calc.raiz());
                break;

            case "p":
                System.out.println(calc.potencia());
                break;
        }

    }
}


class Calcular{
    double n1;
    double n2; 

    public Calcular(double a, double b){
        this.n1 = a;
        this.n2 = b;
    }
    
    public double soma(){
        return this.n1 + this.n2;
    }
    public double menos(){
        return this.n1 - this.n2;
    }
    public double vezes(){
        return this.n1 * this.n2;
    }
    public double div(){
        return this.n1 / this.n2;
    }
    public double raiz(){
        return Math.sqrt(this.n1);
    }
    public double potencia(){
        return Math.pow(this.n1, this.n2);
    }
    public double fatorial(){
        long fatorial = 1l;
        for(double j = this.n1; j > 1; j--){
            fatorial *= j;
        }
        return fatorial;
    }
    
}
