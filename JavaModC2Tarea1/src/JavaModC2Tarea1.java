
public class JavaModC2Tarea1 {
public static void main(String[] args) {
		
		System.out.println("EJERCICIO 1");
		int num1 = 20;
		int num2 = 4;
		System.out.println("El valor de la suma es: " +(num1+num2));
		System.out.println("El valor de la resta es: " +(num1-num2));
		System.out.println("El valor de la multiplicacion es: " +(num1*num2));
		System.out.println("El valor de la division es: " +(num1/num2));
		System.out.println("El valor de la modulo es: " +(num1%num2));
		
		
		System.out.println(" ");
		System.out.println("EJERCICIO 2");
		int n = 10;
		double a = 20.0;
		char c = 'c';
		System.out.println("Variable N = " +n);
		System.out.println("Variable A = " +a);
		System.out.println("Variable C = " +c);
		System.out.println("La suma entre "+n+" y " +a+ " es de " +(n+a));
		System.out.println("La resta entre "+a+" y " +n+ " es de " +(a-n));
		System.out.println("El valor numerico del caracter es: " +(int)c);
		
		
		
		System.out.println(" ");
		System.out.println("EJERCICIO 3");
		int x = 150;
		int y = 40;
		double n1 = 144.56;
		double m = 27.68;
		
		System.out.println("Valor de X = " +x);
		System.out.println("Valor de Y = " +y);
		System.out.println("Valor de N1 = " +n1);
		System.out.println("Valor de M = " +m);
		
		System.out.println("La suma entre X e Y es de " +(x+y));
		System.out.println("La diferencia entre X e Y es de " +(x-y));
		System.out.println("El producto entre X e Y es de " +(x*y));
		System.out.println("El cociente entre X e Y es de " +(x/y));
		System.out.println("El resto entre X e Y es de " +(x%y));
		
		System.out.println("La suma entre N e M es de " +(n1+m));
		System.out.println("La diferencia entre N e M es de " +(n1-m));
		System.out.println("El producto entre N e M es de " +(n1*m));
		System.out.println("El cociente entre N e M es de " +(n1/m));
		System.out.println("El resto entre N e M es de " +(n1%m));
		
		System.out.println("La suma entre X y N es de " +(x+n1));
		System.out.println("El cociente entre Y y M es de " +(y/m));
		System.out.println("El resto entre Y y M es de " +(y%m));
		
		System.out.println("El doble de la variable X es: " +x*2);
		System.out.println("El doble de la variable Y es: " +y*2);
		System.out.println("El doble de la variable N es: " +n1*2);
		System.out.println("El doble de la variable M es: " +m*2);
		
		System.out.println("La suma total es de: " +(x+y+n1+m));
		System.out.println("El producto total es de: " +(x*y*n1*m));
				
		
		System.out.println(" ");
		System.out.println("EJERCICIO 4");
		int n2= 4;
		System.out.println("Al incrementar N en 77 obtenemos el valor de: " +(n2+77));
		System.out.println("Al decrementar N en 3 obtenemos el valor de: " +(n2-3));
		System.out.println("El valor duplicado de N es: " +(n2*2));
		
		
		System.out.println(" ");
		System.out.println("EJERCICIO 5");
		int a1 = 10;
		int b1 = 20;
		int c1 = 30;
		int d1 = 40;
		b1 = c1;
		c1 = a1;
		a1 = d1;
		d1 = b1;
		System.out.println("Tras modificar los valores obtenemos que: ");
		System.out.println("Valor de A = " +a1);
		System.out.println("Valor de B = " +b1);
		System.out.println("Valor de C = " +c1);
		System.out.println("Valor de D = " +d1);
		
	}


}
