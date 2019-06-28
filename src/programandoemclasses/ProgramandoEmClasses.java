
package programandoemclasses;

import Cargo.AumentoSalarial;
import Modelo.Funcionario;


public class ProgramandoEmClasses {

    
    public static void main(String[] args) {
   
        Funcionario f = new Funcionario();
        f.setNome("Bruno");
        f.setCodCargo (101);
        f.setSalario (1000);
        f.setTempServico(2);
        
        AumentoSalarial a = new AumentoSalarial(f);
        double novoSalario = a.calcularAumento();
        
        System.out.println (novoSalario);
        
        String nome = f.getNome();
        
        System.out.println(nome);
        
   
   
   
    }
    
}
