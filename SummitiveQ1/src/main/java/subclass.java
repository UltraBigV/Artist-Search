
import java.util.Scanner;

public class subclass extends ArtistTable{
    int index;
    
    subclass(int index, int rowSum, int colSum){
        super(rowSum, colSum);
        this.index = index;
    }
    
    @Override
    void salesSummary(){
        int [] total = new int[5];
        int sum;
        for(int i=0; i<3; i++){
            sum = 0;
            for(int j=0; j<5; j++){
                sum += artistSales[j][i];
            }
            total[i] = sum;
        }
        System.out.println("  Artist Name     DVD Sales    Blu Ray Sales    CD Sales"); 
        System.out.println("------------------------------------------------------------------------");
        for(int i=0; i<5; i++){
            
            System.out.print((i+1)+". "+artistName[i]+"      ");
            for(int j=0; j<3; j++){
                System.out.print(artistSales[i][j]+"        ");
            }  
            System.out.println("");
        }
        System.out.println("");
        System.out.println("------------------------------------------------------------------------");
        System.out.print("   Total:           "+total[0]+"       "+total[1]+"       "+total[2]); 
        
    }
    
    int salesSummary(int artistPosition){
        Scanner scan = new Scanner(System.in);
        int sentinal = 0;
        int artPosition;
        
        int [] rowTotal= new int[5];
        for(int x = 0; x<5; x++){
            rowSum = 0;
            for(int y = 0; y<3; y++){
                rowSum += artistSales[x][y];
            }
            rowTotal[x] = rowSum;
        }
        
        while(sentinal<7){
            if(artistPosition>5){
                sentinal +=1;
                System.out.println("Please enter a valid choice and try again. You have: "+(6-sentinal)+" chances remailing");
                artistPosition = scan.nextInt();               
            }
            else if(artistPosition<0){
                return 0;
                
            }
            else{
                switch(artistPosition){
                case 1:
                    artPosition = 0;
                    System.out.println("Artist Name: "+artistName[artPosition]+
                            "\nCD Sale: "+artistSales[artPosition][2]+
                            "\nDVD Sale: "+artistSales[artPosition][0]+
                            "\nBlu Ray Sale: "+artistSales[artPosition][1]+
                            "\nTotal: "+rowTotal[artPosition]);
                    return 1;                   
                case 2:
                    artPosition = 1;
                    System.out.println("Artist Name: "+artistName[artPosition]+
                            "\nCD Sale: "+artistSales[artPosition][2]+
                            "\nDVD Sale: "+artistSales[artPosition][0]+
                            "\nBlu Ray Sale: "+artistSales[artPosition][1]+
                            "\nTotal: "+rowTotal[artPosition]);
                    return 1;
                case 3:
                    artPosition = 2;
                    System.out.println("Artist Name: "+artistName[artPosition]+
                            "\nCD Sale: "+artistSales[artPosition][2]+
                            "\nDVD Sale: "+artistSales[artPosition][0]+
                            "\nBlu Ray Sale: "+artistSales[artPosition][1]+
                            "\nTotal: "+rowTotal[artPosition]);
                    return 1;
                case 4:
                    artPosition = 3;
                    System.out.println("Artist Name: "+artistName[artPosition]+
                            "\nCD Sale: "+artistSales[artPosition][2]+
                            "\nDVD Sale: "+artistSales[artPosition][0]+
                            "\nBlu Ray Sale: "+artistSales[artPosition][1]+
                            "\nTotal: "+rowTotal[artPosition]);
                    return 1;
                case 5:
                    artPosition = 4;
                    System.out.println("Artist Name: "+artistName[artPosition]+
                            "\nCD Sale: "+artistSales[artPosition][2]+
                            "\nDVD Sale: "+artistSales[artPosition][0]+
                            "\nBlu Ray Sale: "+artistSales[artPosition][1]+
                            "\nTotal: "+rowTotal[artPosition]);
                    return 1;
                }
                return 1;
            }
        }
    return 2;   
    }
}
