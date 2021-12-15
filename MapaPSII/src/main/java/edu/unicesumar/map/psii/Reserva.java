/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unicesumar.map.psii;

import java.text.DecimalFormat;

/**
 *
 * @author Denilson
 */
public class Reserva {
    private int quantidadeDiaria;
    private int quantidadePessoas;
    private double valorDiaria;
    private int capacidadeSuite;
    private int qtDeCriancaAcimaDe2Anos;
    
    //Calculando a Diária da hospedagem.
    public String calcularDiaria(){
        DecimalFormat dc = new DecimalFormat("0.00");
        double somaDiaria;
        if (quantidadeDiaria <= 7){
            somaDiaria = (valorDiaria * quantidadeDiaria);
        } else {            
            double diaria = valorDiaria * quantidadeDiaria;
            double desconto = (diaria*10)/100;
            somaDiaria = (diaria - desconto);
        }   
        return dc.format(somaDiaria);
    }
    
     //Verificando se a suíte comporta o número de hospedes.
    public String verificarCapacidade(){
        String capacidade;
        quantidadePessoas = quantidadePessoas + qtDeCriancaAcimaDe2Anos;
        if (quantidadePessoas <= capacidadeSuite){
            capacidade = "Suíte comporta a capacidade de pessoas.";         
        } else {
            capacidade = "Suíte não suporta essa quantidade de pessoas.";  
        }
        return capacidade;
    }

    public void setCapacidadeSuite(int capacidadeSuite) {
        this.capacidadeSuite = capacidadeSuite;
    }       
    
    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public void setQuantidadeDiaria(int quantidadeDiaria) {
        this.quantidadeDiaria = quantidadeDiaria;
    }   

    public void setQtDeCriancaAcimaDe2Anos(int qtDeCriancaAcimaDe2Anos) {
        this.qtDeCriancaAcimaDe2Anos = qtDeCriancaAcimaDe2Anos;
    }

    public int getQtDeCriancaAcimaDe2Anos() {
        return qtDeCriancaAcimaDe2Anos;
    }

    public int getQuantidadeDiaria() {
        return quantidadeDiaria;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public int getCapacidadeSuite() {
        return capacidadeSuite;
    }
    
}
