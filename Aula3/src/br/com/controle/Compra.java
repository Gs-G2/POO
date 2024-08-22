/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author guilhermesouza.gomes
 */
public class Compra {
    private double valor;
    private double soma;
    private double maior;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
        if (this.valor > this. maior) {
            this.maior = this.valor;
        }
        this.soma += this.valor;
    }

    public double getSoma() {
        return soma;
    }

    public double getMaior() {
        return maior;
    }
    
}
