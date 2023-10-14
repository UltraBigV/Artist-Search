abstract class ArtistTable implements Interface1{
    int rowSum;
    int colSum;
    
    ArtistTable(int rowSum, int colSum){
        this.rowSum = rowSum;
        this.colSum = colSum;       
    }
    
    String [] artistName = {"Master KG  ", "DJ B Coffee", "Bruno Mars ", "F Fighters ", "T Swift    "};
    int [][] artistSales = {
                            {900000, 800000, 500000},
                            {700000, 500000, 500000},
                            {800000, 100000, 50000},
                            {100000, 200000, 200000},
                            {300000, 100000, 50000}  
                           };
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
            //System.out.println("");
            System.out.print((i+1)+". "+artistName[i]+"      ");
            for(int j=0; j<3; j++){
                System.out.print(artistSales[i][j]+"        ");
            }  
            System.out.println("");
        }
        System.out.println("");
        System.out.println("------------------------------------------------------------------------");
        System.out.print("Total:              "+total[0]+"       "+total[1]+"       "+total[2]); 
        
    }
    
}
