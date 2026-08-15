public class MultiplicationTable {
    public void Table(int number){
        for (int i=1 ; i<=10 ; i++ ){
            System.out.printf("%d * %d = %d ", number,i,number*i);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MultiplicationTable table = new MultiplicationTable();
        table.Table(4);
    }
    
}
