public class zero_one_pattern {
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++){
            if(i%2==0){ //2
                for(int j = 0; j<i; j++){
                    if(j%2==0){
                        System.out.print("0");
                    }
                    else{
                        System.out.print("1");
                    }
                }
                // System.out.print("0");
            }
            else{
                for(int j = 1; j<=i; j++){
                    if(j%2==0){
                        System.out.print("0");
                    }
                    else{
                        System.out.print("1");
                    }
                    // System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
