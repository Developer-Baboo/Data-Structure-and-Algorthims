public class zig_zag {
    public static void main(String[] args) {
        for(int i = 1; i<=3; i++){
            for(int j = 1; j<=129; j++){
                if((i+j)%4 == 0){
                    System.out.print("*");
                }else if(i == 2 && j%4 == 0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
