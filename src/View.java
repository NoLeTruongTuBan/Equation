/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class View {
    public void Mainview(){
        System.out.println("========= Equation Program =========");
        String[] st = {"Calculate Superlative Equation", "Calculate Quadratic Equation", "Exit"};
        for(int i =0;i<st.length ;i++) System.out.println(i+1 + ". "+ st[i]);
        System.out.print("Please choice one option: ");
    }
}
