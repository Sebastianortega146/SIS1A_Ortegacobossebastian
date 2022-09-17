//Desarolla un algoritmo que permita leer tres valores y almacenan en las variables A,B y C
Algoritmo sin_titulo
	Definir a,b,c como entero 
	Escribir  "Escribir primer numero"
	Leer a
	Escribir  "Escribir segundo numero"
	leer b
	Escribir "Escribir tercer numero"
	Leer c
	si a>b y a>c Entonces
		Escribir  "el mayor es",a
	SiNo
		si b>a y b>c Entonces
			Escribir "el mayor es",b
		SiNo
			si c>a y c>b Entonces
				Escribir "el mayor es",c
			FinSi
		FinSi
	FinSi
	si a<b  y a<c Entonces
		Escribir "el menor es",a
	SiNo
		si b<a y b<c Entonces
			Escribir "el menor es",b
		SiNo
			si c<a y c<b Entonces
				Escribir "el menor es",c
			SiNo
				escribir "numeros iguales"
			FinSi
		FinSi
	FinSi
FinAlgoritmo

