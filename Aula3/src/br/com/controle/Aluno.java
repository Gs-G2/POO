/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author guilhermesouza.gomes
 */
public class Aluno {
    private double nota1;
    private double nota2;
    private double media;
    private double mediaMenor = 999999999;
    private double mediaMaior;

    public double getMediaTurma(int turma) {
        return mediaTurma / turma;
    }
    private double mediaTurma;

    public double getMediaMenor() {
        return mediaMenor;
    }

    public double getMediaMaior() {
        return mediaMaior;
    }

    public double getMedia() {
        return media;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
        this.media = (this.nota1 + this.nota2) / 2;
        if (this.mediaMenor > this.media) {
            this.mediaMenor = this.media;
        }
        if (this.mediaMaior < this.media) {
            this.mediaMaior = this.media;
        }
        this.mediaTurma += this.media;
    }
}
