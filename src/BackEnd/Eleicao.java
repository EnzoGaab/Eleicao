/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import javax.swing.JOptionPane;

/**
 *
 * @author Enzo
 */
public class Eleicao {
    
    private int Candidato1;
    private int Candidato2;
    private int Candidato3;
    private int Candidato4;
    private int Nulos;
    private int Brancos;

    public Eleicao(){
        this.Candidato1 = 0;
        this.Candidato2 = 0;
        this.Candidato3 = 0;
        this.Candidato4 = 0;
        this.Nulos = 0;
        this.Brancos = 0;
    }
    
    public int getCandidatoVotos1(){
        return this.Candidato1;
    }

    public void setCandidato1() {
        if(JOptionPane.showConfirmDialog(null,"Deseja confirmar voto em Candidato 1 ") 
                    == JOptionPane.YES_OPTION ){
        this.Candidato1++;
        }
        else 
             JOptionPane.showMessageDialog(null,"Voto não atribuido ao Candidato 1 ");
    }
    
    
    public float getCandidato1Porcentagem(){
        return getPorcentagem(this.Candidato1);
    }
    
    public int getCandidatoVotos2(){
        return this.Candidato2;
    }
    
    public void setCandidato2(){
        if(JOptionPane.showConfirmDialog(null,"Deseja confirmar voto em Candidato 2 ") 
                    == JOptionPane.YES_OPTION ){
        this.Candidato2++;
        }
        else 
             JOptionPane.showMessageDialog(null,"Voto não atribuido ao Candidato 2 ");
    
    }
    
    public float getCandidato2Porcentagem(){
        return getPorcentagem(this.Candidato2);
    }
    
     public int getCandidatoVotos3(){
        return this.Candidato3;
    }
    
    public void setCandidato3(){
       if(JOptionPane.showConfirmDialog(null,"Deseja confirmar voto em Candidato 3 ") 
                    == JOptionPane.YES_OPTION ){
        this.Candidato4++;
        }
        else 
             JOptionPane.showMessageDialog(null,"Voto não atribuido ao Candidato 3 ");
    
    }
    
    public float getCandidato3Porcentagem(){
        return getPorcentagem(this.Candidato3);
    }
    
     public int getCandidatoVotos4(){
        return this.Candidato4;
    }
    
    public void setCandidato4(){
        if(JOptionPane.showConfirmDialog(null,"Deseja confirmar voto em Candidato 4 ") 
                    == JOptionPane.YES_OPTION ){
        this.Candidato4++;
        }
        else 
             JOptionPane.showMessageDialog(null,"Voto não atribuido ao Candidato 4 ");
    
    }
    
    public float getCandidato4Porcentagem(){
        return getPorcentagem(this.Candidato4);
    }
    
     public int getNulosVotos(){
        return this.Nulos;
    }
    
    public void setNulos(){
       if(JOptionPane.showConfirmDialog(null,"Deseja confirmar voto em Nulo ") 
                    == JOptionPane.YES_OPTION ){
        this.Nulos++;
        }
        else 
             JOptionPane.showMessageDialog(null,"Voto não atribuido ao Nulo ");
    
    }
    
    public float getNulosPorcentagem(){
        return getPorcentagem(this.Nulos);
    }
    
     public int getBrancosVotos(){
        return this.Brancos;
    }
    
    public void setBrancos(){
        if(JOptionPane.showConfirmDialog(null,"Deseja confirmar voto em Branco ") 
                    == JOptionPane.YES_OPTION ){
        this.Brancos++;
        }
        else 
             JOptionPane.showMessageDialog(null,"Voto não atribuido ao Voto em Branco ");
    
    }
    
    public float getBrancosPorcentagem(){
        return getPorcentagem(this.Brancos);
    }
    
    public int getTotalVotos(){
        return this.Candidato1 + this.Candidato2 + this.Candidato3 + this.Candidato4 + this.Nulos + this.Brancos;
    }
    
    private float getPorcentagem(int Votos){
    if(this.getTotalVotos() > 0){
        return Votos / (float)this.getTotalVotos() * 100;
        }
        else{
        return 0;
        }
    }
}
