/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Main;

/**
 *
 * @author 1518869
 */
public class Procedimento {
    private String nome;
    private String duracaoEstimada;
    private double valor;
    private String nivelComplexidade;
    
    
    
    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public String getDuracaoEstimada() {
        return duracaoEstimada;
    }

    public double getValor() {
        return valor;
    }

    public String getNivelComplexidade() {
        return nivelComplexidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracaoEstimada(String duracaoEstimada) {
        this.duracaoEstimada = duracaoEstimada;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setNivelComplexidade(String nivelComplexidade) {
        this.nivelComplexidade = nivelComplexidade;
    }
    
    
}
