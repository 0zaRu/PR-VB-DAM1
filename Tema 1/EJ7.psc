Algoritmo n_impares
	Escribir 'Introdce el n�mero hasta el que se van a sumar (este n� incluido) los n�meros impares: '
	Leer max
	imp <- 1
	Repetir
		s <- s+imp
		imp <- imp+2
	Hasta Que imp>max
	Escribir s
FinAlgoritmo
