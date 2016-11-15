/**
 * Created by Катя on 16.11.2016.
 */
public class Arithmetic {
    private int numberValue1;
    private int numberValue2;


    public Arithmetic(int numberValue1,int numberValue2) {
        this.numberValue1 = numberValue1;
        this.numberValue2 = numberValue2;

    }

    public int getNumberValue1() {
        return numberValue1;
    }

    public void setNumberValue1(int numberValue1) {
        this.numberValue1 = numberValue1;
    }

    public int getNumberValue2() {
        return numberValue2;
    }

    public void setNumberValue2(int numberValue2) {
        this.numberValue2 = numberValue2;
    }



    public int add(Integer a, Integer b){

        return a+b;
    }
}
