/**
 * Created by Катя on 16.11.2016.
 */
public class Adder extends Arithmetic {
    public Adder(int numberValue1, int numberValue2) {
        super(numberValue1, numberValue2);
    }
    public boolean check(Integer a, Integer b){
        if(a>=b) return true;
        else return false;
    }
}
