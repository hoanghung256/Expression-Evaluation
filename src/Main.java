/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author hoang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("CALCULATE POSTFIX EQUATION");
            System.out.print("Enter equation: ");
            String equation = sc.nextLine();

            CaculateExpressionNoparenthess cenp = new CaculateExpressionNoparenthess(equation);
            try {
                System.out.println(cenp.caculating());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.print("Do you want to continue (Y/N): ");
            String con = sc.nextLine();
            if (con.charAt(0) == 'N' || con.charAt(0) == 'n') {
                break;
            }
        } while (true);
    }

}
