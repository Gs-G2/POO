/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.visao;

import br.com.controle.Compra;
import javax.swing.JOptionPane;

/**
 *
 * @author guilhermesouza.gomes
 */
public class Filial {
    public static void main(String[] args) {
        Compra c = new Compra();
        
        for (int i = 0; i < 5; i++) {
            c.setValor(Double.valueOf(JOptionPane.showInputDialog("Insira o valor da compra")));
        }
        JOptionPane.showMessageDialog(null, "Valor das compras "+c.getSoma());
        JOptionPane.showMessageDialog(null, "Valor da maior compra "+c.getMaior());
    
    }
}
