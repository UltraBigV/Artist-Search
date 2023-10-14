import java.util.Scanner;
public class ArtistSearchOop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int outcome = 0;
        subclass table = new subclass(0,0,0);        
        int input = 0;
        boolean check = true;
        boolean tryCheck = true;
        while(tryCheck){
            try{
                table.salesSummary();
                System.out.println("");
                System.out.println("Please enter a number between 0 and 6");
                input = scan.nextInt();
                outcome = table.salesSummary(input);
                while(check){
                    if(outcome == 0){
                        break;
                    }
                    else{
                        System.out.println("");
                        System.out.println("Please enter a number between 0 and 6");
                        input = scan.nextInt();
                        outcome = table.salesSummary(input);
                    }

                }
                tryCheck = false;
            }
            catch(Exception e){
                scan.next();
                System.out.println("An error has occured, please try again");
                System.out.println("");
            }
        }        
    }    
}
