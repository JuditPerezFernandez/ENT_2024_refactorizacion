package ejercicio7;

public class Calculadora {
	
		
			
	    public int sumar(int a, int b) {
	        return a + b;
	    }

	    public int restar(int minuendo, int sustraendo) {
	        return minuendo - sustraendo;
	    }

	    public int multiplicar(int multiplicando, int multiplicador) {
	        return multiplicando * multiplicador;
	    }

	    public int dividir(int dividendo, int divisor) {
	        if (divisor == 0) {
	            System.out.println("Error: No se puede dividir por cero.");
	            return 0;
	        }
	        return dividendo / divisor;
	    }

	    public double calcularAreaCirculo(double radio) {
	        return Math.PI * radio * radio;
	    }
	    
	    public double calcularVolumenCilindro(double radio, double altura) {
	        return calcularAreaCirculo(radio) * altura;
	    }
	}


