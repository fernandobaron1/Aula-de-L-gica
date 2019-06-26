
package Modelo;


public class Funcionario {
    
    private String nome;
    private double salario;
    private int codcargo;
    private int tempServico;
    
    public String getNone() {
        return this.nome;
        
    }
    public void setNome (String nome){
        this.nome = nome;
    } 

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCodcargo() {
        return codcargo;
    }

    public void setCodcargo(int codcargo) {
        this.codcargo = codcargo;
    }

    public int getTempServico() {
        return tempServico;
    }

    public void setTempServico(int tempServico) {
        this.tempServico = tempServico;
    }
    
}
