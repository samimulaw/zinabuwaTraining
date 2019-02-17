package zin.sami.demo2;

public class PracticeOne {


    //find the maximum number form array
    public static void main(String[] args) {
        int maximum=0;
        int[] numbers= new int[5];

        numbers[0]=3;
        numbers[1]=6;
        numbers[2]=2;
        numbers[3]=9;
        numbers[4]=7;

        for(int index=0; index<=4; index++){
            if(numbers[index]> maximum){
                maximum= numbers[index];
            }
        }

        System.out.println("THE MAXIMUM NUMBER IS "+ maximum);
    }


}

