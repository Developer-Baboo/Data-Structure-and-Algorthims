public class whole_abc {
    public static void main(String[] args) {
        /*                                          A                     */
        /* for(int i = 1; i<=9; i++){
            for(int j = 1; j<=12; j++){
                if((i>=7 && j<=8) && (j>=5 && j<=9))
                {
                    System.out.print(" ");
                }
                else if((i>=3 && i<=4) && (j>=5 && j<=8)) {
                    System.out.print(" ");
                }else if((i==1&& j==1) ||(i==1 && j==12)) {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        } */

        /*                                              B        */
        /* for(int i = 1; i<=10; i++){
            for(int j =1; j<=12; j++){
                if((i >= 3 && i<=4) && (j >= 5 && j<=8) ){
                    System.out.print(" ");
                }else if((i >= 7 && i<=8) && (j >= 5 && j<=8) ){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        } */

        /*                                                         C       */
        /* for(int i = 1; i<=9; i++){
            for(int j =1; j<=12; j++){
                if((i >= 3 && i<=7) && (j >= 3 && j<=10)){
                    System.out.print(" ");
                }else if(i==5 && (j >= 3 && j<=12)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }*/ 

        /*                              D               */
        // for(int i = 1; i<=8; i++){
        //     for(int j =1; j<=8; j++){
        //         if((i >= 3 && i<=6) && (j >= 3 && j<=6)){
        //             System.out.print(" ");
        //         }
        //         else{
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // } 
        
        // for(int i = 1; i<=10; i++)
        // {
        //     for(int j = 1; j<=6; j++){
        //         if(((i >= 3 && i<=4) ||(i >=7 && i<=8)) && (j >= 3 && j<=6)){
        //             System.out.print(" ");
        //         }else if((i >4 && i<=6) && (j>4 && j<=6)){
            // System.out.print(" ");
        // }
        //         else{
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }


        /* F */
        // for(int i = 1; i<=10; i++)
        // {
        //     for(int j = 1; j<=6; j++){
        //         if(((i >= 3 && i<=4) ||(i >=7 && i<=10)) && (j >= 3 && j<=6)){
        //             System.out.print(" ");
        //         }else if((i >4 && i<=6) && (j>4 && j<=6)){
        //             System.out.print(" ");
        //         }
        //         else{
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }

        /* G */
        for(int i = 1; i<=12; i++)
        {
            for(int j = 1; j<=6; j++){
                if(((i >= 3 && i<=4) ||(i >=7 && i<=10)) && (j >= 3 && j<=6)){
                    System.out.print(" ");
                }else if((i >4 && i<=6) && (j>4 && j<=6)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
                                                      


