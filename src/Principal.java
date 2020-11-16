import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		ejercicio1y2();	
		ejercicio4y5();
		ejercicio6();
		ejercicio7();
		ejercicio910y11();
}

private static void ejercicio1y2(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese un n�mero entero");
	int valorA = sc.nextInt();
	System.out.println("Ingrese un n�mero entero");
	int valorB = sc.nextInt();
	
	int resultado = valorA + valorB;
	System.out.println("La suma es: " + resultado);
	resultado = valorA - valorB;
	System.out.println("La resta es: " + resultado);	
	resultado = valorA * valorB;	
	System.out.println("La multiplicaci�n es: " + resultado);
	resultado = valorA / valorB;
	if (valorB != 0) {
	System.out.println("La divisi�n es: " + resultado);		
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

private static void ejercicio4y5(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese un n�mero entero entre 1 y 10");
	int nota1 = sc.nextInt();
	int nota2 = sc.nextInt();
	int nota3 = sc.nextInt();
	int promedio = nota1 + nota2 + nota3;
	
	if ((nota1 <=10) && (nota2 <=10) && (nota3 <=10) && (nota1 >= 0) && (nota2 >= 0) && (nota3 >= 0)){
	System.out.println("El promedio es: " + promedio/3);
   
	if ((promedio>=4 && nota1 >=4) && (nota2 >=4) && (nota3 >=4)){
		System.out.println("El alumno est� aprobado");	
	if  ((nota3==10 || promedio/3>=8)){
	    System.out.println("El alumno ha promocionado");
	} else {
		System.out.println("El alumno no ha promocionado");
	}
  } else {
  System.out.println("El alumno est� desaprobado"); 
  }
	
} else {
		 System.out.println("Valor incorrecto.");
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
		System.out.println("El d�a tiene 31 d�as");;
		break;
	case 2: 
		System.out.println("El d�a tiene 28 d�as");
		break;
	case 4:
	case 6:
	case 9:
	case 11:
		System.out.println("El d�a tiene 30 d�as");
		break;
	default: 
		System.out.println("No es un mes v�lido, ingrese un valor entre 1 y 12");
	}
	
	if ((mes <1) || (mes > 12)) {
		System.out.println("No es un mes v�lido, ingrese un valor entre 1 y 12");
	}
	if (mes == 2) {
		System.out.println("El d�a tiene 28 d�as");
	}
	if ((mes == 4) || (mes == 6) || (mes == 9)|| (mes == 11)){
		System.out.println("El d�a tiene 30 d�as");
	} else {
		System.out.println("El d�a tiene 31 d�as");
	}
}
	
	
private static void ejercicio7() {
		
		int i;
//		for(i = 0; i < 200; i++) {
//			if((i % 2) == 0) { //decimos que si el resto de la divisi�n es 2, el n�mero es par
	for (i = 0; i < 200; i = i + 2) { //de este modo ahorras el if, sumando de a 2 en for
		System.out.println(i); 
		}
	}

	
private static void ejercicio910y11() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese varios n�meros enteros y un n�mero negativo para finalizar.");
		long acumulador = 0; //long es el entero para n�meros grandes
		int numA;
		int m�ximo = 0;
		numA = sc.nextInt();
		while(numA >= 0) {
			acumulador = acumulador + numA;
			if(numA > m�ximo) {
				m�ximo = numA;
			}
			numA = sc.nextInt();
		}	
		System.out.println("La suma es: " + acumulador);
		System.out.println("El m�ximo es: " + m�ximo);
		}
	  }