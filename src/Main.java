/**
 * Created by Катя on 16.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Adder num = new Adder(40,-10);
        System.out.println("value1 "+num.getNumberValue1());
        System.out.println("value2 "+num.getNumberValue2());
        System.out.println("Function add from class Arithmetic "+num.add(num.getNumberValue1(),num.getNumberValue2()));
        System.out.println("Function check from class Adder: "+num.check(num.getNumberValue1(),num.getNumberValue2()));
    }
}
