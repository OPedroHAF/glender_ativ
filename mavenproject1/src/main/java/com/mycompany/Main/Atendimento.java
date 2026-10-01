/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Main;

/**
 *
 * @author 1518869
 */
public class Atendimento {
    private String codigo;
    private String nomeAnimal;
    private String especie;
    private String nomeTutor;
    private String data;
    private String horario;
    private String status;

    public Atendimento(String codigo, String nomeAnimal, String especie, String nomeTutor, String data, String horario, String status) {
        this.codigo = codigo;
        this.nomeAnimal = nomeAnimal;
        this.especie = especie;
        this.nomeTutor = nomeTutor;
        this.data = data;
        this.horario = horario;
        this.status = status;
    }

    public void exibirAtendimento(){
        System.out.println("===================");
            System.out.println("Codigo: " + this.getCodigo());
            System.out.println("Nome Animal: " + this.getNomeAnimal());
            System.out.println("Especie: " + this.getEspecie());
            System.out.println("Nome Tuor: " + this.getNomeTutor());
            System.out.println("Data: " + this.getData());
            System.out.println("Horario: " + this.getHorario());
            System.out.println("Status: " + this.getStatus());
            System.out.println("===================");
    }
    
    
    //GETTERS E SETTERS
    public String getCodigo() {
        return codigo;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public String getEspecie() {
        return especie;
    }

    public String getNomeTutor() {
        return nomeTutor;
    }

    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }

    public String getStatus() {
        return status;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setNomeTutor(String nomeTutor) {
        this.nomeTutor = nomeTutor;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void cadastrarAtendimento(){
    
    }
    
}
