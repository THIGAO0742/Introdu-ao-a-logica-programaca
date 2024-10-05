package CalculadoraImposto;

import java.util.Scanner;

public class pessoa{
    protected int idade;
    protected String name;
    protected int tamFamilia;
    public static Scanner tec = new Scanner(System.in);

    pessoa(){}
    pessoa(String nm, int Id, int Fmilia){
        this.name = nm;
        this.idade = Id;
        this.tamFamilia = Fmilia;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTamFamilia() {
        return tamFamilia;
    }
    public void setTamFamilia(int tamFamilia) {
        this.tamFamilia = tamFamilia;
    }

  public void dadosPessoa(){
    System.out.println("Dados Pessoais");
    System.out.print("Nome:");
    this.name = tec.nextLine();
    System.out.print("Idade:");
    this.idade = tec.nextInt();
    System.out.print("Dependentes:");
    this.tamFamilia = tec.nextInt();
  }  
}
