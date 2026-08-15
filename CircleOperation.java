public class CircleOperation {
    public static void main(String args[]){
        double radius = 7.5;
     
     System.out.printf("circumference : %.2f\n", calculateCircumference(radius));
     System.out.printf("area : %.2f\n", calculateArea(radius));
    }
    public static double calculateCircumference(double r){
     return(2*Math.PI * r);
    }
    public static double calculateArea(double r){
     return (Math.PI * r *r);
    }
    
}
