
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Equation {
   double a,b,c;
   double x;
   
   
   public double getNum(String st){
       Scanner sc = new Scanner(System.in);
       System.out.print(st);
       return sc.nextDouble();
   }
   
   public void Superlative (){
       boolean tf = false;
        List<Double> IUput = new ArrayList<>();
       a = getNum("Enter A: ");
       IUput.add(a);
       b = getNum("Enter B: ");
       IUput.add(b);
       tf = SuperlativeSolve(a, b);
       if(!tf) IUput.add(x);
       
       PrintList("Number is Odd: ", FindOdd(IUput));
       PrintList("Number is Even: ", FindEven(IUput));
       PrintList("Number is Perfect Square ",FindPS(IUput));
     }
   
    private boolean SuperlativeSolve(double a, double b){
         boolean tf = false;
         double x1 = 0;
         if(a == 0){
            
            SEquation0(b);
            tf =true;
           }
        else {
          x1 = SEquation1(a, b);
             setX(x1);
            }
        if(!tf) System.out.println("Solution: x = " + x1); 
       
         return  tf;
     }
   
     public void  Quadratic(){
       boolean tf= false;
       List<Double> IUput = new ArrayList<>();
       a = getNum("Enter A: ");
       IUput.add(a);
       b = getNum("Enter B: ");
       IUput.add(b); 
       c = getNum("Enter C: ");
       IUput.add(c);
       
       if(a==0) {
           tf= SuperlativeSolve(b, c);
           if(!tf)  IUput.add(x);
       }
        
       if(a!= 0) {
           double [] x12 = QuadraticSolve(a, b, c);
           if(x12[2] == 1) {
               IUput.add(x12[0]);
               IUput.add( x12[1]);
               System.out.println("Solution: x1 =" + x12[0] +" and x2 = " +x12[1]);
           }
           else System.out.println("Equation has no solution");            
       }
           
       
       
       
       PrintList("Number is Odd: ", FindOdd(IUput));
       PrintList("Number is Even: ", FindEven(IUput));
       PrintList("Number is Perfect Square ",FindPS(IUput));
     }
     
     private double []QuadraticSolve( double a, double b, double c){
          double x1= 0, x2 = 0;
          double i =0;
          double delta = b * b - 4 * a * c;
          if(delta >= 0){
          x1 = (-b + Math.sqrt(delta)) / (2 * a);
          x2 = (-b - Math.sqrt(delta)) / (2 * a);
          i=1;
        } 
          double[] xx = {x1, x2, i};
          return xx;
     }
       
       
       
       
       
       
       
   
   private void SEquation0(double b){
       if (b == 0) System.out.println("Equation has many solution"); 
       else     System.out.println("Equation has no solution"); 
   }
   
   private double SEquation1 (double a, double b){
       return -b/a;
   }
   
   private boolean Odd_even (double i){
       if(i%2 == 0) return false;
       return true;
   }
    private List<Double> FindOdd(List<Double>IU){
         List <Double> odd = new ArrayList<>();
         for(double n : IU){
            if(Odd_even(n)) odd.add(n);    
             }
         return odd;
    }
    private List<Double> FindEven(List<Double>IU){
         List <Double> even = new ArrayList<>();
         for(double n : IU){
            if(!Odd_even(n)) even.add(n);    
             }
         return even;
    }
    
    private List<Double> FindPS(List<Double>IU){
        List<Double> ps = new ArrayList<>();
        for(double n : IU){
            if (n==0) continue;
            double sqrtN = Math.sqrt(n);
            if(sqrtN== Math.floor(n)) ps.add(n);
        }
        return ps;
    }
    
    private void PrintList(String St, List<Double> L){
        System.out.print(St);
        System.out.println(L.toString());
    }

    public void setX(double x) {
        this.x = x;
    }
    
    
}
