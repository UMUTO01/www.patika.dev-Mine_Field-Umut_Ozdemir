import java.awt.*;
import java.util.Random;

public class ChangeDisplay {

    private int IndexOfDisplay;

    private String ValueOfDisplayOne;

    private int ValueReal;
    private Random random = new Random();



    protected int MathFunction(){



        int a = (int) random.nextInt(8);
        if(a>8){
            a = MathFunction();
        }
        return a;
    }





    protected void ChangeValue(int Index, int Value){

        int a = Value;

        String Beta = "null";

        if(a == 1){
            Beta = "(1)" ;
        }
        if(a == 2){
            Beta = "(2)";
        }
        if(a == 0){
            Beta = "(_)";
        }
        if(a == 7){
            Beta = "*";
        }

        SetValueReal(a);
        SetValueOfDisplay(Beta);
        SetIndexOfDisplay(Index);
    }

    protected void SetValueReal(int a){
        this.ValueReal = a;
    }
    protected boolean bombCheck(){
        boolean bombValue;
        if(this.ValueReal == 7 ){
           bombValue = false;
        }
        else {
            bombValue = true;
        }
        return bombValue;
    }





    protected void SetIndexOfDisplay(int index){
        this.IndexOfDisplay = index;
    }

    protected int GetIndexOfDisplay(){
        return IndexOfDisplay;
    }

    protected void SetValueOfDisplay(String value){
        this.ValueOfDisplayOne = value;
    }
    protected String GetValueOfDisplay(){
        return this.ValueOfDisplayOne;
    }


}
