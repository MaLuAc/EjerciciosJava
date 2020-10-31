import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		ejercicio1y2();	
		ejercicio6();
		ejercicio7();
		ejercicio9y10();
}

private static void ejercicio1y2(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese un número entero");
	int valorA = sc.nextInt();
	System.out.println("Ingrese un número entero");
	int valorB = sc.nextInt();
	
	int resultado = valorA + valorB;
	System.out.println("La suma es: " + resultado);
	resultado = valorA - valorB;
	System.out.println("La resta es: " + resultado);	
	resultado = valorA * valorB;	
	System.out.println("La multiplicación es: " + resultado);
	resultado = valorA / valorB;
	if (valorB != 0) {
	System.out.println("La división es: " + resultado);		
	} else {
		System.out.println("No es posible dividir por 0");
	}
	if (valorA > valorB) {
		System.out.println("El mayor es: " + valorA);
	} else { if (valorA < valorB) {
		System.out.println("El mayor es: " + valorB);
	} else {
		System.out.println("Los valores son iguales");
	}
  }
}
	

private static void ejercicio6(){
		 Scanner sc = new Scanner(System.in);
		 short mes;
		 
	System.out.println("Ingrese un mes");
	mes = (short) sc.nextInt();
	
	switch(mes)
	{
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 12:
		System.out.println("El día tiene 31 días");;
		break;
	case 2: 
		System.out.println("El día tiene 28 días");
		break;
	case 4:
	case 6:
	case 9:
	case 11:
		System.out.println("El día tiene 30 días");
		break;
	default: 
		System.out.println("No es un mes válido, ingrese un valor entre 1 y 12");
	}
	
	if ((mes <1) || (mes > 12)) {
		System.out.println("No es un mes válido, ingrese un valor entre 1 y 12");
	}
	if (mes == 2) {
		System.out.println("El día tiene 28 días");
	}
	if ((mes == 4) || (mes == 6) || (mes == 9)|| (mes == 11)){
		System.out.println("El día tiene 30 días");
	} else {
		System.out.println("El día tiene 31 días");
	}
}
	
	
private static void ejercicio7() {
		
		int i;
//		for(i = 0; i < 200; i++) {
//			if((i % 2) == 0) { //decimos que si el resto de la división es 2, el número es par
	for (i = 0; i < 200; i = i + 2) { //de este modo ahorras el if, sumando de a 2 en for
		System.out.println(i); 
		}
	}

	
private static void ejercicio9y10() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese varios números enteros y un número negativo para finalizar.");
		long acumulador = 0; //long es el entero para números grandes
		int numA;
		int máximo = 0;
		numA = sc.nextInt();
		while(numA >= 0) {
			acumulador = acumulador + numA;
			if(numA > máximo) {
				máximo = numA;
			}
			numA = sc.nextInt();
		}	
		System.out.println("La suma es: " + acumulador);
		System.out.println("El máximo es: " + máximo);
		}
	  }