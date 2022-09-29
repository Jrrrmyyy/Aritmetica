/*
Esta clase contiene todas las operaciones aritmeticas que voy a necesitar
en nuestro programa princiapl
 */
package operaciones;

/**
 *
 * @author Alumno Mañana
 */
public class OperacionesAritmeticas {
    
    private int a;
    private int b;

    public OperacionesAritmeticas() {
    }

    public OperacionesAritmeticas(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OperacionesAritmeticas{a=").append(a);
        sb.append(", b=").append(b);
        sb.append('}');
        return sb.toString();
    }
    
    // Método de suma
    public int sumar(int a, int b){
        return a + b;
    }
    // Método resta
    public int resta(int a, int b){
        return a - b;
    }
    // Método multiplicación
    public int multiplicacion(int a, int b){
        return a * b;
    }
    // Método división
    public int division(int a, int b){
        return a / b;
    }
    
    
    
}
