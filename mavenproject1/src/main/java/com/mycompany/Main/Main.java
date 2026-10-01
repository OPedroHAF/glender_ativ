/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Main;

import java.util.ArrayList;

/**
 *
 * @author 1518869
 */
public class Main {

    public static void Main(String[] args) {
       
        
    }
      
    public void atribuirDadosVetSala(){
        veterinarios.add(createVet("Jose", "11122233301", "Caninos", "31991577033"));
        veterinarios.add(createVet("Vivian", "11122233302", "Felinos", "31991573307"));
        veterinarios.add(createVet("Tung", "11122833706", "Caninos", "31999998888"));
        
        salas.add("1", "1", 10, "cirurgia", veterinarios.get(0));
        salas.add("2", "1", 6, "consulta", veterinarios.get(1));
        salas.add("3", "1", 3, "checkup", veterinarios.get(2));
    }
    public ArrayList<Veterinario> veterinarios = new ArrayList<>();
    public ArrayList<Sala> salas = new ArrayList<>();
    
    public Veterinario createVet(String nome, String cpf, String especialidade, String telefone){
        return new Veterinario(nome, cpf, especialidade, telefone);
    }
    public Sala createSala(String numero, String bloco, int capacidadeMaximaAnimais, String tipo, Veterinario veterinarioResp){
        return new Sala(numero, bloco, capacidadeMaximaAnimais, tipo, veterinarioResp);
    }
   
}
