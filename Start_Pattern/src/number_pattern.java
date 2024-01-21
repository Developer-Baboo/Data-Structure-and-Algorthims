public class number_pattern {
    public static void main(String[] args) {
        for(int i = 1; i<=5; i++){
            for(int j = 5; j>=i; j--){
                System.out.print(" ");   
            }
            for(int k = 1; k<=i; k++){

                System.out.print(k+" ");   
            }
            // for(int l = 5; l>=i; l--){
            //     System.out.print(" ");   
            // }
            System.out.println();
        }

        //below part
        // for(int i = 1; i<=5; i++){
        //     for(int j = 5; j>=1; j--){
        //         System.out.print("");   
        //     }
        //     System.out.println("*");
        // }
    }
}
