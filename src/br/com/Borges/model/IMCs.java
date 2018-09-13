
package br.com.Borges.model;

/**
 *
 * @author Erica
 */
public class IMCs {
    
    private double altura;
    private double peso;
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    //fazendo o calculo
    public double getIMCs(){
        
        return peso / (altura*altura);
    }
    
}
