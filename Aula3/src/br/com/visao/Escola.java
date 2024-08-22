/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.visao;

import br.com.controle.Aluno;
import javax.swing.JOptionPane;

/**
 *
 * @author guilhermesouza.gomes
 */
public class Escola {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        
        for (int i = 0; i < 2; i++){
            a.setNota1(Double.valueOf(JOptionPane.showInputDialog("Insira a primeira nota")));
            a.setNota2(Double.valueOf(JOptionPane.showInputDialog("Insira a segunda nota")));
        }
        JOptionPane.showMessageDialog(null, "Maior media da turma"+a.getMediaMaior());
        JOptionPane.showMessageDialog(null, "Menor media da turma "+a.getMediaMenor());
        JOptionPane.showMessageDialog(null, "Media da turma "+a.getMediaTurma(2));
    }
    
    
}
