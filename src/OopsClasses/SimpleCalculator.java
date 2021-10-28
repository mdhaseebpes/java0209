package OopsClasses;

public class SimpleCalculator {

   private double firstNumber;
   private double secondNumber;

    public double getFirstNumber(){
        return  this.firstNumber = firstNumber;
    }

    public double getSecondNumber(){
        return this.secondNumber = secondNumber;
    }

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        double v = firstNumber + secondNumber;
        return v;
    }

    public double getSubtractionResult(){
        double s = firstNumber -secondNumber;
        return s;
    }

    public double getMultiplicationResult(){
        double m = firstNumber * secondNumber;
        return m;
    }
    public double getDivisionResult(){
        if(secondNumber==0){
            return 0;
        }
        double d = firstNumber/secondNumber;
        return d;
    }

    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);

        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());

        calculator.setFirstNumber(5.25);
        calculator.setFirstNumber(0);

        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
