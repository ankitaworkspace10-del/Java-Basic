public class ArrayOperation {
    public static void main(String args[]){
        int[] number = {5,2,9,1};
        int sum = 0 ;
        for(int n : number){
            sum = sum + n;
        }
        System.out.println("Array sum :  " +sum);
    }
}
