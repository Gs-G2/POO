/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.visao;

import br.com.controle.Semestre;
import javax.swing.JOptionPane;

/**
 *
 * @author guilhermesouza.gomes
 */
public class Objeto {
    public static void main(String[] args) {
        Semestre s = new Semestre();
        s.setValor(9);
        JOptionPane.showMessageDialog(null, s.dobro());
    }
}
