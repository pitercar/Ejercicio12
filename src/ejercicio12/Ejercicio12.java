/*
* Programa que calcule la nota definitiva de cada estudiante
* Promedio de notas definitivas del curso
* Porcentaje de perdedores
 */
package ejercicio12;
import java.util.*;

/**
 *
 * @author Piter
 */
public class Ejercicio12 {
    
    private double nota1, nota2, nota3, nota4;
    
    public void cargarDatos(){
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Digite la nota 1... ");
        nota1=entrada.nextDouble();
        
        System.out.println("Digite la nota 2... ");
        nota2=entrada.nextDouble();
        
        System.out.println("Digite la nota 3... ");
        nota3=entrada.nextDouble();
        
        System.out.println("Digite la nota 4... ");
        nota4=entrada.nextDouble();        
    }
    
    public void calcularPorcentaje(){
        
        double porcentaje1=nota1*0.25;
	double porcentaje2=nota2*0.20;		
	double porcentaje3=nota3*0.25;
	double porcentaje4=nota4*0.30;
	double definitiva=(porcentaje1+porcentaje2+porcentaje3+porcentaje4);
        
        System.out.println("La nota definitiva es "+definitiva);
    }
    
    
    

    
    
}
