//Determinar la hipotenusa de un tringulo rectangulo conocidas las longitudes de sus dos catetos 
Algoritmo hipotenusa
	Repetir
		Definir a,b,c Como Real
		Escribir "ingresa cateto a"
		leer a
		Escribir "ingresa cateto b"
		Leer b
		c<-RC((a*a)+(b*b))
		Escribir "la hipotennusa del triangulo es ",c
		
		Escribir "desea realizar de nuevo la operacion,1:si 2:no"
		Leer op
	Hasta Que op<>1
	
FinAlgoritmo
