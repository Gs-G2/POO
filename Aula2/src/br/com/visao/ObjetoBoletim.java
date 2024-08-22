/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.visao;

import br.com.controle.Boletim;
import javax.swing.JOptionPane;

/**
 *
 * @author guilhermesouza.gomes
 */
public class ObjetoBoletim {
    public static void main(String[] args) {
        Boletim b = new Boletim();
        b.setNota1(Double.valueOf(JOptionPane.showInputDialog("Insira um numero")));
        b.setNota2(Double.valueOf(JOptionPane.showInputDialog("Insira um numero")));
        b.calcularMedia();
        if (b.getMedia() < 7){
            JOptionPane.showMessageDialog(null, "Reprovado: "+b.getMedia());
        }
        else if (b.getMedia() >= 7){
            JOptionPane.showMessageDialog(null, "Aprovado: "+b.getMedia());
        }
    }
}
