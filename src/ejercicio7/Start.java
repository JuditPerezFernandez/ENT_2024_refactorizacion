package ejercicio7;

public class Start {

	public static void main(String[] args) throws Exception {

		Calculadora calc = new Calculadora();

		System.out.println("Suma: " + calc.sumar(10, 5));
		System.out.println("Resta: " + calc.restar(10, 5));
		System.out.println("Multiplicación: " + calc.multiplicar(10, 5));
		System.out.println("División: " + calc.dividir(10, 5));

		System.out.println("Área del círculo: " + calc.calcularAreaCirculo(Calculadora.RADIO));
		System.out.println(
				"Volumen del cilindro: " + calc.calcularVolumenCilindro(Calculadora.RADIO, Calculadora.ALTURA));
	}
}




