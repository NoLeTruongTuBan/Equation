
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Equation E = new Equation();
      View V = new View();
      Scanner sc = new Scanner(System.in);
      int  i =0;
      
      while(i!= 3){
          V.Mainview();
          i = sc.nextInt();
          switch (i) {
              case 1:
                  E.Superlative();
                  break;
              case 2: 
                  E.Quadratic();
                  break;
              case 3: 
                  break;
              default:
                  System.err.println("Wrong Input");
                  break;
          }
      }
    }
    
}
