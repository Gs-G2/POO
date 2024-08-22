/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import javax.swing.JOptionPane;

/**
 *
 * @author guilhermesouza.gomes
 */
public class Dobro {
    public static void main(String[] args) {
        int num;
        num = Integer.valueOf(JOptionPane.showInputDialog( "Insira um numero:"));
        JOptionPane.showMessageDialog(null, "O Dobro de "+num+" é "+num*2);
    }
}
