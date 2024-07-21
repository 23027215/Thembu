import java.util.Scanner;


public class Mzamane {
    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter student marks: ");
        int FinalMark = scanner.nextInt();


        if (FinalMark >=0 && FinalMark <=29){
            System.out.println("Level 1 ="+FinalMark+"%"+" (Not acieved-Fail.)");
        }

        else if (FinalMark >=30 && FinalMark <=39){
            System.out.println("Level 2 ="+FinalMark+"%"+" (Elementary achievement.)");
        }

        else if (FinalMark >=40 && FinalMark <=49){
            System.out.println("Level 3 ="+FinalMark+"%"+" (Adequate achievement.)");
        }

        else if (FinalMark >=50 && FinalMark <=59){
            System.out.println("Level 4 ="+FinalMark+"%"+" (Moderate achievement.)");
        }

        else if (FinalMark >=60 && FinalMark<=69){
            System.out.println("Level 5 ="+FinalMark+"%"+" (Substantial achievement.)");
        }

        else if (FinalMark >=70 && FinalMark<=79){
            System.out.println("Level 6 ="+FinalMark+"%"+" (Meritorious achievement.)");
        }

        else if (FinalMark>=80 && FinalMark<=100) {
            System.out.println("Level 7 ="+FinalMark+ "%" +" (Outstanding achievement.)");
        }
    }
}

