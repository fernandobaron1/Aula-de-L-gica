
package Cargo;

import Modelo.Funcionario;


public class AumentoSalarial {
    
    private Funcionario func;

    public AumentoSalarial(Funcionario func) {
        this.func = func;
    }
    public double calcularAumento() {
        double novoSalario = 0;
        int codCargo = this.func.getcodCargo();
        
        if (codCargo == 101) {
            novoSalario = this.calcGerente();
        } else if (codCargo == 102) {
            novoSalario = this.calcEngenheiro();
        } else if (codCargo ==103) {
            novoSalario = this.calcTecnico();
        } else {
            novoSalario = this.calcGeral();
        }
        return novoSalario;
    }
    private double calcGerente() {
        
        int tempo = this.func.getTempServico(); 
        double percentual = 0;
        
        if (tempo >= 1 & tempo < 2) {
        percentual = 10;
    } else if (tempo <= 3) {
            percentual = 20;
    } else {
            percentual = 25;
            }
    double salario = this.func.getSalario();
    
    double novoSalario = (salario * percentual) / 100;
    novoSalario = salario + novoSalario;
        
        return novoSalario;
    }
    private double calcEngenheiro() {
        
        int tempo = this.func.getTempServico(); 
        double percentual = 0;
        
        if (tempo >= 1 & tempo < 2) {
        percentual = 10;
    } else if (tempo <= 3) {
            percentual = 20;
    } else {
            percentual = 25;
            }
    double salario = this.func.getSalario();
    
    double novoSalario = (salario * percentual) / 100;
    novoSalario = salario + novoSalario;
        
        return novoSalario;
    }
    private double calcTecnico() {
        
        int tempo = this.func.getTempServico(); 
        double percentual = 0;
        
        if (tempo >= 1 & tempo < 2) {
        percentual = 10;
    } else if (tempo <= 3) {
            percentual = 20;
    } else {
            percentual = 25;
            }
    double salario = this.func.getSalario();
    
    double novoSalario = (salario * percentual) / 100;
    novoSalario = salario + novoSalario;
        
        return novoSalario;
    }
    private double calcGeral() {
        int tempo = this.func.getTempServico();
        double percentual = 0;
        
        if (tempo >=3) {
            percentual =35;
        }
        double salario = this.func.getSalario();
        
        double novoSalario = (salario * percentual)/100;
        novoSalario = salario + novoSalario;
        return 0;
    }
}
