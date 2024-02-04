public class Display {


    private String[] DisplayArray = {"_","_","_","_","_","_","_","_","_"};


    public void SetFullArray(String[] ArrayFull){
        this.DisplayArray = ArrayFull;
    }

    public void SetMovementArray(int index, String value){
        this.DisplayArray[index] = value;
    }




    public void ShowFullArray(){
        for(int e = 0 ; e<DisplayArray.length; e++){

            System.out.print(DisplayArray[e]+ " ");

            if(e==2 || e== 5){

                System.out.print("\n");
            }}

        System.out.println(" ");

        for(int eIndex = 0; eIndex<10; eIndex++){
            System.out.print("==");
        }
        System.out.println(" ");
    }
}
