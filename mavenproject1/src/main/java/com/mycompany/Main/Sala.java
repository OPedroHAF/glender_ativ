/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Main;
import java.util.ArrayList;
/**
 *
 * @author 1518869
 */
public class Sala {
    private String numero;
    private String bloco;
    private int capacidadeMaximaAnimais;
    private String tipo;
    private Veterinario veterinarioResponsavel;
    private ArrayList<Atendimento> atendimentos;
    
    public Sala(String numero, String bloco, int capacidadeMaximaAnimais, String tipo, Veterinario veterinarioResponsavel) {
        this.numero = numero;
        this.bloco = bloco;
        this.capacidadeMaximaAnimais = capacidadeMaximaAnimais;
        this.tipo = tipo;
        this.veterinarioResponsavel = veterinarioResponsavel;
    }
    
    
    public void atribuirAtendimento(Atendimento atendimento){
        atendimentos.add(atendimento);
    }
    
    public void atribuirVeterinario(Veterinario veterinario){
        this.setVeterinarioResponsavel(veterinario);
    }
    
    public void exibirAtendimentos(){
        
        for(Atendimento atendimento: atendimentos){
            atendimento.exibirAtendimento();
        }
        System.out.println("Total de atendimentos: " + this.atendimentos.size());
    }
    
    public void buscarAtendimentoStatus(String status){
        for(Atendimento atendimento: atendimentos){
            if(atendimento.getStatus().equals(status)){
                atendimento.exibirAtendimento();
                System.out.println("Sala: " + this.getNumero());
                System.out.println("Vet. Resp.: " + this.getVeterinarioResponsavel());
                System.out.println("===================");
            }
        }
    }
    
    public void exibirAtendimentoEspecifico(String codigo){
        for(Atendimento atendimento: atendimentos){
            if(atendimento.getCodigo().equals(codigo)){
                atendimento.exibirAtendimento();
            }
        }
    }
    //GETTERS E SETTERS
    public String getNumero() {
        return numero;
    }

    public String getBloco() {
        return bloco;
    }

    public int getCapacidadeMaximaAnimais() {
        return capacidadeMaximaAnimais;
    }

    public String getTipo() {
        return tipo;
    }

    public Veterinario getVeterinarioResponsavel() {
        return veterinarioResponsavel;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public void setCapacidadeMaximaAnimais(int capacidadeMaximaAnimais) {
        this.capacidadeMaximaAnimais = capacidadeMaximaAnimais;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVeterinarioResponsavel(Veterinario veterinarioResponsavel) {
        this.veterinarioResponsavel = veterinarioResponsavel;
    }
    
    
    
}
