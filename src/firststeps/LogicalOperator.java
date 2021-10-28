package firststeps;

public class LogicalOperator {

    public static void main(String[] args) {
        int topScore =100;
        int secondScore = 60;
        if((topScore>=100) && (secondScore < 100))
        {
            System.out.println("Using >= && < operator" + topScore + secondScore);
        }
        if((topScore<=100) && (secondScore >100)){
            System.out.println("Using <= && > operator " + topScore +secondScore);
        }
        if((topScore<=100) || (secondScore >100)){
            System.out.println("Using <= || > operator " + topScore +secondScore);
        }

        int newValue = 50;
        if(newValue==50){

        }
        boolean isCar = false;
        if(isCar=true)
        {
            System.out.println("This is not supposed to happen");
        }

        boolean isCar1 = false;
        if(isCar1 != true)
        {
            System.out.println("This is not supposed to happen 01");
        }

        if(!isCar1)
        {
            System.out.println("This is not supposed to happen 02");
        }

        System.out.println("***********Ternary **************");

        int ageOfClient = 18;
        boolean isEighteenOrOver = (ageOfClient==20)? true: false;
        if(isEighteenOrOver){
            System.out.println("Age is equal to 20");
        }
        else{
            System.out.println("Age is not equal to 20");
        }

    }
}
