
package Cargo;

import Modelo.Funcionario;


public class AumentoSalarial {
    
    private Funcionario func;

    public AumentoSalarial(Funcionario func) {
        this.func = func;
    }
    public double calcularAumento() {
        return 0;
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
