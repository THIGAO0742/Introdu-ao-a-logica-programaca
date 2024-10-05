package CalculadoraImposto;

import java.util.Scanner;

public class funcionario extends pessoa {
    private double salario;
    private double iRenda;
    private double salarioFinal;
    public static Scanner tec = new Scanner(System.in);

    funcionario(){}
    funcionario(double S, double IR, double sf){
    this.iRenda =IR;
    this.salario = S;
    this.salarioFinal = sf;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }
    public void setSalariFinal(double salariof) {
        this.salarioFinal = salariof;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getiRenda() {
        return iRenda;
    }
    public void setiRenda(double iRenda) {
        this.iRenda = iRenda;
    }
    
    public void dadosFuncionario(){
        dadosPessoa();
        System.out.println("Dados do Funcionario");
        System.out.print("Salário:");
        this.salario = tec.nextDouble(); 
        ImpostoRenda();
        this.salarioFinal = this.salario - this.iRenda -(this.tamFamilia * 150.00); 
        System.out.println("Salario Liquido do Funcionario:"+ String.format("%.2f",this.salarioFinal));
    }

    public void ImpostoRenda(){
        if(this.salario<= 2000.00){
            System.out.println("Isento de IR");
        } else if(this.salario >= 2001.00 && this.salario <= 4000.00){
            System.out.println("IR DE 7,5%");
            this.iRenda = this.salario * 0.075;
        } else if(this.salario>= 4001.00&& this.salario <= 8000.00){
            System.out.println("IR DE 15%");
            this.iRenda = this.salario * 0.15;
        }else if(this.salario>= 8001.00&& this.salario <= 12000.00){
            System.out.println("IR DE 22,5%");
            this.iRenda = this.salario * 0.225;
        }else if(this.salario>= 12001.0){
            System.out.println("IR DE 27,5%");
            this.iRenda = this.salario * 0.275;
        }
    }

   

}//class