import java.io.LineNumberInputStream;
import java.util.Scanner;
import java.util.Set;

public class Movement {


    private int[] Lines = {-5,-5,-5,-5,-5,-5,-5,-5,-5};

    private Scanner scan = new Scanner(System.in);

    public int SellectedValue;

    protected ChangeDisplay DisplayOut = new ChangeDisplay();

    protected Display neonLight = new Display();






    public void Move(){

        int BombLocation  = 0;
        BombLocation= DisplayOut.MathFunction();
        SetLines(BombLocation,7);

        System.out.println("The Row and Column will be checked, if you have entered the " +
                "\n value that you entered previously, it won't be accepted.");


        int n = 0;

        while (n<9){
            int column = AskColumn();
            int row = AskRow();
            int LineValue = TransformRowandColumn(row,column);
            boolean Check = CheckRowandColumn(DoubleCheck(LineValue));
            boolean Neon = false;
            if(Check !=true){
                System.out.println("Moving to first line, select again the row and column is already selected.");
                while(Neon!=true){
                    column = AskColumn();
                    row = AskRow();
                    LineValue = TransformRowandColumn(row,column);
                    Neon = CheckRowandColumn(DoubleCheck(LineValue));
                }
            }
            if(Neon = true){
                System.out.println("Movement has been completed");
                    SetLines(LineValue,Dynamits(LineValue));
                    DisplayOut.ChangeValue(LineValue,GetLines(LineValue));
                    neonLight.SetMovementArray(DisplayOut.GetIndexOfDisplay(),DisplayOut.GetValueOfDisplay());
                    neonLight.ShowFullArray();
                    if(DisplayOut.bombCheck() == true){
                        n++;
                        System.out.println("Next Movement");
                        System.out.println("====================");


                    }
                    else if(DisplayOut.bombCheck() == false){
                        System.out.println("You pressed the bomb");
                        n = 10;
                    }


            }
        }
    }


    public int Dynamits(int lineIndex){
        int BombNumber = 0;
        if(lineIndex == 0 && GetLines(lineIndex) != 7){
           for(int ant = 1 ; ant <5; ant++){
               if(ant != 2) {
                   if(GetLines(ant) == 7){
                       BombNumber++;
                   }
               }
           }
        }
        if(lineIndex == 0 && GetLines(lineIndex) == 7){
            BombNumber =7;
        }

        if(lineIndex == 1 && GetLines(lineIndex) != 7){
            for(int argue = 0 ; argue < 6; argue++){
                if(argue !=1){
                    if(GetLines(argue) == 7){
                        BombNumber++;
                    }
                }
            }
        }if(lineIndex == 1 && GetLines(lineIndex) == 7){
            BombNumber =7;
        }
        if(lineIndex == 2 && GetLines(lineIndex) != 7){
            for(int argue = 1 ; argue < 6; argue++){
                if(argue !=2 && argue !=3){
                    if(GetLines(argue) == 7){
                        BombNumber++;
                    }
                }
            }
        }
        if(lineIndex == 2 && GetLines(lineIndex) == 7){
            BombNumber =7;
        }
        if(lineIndex == 3 && GetLines(lineIndex) != 7){
            for(int argue = 0 ; argue < 8; argue++){
                if(argue !=2 && argue !=5){
                    if(GetLines(argue) == 7){
                        BombNumber++;
                    }
                }
            }
        }
        if(lineIndex == 3 && GetLines(lineIndex) == 7){
            BombNumber =7;
        }
        if(lineIndex == 4 && GetLines(lineIndex) != 7){
            for(int argue = 0 ; argue < 9; argue++){
                if(argue !=4){
                    if(GetLines(argue) == 7){
                        BombNumber++;
                    }
                }
            }
        }
        if(lineIndex == 4 && GetLines(lineIndex) == 7){
            BombNumber =7;
        }
        if(lineIndex == 5 && GetLines(lineIndex) != 7){
            for(int argue = 1 ; argue < 9; argue++){
                if(argue !=3 && argue !=6 && argue !=5){
                    if(GetLines(argue) == 7){
                        BombNumber++;
                    }
                }
            }
        }
        if(lineIndex == 5 && GetLines(lineIndex) == 7){
            BombNumber =7;
        }
        if(lineIndex == 6 && GetLines(lineIndex) != 7){
            for(int argue = 3 ; argue < 8; argue++){
                if(argue !=5 && argue !=6){
                    if(GetLines(argue) == 7){
                        BombNumber++;
                    }
                }
            }
        }
        if(lineIndex == 6 && GetLines(lineIndex) == 7){
            BombNumber =7;
        }
        if(lineIndex == 7 && GetLines(lineIndex) != 7){
            for(int argue = 3 ; argue < 9; argue++){
                if(argue !=7){
                    if(GetLines(argue) == 7){
                        BombNumber++;
                    }
                }
            }
        }
        if(lineIndex == 7 && GetLines(lineIndex) == 7){
            BombNumber =7;
        }
        if(lineIndex == 8 && GetLines(lineIndex) != 7){
            for(int argue = 4 ; argue < 8; argue++){
                if(argue !=6){
                    if(GetLines(argue) == 7){
                        BombNumber++;
                    }
                }
            }
        }
        if(lineIndex == 8 && GetLines(lineIndex) == 7){
            BombNumber =7;
        }

        return BombNumber;

    }




    public boolean CheckRowandColumn(int value) {

        boolean Delta = true;

        if(value != 9 ){
            System.out.println("The the selected box was not selected before");

        }
        else {
            System.out.println("The the selected box is ful try another one:");
            Delta = false;
        }
        return Delta;
    }

    public int DoubleCheck(int indexValue){
        int Check  = -1;

        int Alpha = GetLines(indexValue);

        if(Alpha == 1 || Alpha == 2 || Alpha == 0){

            if(GetLines(0) != -5 &&GetLines(1) != -5&& GetLines(2) != -5){
                Check = 9;
            }


        }

        if(Alpha == 3 || Alpha == 4 ||Alpha == 5){
            if(GetLines(3) != -5 &&GetLines(4) != -5&& GetLines(5) != -5){
                Check = 9;
            }

        }
        if (Alpha == 6 || Alpha == 7|| Alpha ==8 ){
            if(GetLines(6) != -5 &&GetLines(7) != -5&& GetLines(8) != -5){
                Check = 9;
            }

        }
        return Check;
    }

    public int TransformRowandColumn(int row, int Column){
        int ReturnValue = -1;

        if(Column ==1 ){
            if(row == 1){
                ReturnValue = 0;
            }
            if(row == 2){
                ReturnValue = 1;
            }
            if (row == 3){
                ReturnValue = 2 ;
            }
        }
        if (Column == 2) {
            if (row == 1) {
                ReturnValue = 3;
            }
            if (row == 2) {
                ReturnValue = 4;
            }
            if (row == 3){
                ReturnValue = 5;
            }
        }
        if(Column == 3){
            if (row == 1) {
                ReturnValue = 6;
            }
            if (row == 2) {
                ReturnValue = 7;
            }
            if (row == 3){
                ReturnValue = 8;
            }
        }

        return ReturnValue;
    }

    public int AskRow() {

        System.out.println("Row: ");

        int ant = scan.nextInt();

        return ant;
    }

    public int AskColumn() {

        System.out.println("Column: ");

        int delta = scan.nextInt();

        return delta;
    }

    public int GetLines(int index){

        return this.Lines[index];

    }

    public void SetLines(int index, int value){

        this.Lines[index] = value;
    }

    public void SetSelectedValue(int value){
        this.SellectedValue = value;
    }

    public int GetSelectedValue(){
        return this.SellectedValue;
    }


}