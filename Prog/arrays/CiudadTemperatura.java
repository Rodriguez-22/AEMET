package arrays;

import java.util.Scanner;

// Clase que gestiona las temperaturas de varias ciudades y estaciones
public class CiudadTemperatura {
    Scanner scanner = new Scanner(System.in);

    // Constantes para el número de ciudades y estaciones
    private static final int CIUDADES = 5;
    private static final int ESTACIONES = 4;

    // Arreglo con los nombres de las ciudades
    private static final String[] ciudades = { "Barcelona", "Madrid", "Almeria", "Torremolinos", "Toledo" };

    // Arreglo con los nombres de las estaciones
    private static final String[] estaciones = { "Invierno", "Primavera", "Verano", "Otoño" };

    // Matriz que almacena las temperaturas de cada ciudad para cada estación
    private double[][] temperaturas;

    // Constructor que inicializa la matriz de temperaturas
    public CiudadTemperatura() {
        this.temperaturas = new double[CIUDADES][ESTACIONES];
    }

    // Método que genera temperaturas aleatorias entre 20 y 40 grados para cada
    // ciudad y estación
    public void generarTemp() {
        for (int i = 0; i < CIUDADES; i++) { // Recorre cada ciudad
            for (int j = 0; j < ESTACIONES; j++) { // Recorre cada estación
                temperaturas[i][j] = Math.random() * (40 - 20) + 20; // Genera un número aleatorio entre 20 y 40
                temperaturas[i][j] = Math.round(temperaturas[i][j] * 10.0) / 10.0; // Redondea a un decimal
            }
        }
    }

    // Método que imprime las temperaturas en forma de tabla
    public void imprimirTemperaturasTabla() {
        System.out.print("Estacion:       "); // Encabezado para las estaciones
        for (String ciudad : ciudades) { // Imprime los nombres de las ciudades
            System.out.printf("%-15s", ciudad);
        }
        System.out.println("\n" + "=".repeat(80)); // Línea separadora

        for (int j = 0; j < ESTACIONES; j++) { // Recorre las estaciones
            System.out.printf("%-14s", estaciones[j]); // Imprime el nombre de la estación
            for (int i = 0; i < CIUDADES; i++) { // Recorre las ciudades
                System.out.printf("%-15.2f", temperaturas[i][j]); // Imprime la temperatura formateada
            }
            System.out.println(); // Salto de línea para la siguiente estación
        }
    }

    // Método para obtener el índice de una estación a partir de su nombre
    public int getIndexEstacion(String estacion) {
        for (int i = 0; i < ESTACIONES; i++) { // Recorre todas las estaciones
            if (estaciones[i].equalsIgnoreCase(estacion)) { // Compara ignorando mayúsculas/minúsculas
                return i; // Retorna el índice si coincide
            }
        }
        return -1; // Retorna -1 si no encuentra la estación
    }

    // Método para obtener el índice de una ciudad a partir de su nombre
    public int getIndexCiudades(String ciudad) {
        for (int i = 0; i < CIUDADES; i++) { // Recorre todas las ciudades
            if (ciudades[i].equalsIgnoreCase(ciudad)) { // Compara ignorando mayúsculas/minúsculas
                return i; // Retorna el índice si coincide
            }
        }
        return -1; // Retorna -1 si no encuentra la ciudad
    }

    // Método para imprimir una tabla con las temperaturas
    public void ImprimirTemperaturasTabla() {
        System.out.print("Estacion:       "); // Imprime el encabezado de "Estación"
        for (int i = 0; i < CIUDADES; i++) { // Recorre todas las ciudades
            System.out.printf("%-15s", ciudades[i]); // Imprime el nombre de cada ciudad
        }
        System.out.println("\n" + "=".repeat(80)); // Imprime una línea de separación
        for (int j = 0; j < ESTACIONES; j++) { // Recorre todas las estaciones
            System.out.printf("%-14s", estaciones[j]); // Imprime el nombre de la estación
            for (int i = 0; i < CIUDADES; i++) { // Recorre todas las ciudades para una estación
                System.out.printf("%-15.2f", temperaturas[i][j]); // Imprime la temperatura de cada ciudad para la
                                                                  // estación actual
            }
            System.out.println(); // Salto de línea
        }
    }

    // Método para imprimir todas las temperaturas de cada ciudad en cada estación
    public void ImprimirTemp() {
        for (int i = 0; i < CIUDADES; i++) { // Recorre todas las ciudades
            for (int j = 0; j < ESTACIONES; j++) { // Recorre todas las estaciones
                System.out.println("Temperatura de " + ciudades[i] + " en " + estaciones[j] + " : "
                        + temperaturas[i][j]); // Imprime la temperatura de cada ciudad en cada estación
            }
        }
    }

    // Método para imprimir las ciudades que tienen temperaturas superiores a 30
    // grados en una estación específica
    public void tempsuperiorA30(String estacion) {
        int imod = getIndexEstacion(estacion); // Obtiene el índice de la estación
        System.out.println("Estacion: " + estacion); // Imprime el nombre de la estación
        System.out.println(" Ciudad:");
        for (int i = 0; i < CIUDADES; i++) { // Recorre todas las ciudades
            if (temperaturas[i][imod] >= 30) { // Verifica si la temperatura de la ciudad es superior a 30 grados
                System.out.println("- " + ciudades[i]); // Imprime el nombre de la ciudad que cumple la condición
            }
        }
        System.out.println();
    }

    // Método para imprimir las estaciones que tienen temperaturas superiores a 30
    // grados en una ciudad específica
    public void estacionesMas30ºC(String ciudad) {
        int iciud = getIndexCiudades(ciudad); // Obtiene el índice de la ciudad
        System.out.println("Ciudad: " + ciudad); // Imprime el nombre de la ciudad
        System.out.println("Estaciones con mas de 30ºC: ");
        for (int j = 0; j < ESTACIONES; j++) { // Recorre todas las estaciones
            if (temperaturas[iciud][j] >= 30) { // Verifica si la temperatura en la estación es superior a 30 grados
                System.out.println(" -" + estaciones[j]); // Imprime el nombre de la estación que cumple la condición
            }
        }
        System.out.println();
    }

    // Método para imprimir las ciudades que han superado los 30 grados en todas las
    // estaciones
    public void ciudadCon30ºSiempre() {
        int contador = 0; // Inicializa el contador
        for (int i = 0; i < CIUDADES; i++) { // Recorre todas las ciudades
            for (int j = 0; j < ESTACIONES; j++) { // Recorre todas las estaciones
                if (temperaturas[i][j] >= 30) { // Verifica si la temperatura es superior a 30 grados
                    contador++; // Incrementa el contador
                }
            }
            if (contador == ESTACIONES) { // Verifica si la ciudad ha superado los 30 grados en todas las estaciones
                System.out.println(ciudades[i] + " ha superado los 30ºC en todas las estaciones"); // Imprime el
                                                                                                   // resultado
            }
            contador = 0; // Resetea el contador para la siguiente ciudad
        }
    }

    // Método para imprimir las estaciones que tienen menos de 30 grados en todas
    // las ciudades
    public void estacionesMenos30ºC() {
        int[] menor = new int[ESTACIONES]; // Array para contar cuántas ciudades tienen menos de 30 grados en cada
                                           // estación
        for (int j = 0; j < ESTACIONES; j++) { // Recorre todas las estaciones
            int contador = 0; // Inicializa el contador
            for (int i = 0; i < CIUDADES; i++) { // Recorre todas las ciudades
                if (temperaturas[i][j] < 30) { // Verifica si la temperatura es inferior a 30 grados
                    contador++; // Incrementa el contador
                }
            }
            menor[j] = contador; // Guarda el contador en el array
        }
        for (int j = 0; j < ESTACIONES; j++) { // Recorre todas las estaciones
            System.out.println("En la estacion de " + estaciones[j] + " tiene " + menor[j]
                    + " ciudades con menos de 30 grados siempre"); // Imprime cuántas ciudades tienen menos de 30 grados
                                                                   // en cada estación
        }
    }

    // Método para imprimir la estación con la mayor temperatura en una ciudad
    // específica
    public void tempMayor(String ciudad) {
        int iciud = getIndexCiudades(ciudad); // Obtiene el índice de la ciudad
        if (iciud == -1) { // Verifica si la ciudad no existe
            System.out.println("Ciudad no encontrada");
            return;
        }
        double maxTemp = -1; // Inicializa la temperatura máxima
        int estacionMax = -1; // Inicializa el índice de la estación con la temperatura máxima
        for (int j = 0; j < ESTACIONES; j++) { // Recorre todas las estaciones
            if (temperaturas[iciud][j] > maxTemp) { // Verifica si la temperatura es mayor que la máxima registrada
                maxTemp = temperaturas[iciud][j]; // Actualiza la temperatura máxima
                estacionMax = j; // Actualiza el índice de la estación con la temperatura máxima
            }
        }
        System.out.println("La estacion con mayor temperatura de " + ciudad + " es " + estaciones[estacionMax]
                + " con una temperatura de " + maxTemp); // Imprime la estación con la mayor temperatura y su valor
    }

    // Método para imprimir la ciudad con la mayor temperatura en una estación
    // específica
    public void mayorTempEstacion(String estacion) {
        int iest = getIndexEstacion(estacion); // Obtiene el índice de la estación
        if (iest == -1) { // Verifica si la estación no existe
            System.out.println("Estacion no encontrada");
            return;
        }
        double maxTemp = -1; // Inicializa la temperatura máxima
        int ciudadMax = -1; // Inicializa el índice de la ciudad con la temperatura máxima
        for (int i = 0; i < CIUDADES; i++) { // Recorre todas las ciudades
            if (temperaturas[i][iest] > maxTemp) { // Verifica si la temperatura es mayor que la máxima registrada
                maxTemp = temperaturas[i][iest]; // Actualiza la temperatura máxima
                ciudadMax = i; // Actualiza el índice de la ciudad con la temperatura máxima
            }
        }
        System.out.println("La ciudad con la mayor temperatura en " + estacion + " es "
                + ciudades[ciudadMax] + " con una temperatura de " + maxTemp); // Imprime la ciudad con la mayor
                                                                               // temperatura y su valor
    }

    // Método para imprimir la temperatura media de una ciudad
    public void tempMedia(String ciudad) {
        int iciud = getIndexCiudades(ciudad); // Obtiene el índice de la ciudad
        if (iciud == -1) { // Verifica si la ciudad no existe
            System.out.println("Ciudad no encontrada");
            return;
        }
        double suma = 0; // Inicializa la suma de las temperaturas
        for (int j = 0; j < ESTACIONES; j++) { // Recorre todas las estaciones
            suma += temperaturas[iciud][j]; // Suma las temperaturas de todas las estaciones
        }
        double media = suma / ESTACIONES; // Calcula la temperatura media
        System.out.println("La temperatura media de " + ciudad + " es " + media); // Imprime la temperatura media de la
                                                                                  // ciudad
    }

    // Método para imprimir la temperatura media en una estación específica
    public void tempMediaEstacion(String estacion) {
        int iest = getIndexEstacion(estacion); // Obtiene el índice de la estación
        if (iest == -1) { // Verifica si la estación no existe
            System.out.println("Estacion no encontrada");
            return;
        }
        double suma = 0; // Inicializa la suma de las temperaturas
        for (int i = 0; i < CIUDADES; i++) { // Recorre todas las ciudades
            suma += temperaturas[i][iest]; // Suma las temperaturas de todas las ciudades
        }
        double media = suma / CIUDADES; // Calcula la temperatura media
        System.out.println("La temperatura media en " + estacion + " es " + media); // Imprime la temperatura media de
                                                                                    // la estación
    }

    // Método para encontrar la estación con el mayor número de ciudades con
    // temperaturas inferiores a 30 grados
    public void estacionMenos_temp() {
        int maxMenosTemp = -1; // Inicializa el máximo de ciudades con temperaturas inferiores a 30 grados
        int estMaxMenosTemp = -1; // Inicializa el índice de la estación con el máximo de ciudades con menos de 30
                                  // grados
        for (int j = 0; j < ESTACIONES; j++) { // Recorre todas las estaciones
            int contador = 0; // Inicializa el contador
            for (int i = 0; i < CIUDADES; i++) { // Recorre todas las ciudades
                if (temperaturas[i][j] < 30) { // Verifica si la temperatura es inferior a 30 grados
                    contador++; // Incrementa el contador
                }
            }
            if (contador > maxMenosTemp) { // Verifica si el contador es mayor que el máximo actual
                maxMenosTemp = contador; // Actualiza el máximo de ciudades con menos de 30 grados
                estMaxMenosTemp = j; // Actualiza el índice de la estación con el máximo de ciudades con menos de 30
                                     // grados
            }
        }
        System.out.println(
                "La estación con menos temp es " + estaciones[estMaxMenosTemp] + " en " + maxMenosTemp + " ciudades."); // Imprime la estación con el mayor número de ciudades con menos de 30 grados
    }

    // Método para encontrar la estación con la menor temperatura de una ciudad
    // específica
    public void menorTempCiudad(String ciudad) {
        int iciud = getIndexCiudades(ciudad); // Obtiene el índice de la ciudad
        if (iciud == -1) { // Verifica si la ciudad no existe
            System.out.println("Ciudad no encontrada");
            return;
        }
        double minTemp = 40; // Inicializa la temperatura mínima
        int estacionMin = -1; // Inicializa el índice de la estación con la temperatura mínima
        for (int j = 0; j < ESTACIONES; j++) { // Recorre todas las estaciones
            if (temperaturas[iciud][j] < minTemp) { // Verifica si la temperatura es menor que la mínima registrada
                minTemp = temperaturas[iciud][j]; // Actualiza la temperatura mínima
                estacionMin = j; // Actualiza el índice de la estación con la temperatura mínima
            }
        }
        System.out.println("La estación con menor temperatura de " + ciudad + " es " + estaciones[estacionMin]
                + " con una temperatura de " + minTemp); // Imprime la estación con la menor temperatura y su valor
    }

    // Calcula la diferencia entre la temperatura más alta y más baja de una ciudad
    // a lo largo del año
    public void variacionMaximaCiudad(String ciudad) {
        int iciud = getIndexCiudades(ciudad); // Obtiene el índice de la ciudad
        if (iciud == -1) { // Verifica si la ciudad no existe
            System.out.println("Ciudad no encontrada");
            return;
        }
        double maxTemp = Double.MIN_VALUE; // Inicializa la temperatura máxima
        double minTemp = Double.MAX_VALUE; // Inicializa la temperatura mínima
        for (int j = 0; j < ESTACIONES; j++) { // Recorre todas las estaciones
            if (temperaturas[iciud][j] > maxTemp) { // Verifica si la temperatura es mayor que la máxima registrada
                maxTemp = temperaturas[iciud][j]; // Actualiza la temperatura máxima
            }
            if (temperaturas[iciud][j] < minTemp) { // Verifica si la temperatura es menor que la mínima registrada
                minTemp = temperaturas[iciud][j]; // Actualiza la temperatura mínima
            }
        }
        double variacion = maxTemp - minTemp; // Calcula la variación de temperatura
        System.out.println("La variación máxima de temperatura en " + ciudad
                + " es de " + variacion + " grados."); // Imprime la variación máxima de temperatura en la ciudad
    }

    // Método para identificar la estación que ha registrado la temperatura más baja
    // en todas las ciudades
    public void estacionTempMinimaAnual() {
        double minTemp = Double.MAX_VALUE; // Inicializa la temperatura mínima con el valor máximo posible
        String estacionMin = ""; // Inicializa el nombre de la estación con la temperatura mínima
        for (int j = 0; j < ESTACIONES; j++) { // Recorre todas las estaciones
            for (int i = 0; i < CIUDADES; i++) { // Recorre todas las ciudades
                if (temperaturas[i][j] < minTemp) { // Verifica si la temperatura es menor que la mínima registrada
                    minTemp = temperaturas[i][j]; // Actualiza la temperatura mínima
                    estacionMin = estaciones[j]; // Actualiza el nombre de la estación con la temperatura mínima
                }
            }
        }
        System.out.println("La estación con la temperatura mínima anual es " + estacionMin
                + " con una temperatura de " + minTemp); // Imprime la estación con la temperatura mínima y su valor
    }

    // Método para encontrar la ciudad que ha registrado la temperatura más alta en
    // todo el conjunto de datos
    public void ciudadTempMaximaAnual() {
        double maxTemp = Double.MIN_VALUE; // Inicializa la temperatura máxima con el valor mínimo posible
        String ciudadMax = ""; // Inicializa el nombre de la ciudad con la temperatura máxima
        for (int i = 0; i < CIUDADES; i++) { // Recorre todas las ciudades
            for (int j = 0; j < ESTACIONES; j++) { // Recorre todas las estaciones
                if (temperaturas[i][j] > maxTemp) { // Verifica si la temperatura es mayor que la máxima registrada
                    maxTemp = temperaturas[i][j]; // Actualiza la temperatura máxima
                    ciudadMax = ciudades[i]; // Actualiza el nombre de la ciudad con la temperatura máxima
                }
            }
        }
        System.out.println("La ciudad con la temperatura máxima anual es " + ciudadMax
                + " con una temperatura de " + maxTemp); // Imprime la ciudad con la temperatura máxima y su valor
    }

    // Método para calcular el promedio anual de temperaturas por ciudad
    public void promedioAnualPorCiudad() {
        for (int i = 0; i < CIUDADES; i++) { // Recorre todas las ciudades
            double suma = 0; // Inicializa la suma de las temperaturas
            for (int j = 0; j < ESTACIONES; j++) { // Recorre todas las estaciones
                suma += temperaturas[i][j]; // Suma las temperaturas de todas las estaciones
            }
            double promedio = suma / ESTACIONES; // Calcula la temperatura promedio anual
            System.out.println("La temperatura promedio anual de " + ciudades[i] + " es " + promedio);// Imprime la temperatura promedio anual de la ciudad
        }
    }

    // Método para encontrar la ciudad cuya temperatura varía menos entre estaciones
    public void ciudadMenorVariacionTemperatura() {
        double menorVariacion = Double.MAX_VALUE; // Inicializa la menor variación con el valor máximo posible
        String ciudadMenorVariacion = ""; // Inicializa el nombre de la ciudad con la menor variación

        for (int i = 0; i < CIUDADES; i++) { // Recorre todas las ciudades
            double maxTemp = Double.MIN_VALUE; // Inicializa la temperatura máxima
            double minTemp = Double.MAX_VALUE; // Inicializa la temperatura mínima

            for (int j = 0; j < ESTACIONES; j++) { // Recorre todas las estaciones
                if (temperaturas[i][j] > maxTemp) { // Verifica si la temperatura es mayor que la máxima registrada
                    maxTemp = temperaturas[i][j]; // Actualiza la temperatura máxima
                }
                if (temperaturas[i][j] < minTemp) { // Verifica si la temperatura es menor que la mínima registrada
                    minTemp = temperaturas[i][j]; // Actualiza la temperatura mínima
                }
            }

            double variacion = maxTemp - minTemp; // Calcula la variación de temperatura
            if (variacion < menorVariacion) { // Verifica si la variación es menor que la menor variación registrada
                menorVariacion = variacion; // Actualiza la menor variación
                ciudadMenorVariacion = ciudades[i]; // Actualiza el nombre de la ciudad con la menor variación
            }
        }

        System.out.println("La ciudad con menor variación de temperatura es " + ciudadMenorVariacion
                + " con una variación de " + menorVariacion + " grados."); // Imprime la ciudad con la menor variación
                                                                           // de temperatura y su valor
    }

    // Encuentra cuál es la estación más cálida y la más fría en promedio
    // considerando todas las ciudades.
    public void estacionMasCalidaYFriaPromedio() {
        double[] sumaTemperaturas = new double[ESTACIONES]; // Array para sumar las temperaturas de cada estación
        for (int j = 0; j < ESTACIONES; j++) { // Recorre todas las estaciones
            for (int i = 0; i < CIUDADES; i++) { // Recorre todas las ciudades
                sumaTemperaturas[j] += temperaturas[i][j]; // Suma la temperatura de cada ciudad para la estación actual
            }
        }
        double maxPromedio = Double.MIN_VALUE; // Inicializa el promedio máximo
        double minPromedio = Double.MAX_VALUE; // Inicializa el promedio mínimo
        int estacionMax = -1; // Inicializa el índice de la estación con el promedio máximo
        int estacionMin = -1; // Inicializa el índice de la estación con el promedio mínimo

        for (int j = 0; j < ESTACIONES; j++) { // Recorre todas las estaciones
            double promedio = sumaTemperaturas[j] / CIUDADES; // Calcula el promedio de temperatura para la estación
            if (promedio > maxPromedio) { // Verifica si el promedio es mayor que el máximo registrado
                maxPromedio = promedio; // Actualiza el promedio máximo
                estacionMax = j; // Actualiza el índice de la estación con el promedio máximo
            }
            if (promedio < minPromedio) { // Verifica si el promedio es menor que el mínimo registrado
                minPromedio = promedio; // Actualiza el promedio mínimo
                estacionMin = j; // Actualiza el índice de la estación con el promedio mínimo
            }
        }

        System.out.println("La estación más cálida en promedio es " + estaciones[estacionMax]
                + " con un promedio de " + maxPromedio + " grados."); // Imprime la estación más cálida y su promedio
        System.out.println("La estación más fría en promedio es " + estaciones[estacionMin]
                + " con un promedio de " + minPromedio + " grados."); // Imprime la estación más fría y su promedio
    }

    // Calcula cuántas ciudades nunca alcanzan temperaturas de 30 grados o más en
    // ninguna estación.
    public void ciudadesNuncaSuperan30() {
        int contador = 0; // Inicializa el contador
        for (int i = 0; i < CIUDADES; i++) { // Recorre todas las ciudades
            boolean supera30 = false; // Inicializa el indicador de si la ciudad supera los 30 grados
            for (int j = 0; j < ESTACIONES; j++) { // Recorre todas las estaciones
                if (temperaturas[i][j] >= 30) { // Verifica si la temperatura es mayor o igual a 30 grados
                    supera30 = true; // Actualiza el indicador
                    break; // Sale del bucle si se supera los 30 grados
                }
            }
            if (!supera30) { // Verifica si la ciudad nunca superó los 30 grados
                contador++; // Incrementa el contador
            }
        }
        System.out.println("Número de ciudades que nunca superan los 30 grados: " + contador); // Imprime el número de
                                                                                               // ciudades que nunca
                                                                                               // superan los 30 grados
    }

    // Lista las estaciones donde todas las ciudades tienen temperaturas mayores a
    // 25 grados.
    public void estacionesTodasCiudadesSuperan25() {
        System.out.println("Estaciones donde todas las ciudades superan los 25 grados:"); // Imprime el encabezado
        for (int j = 0; j < ESTACIONES; j++) { // Recorre todas las estaciones
            boolean todasSuperan25 = true; // Inicializa el indicador de si todas las ciudades superan los 25 grados
            for (int i = 0; i < CIUDADES; i++) { // Recorre todas las ciudades
                if (temperaturas[i][j] <= 25) { // Verifica si la temperatura es menor o igual a 25 grados
                    todasSuperan25 = false; // Actualiza el indicador
                    break; // Sale del bucle si alguna ciudad no supera los 25 grados
                }
            }
            if (todasSuperan25) { // Verifica si todas las ciudades superan los 25 grados
                System.out.println("- " + estaciones[j]); // Imprime la estación
            }
        }
    }

    // Identifica la ciudad que tiene la mayor cantidad de estaciones con
    // temperaturas por debajo de 15 grados.
    public void ciudadMasEstacionesFrias() {
        int maxEstacionesFrias = -1; // Inicializa el máximo de estaciones frías
        String ciudadMax = ""; // Inicializa el nombre de la ciudad con más estaciones frías

        for (int i = 0; i < CIUDADES; i++) { // Recorre todas las ciudades
            int estacionesFrias = 0; // Inicializa el contador de estaciones frías
            for (int j = 0; j < ESTACIONES; j++) { // Recorre todas las estaciones
                if (temperaturas[i][j] < 15) { // Verifica si la temperatura es menor que 15 grados
                    estacionesFrias++; // Incrementa el contador de estaciones frías
                }
            }
            if (estacionesFrias > maxEstacionesFrias) { // Verifica si el número de estaciones frías es mayor que el
                                                        // máximo registrado
                maxEstacionesFrias = estacionesFrias; // Actualiza el máximo de estaciones frías
                ciudadMax = ciudades[i]; // Actualiza el nombre de la ciudad con más estaciones frías
            }
        }

        System.out.println("La ciudad con más estaciones frías (<15 grados) es "
                + ciudadMax + " con " + maxEstacionesFrias + " estaciones."); // Imprime la ciudad con más estaciones
                                                                              // frías y su número
    }



    //METODO imprimirResultados PARA IMPRIMIR LOS RESULTADOS DE LOS METODOS USANDO DISTINTOS Sout

    public void imprimirResultados() {
    
        System.out.println("Generando datos aleatorios...");
        generarTemp();
        System.out.println();
    
        System.out.println("Temperaturas en formato tabla:");
        imprimirTemperaturasTabla();
        System.out.println();
    
        System.out.println("Estaciones donde todas las ciudades tienen temperaturas > 25 grados:");
        estacionesTodasCiudadesSuperan25();
        System.out.println();
    
        System.out.println("Variación máxima de temperatura:");
        System.out.print("Ingrese el nombre de una ciudad o escriba 'todas' para ver todas: ");
        String ciudad = scanner.nextLine();
        if (ciudad.equalsIgnoreCase("todas")) {
            for (String c : ciudades) {
                variacionMaximaCiudad(c);
            }
        } else {
            variacionMaximaCiudad(ciudad);
        }
        System.out.println();
    
        System.out.println("Ciudad con menor variación de temperatura:");
        ciudadMenorVariacionTemperatura();
        System.out.println();
    
        System.out.println("Estación más cálida y más fría en promedio:");
        estacionMasCalidaYFriaPromedio();
        System.out.println();
    
        System.out.println("Número de ciudades que nunca superan los 30 grados:");
        ciudadesNuncaSuperan30();
        System.out.println();
    
        System.out.println("Ciudad con la mayor temperatura anual:");
        ciudadTempMaximaAnual();
        System.out.println();
    
        System.out.println("Estación con la temperatura más baja anual:");
        estacionTempMinimaAnual();
        System.out.println();
    
        System.out.println("Promedio anual por ciudad:");
        System.out.print("Ingrese el nombre de una ciudad o escriba 'todas' para ver todas: ");
        ciudad = scanner.nextLine();
        if (ciudad.equalsIgnoreCase("todas")) {
            promedioAnualPorCiudad();
        } else {
            tempMedia(ciudad);
        }
        System.out.println();
    
        System.out.println("Ciudad con más estaciones frías (<15 grados):");
        ciudadMasEstacionesFrias();
        System.out.println();
    
        System.out.println("Mayor temperatura por estación:");
        System.out.print("Ingrese el nombre de una estación o escriba 'todas' para ver todas: ");
        String estacion = scanner.nextLine();
        if (estacion.equalsIgnoreCase("Invierno")) {
            for (String e : estaciones) {
                mayorTempEstacion(e);
            }
        } else {
            mayorTempEstacion(estacion);
        }
        System.out.println();
    
        scanner.close();
    }

    // METODO toString Para imprimir la informacion sin usar Sout
    public String toString() {
        String info = ""; // Crear una cadena para construir el resultado final
        info += "=== Tabla de Temperaturas ===\n"; // Agregar un encabezado para la tabla de temperaturas
        info += "Estacion:       "; // Agregar el título para las estaciones
        
        for (String ciudad : ciudades) { // Recorrer todas las ciudades
            info += String.format("%-15s", ciudad); // Agregar el nombre de cada ciudad a la tabla
        }
        info += "\n" + "=".repeat(80) + "\n"; // Agregar una línea de separación
        
        for (int j = 0; j < ESTACIONES; j++) { // Recorrer todas las estaciones
            info += String.format("%-14s", estaciones[j]); // Agregar el nombre de la estación actual
            for (int i = 0; i < CIUDADES; i++) { // Recorrer todas las ciudades
                info += String.format("%-15.2f", temperaturas[i][j]); // Agregar la temperatura de cada ciudad para la estación actual
            }
            info += "\n"; // Agregar un salto de línea después de cada estación
        }
        
        info += "\n=== Resultados de Métodos ===\n"; // Agregar un encabezado para los resultados de los métodos
        
        // Método: Ciudades que superan 30°C por estación
        info += "\n--- Ciudades que superan 30°C por estación ---\n";
        for (String estacion : estaciones) { // Recorrer todas las estaciones
            info += "Estación: " + estacion + "\n";
            info += " Ciudades: ";
            int imod = getIndexEstacion(estacion); // Obtener el índice de la estación actual
            for (int i = 0; i < CIUDADES; i++) { // Recorrer todas las ciudades
                if (temperaturas[i][imod] >= 30) { // Verificar si la temperatura supera los 30°C
                    info += ciudades[i] + ", "; // Agregar el nombre de la ciudad que cumple la condición
                }
            }
            info += "\n";
        }
        
        // Método: Ciudades que alcanzan más de 30°C en todas las estaciones
        info += "\n--- Ciudades que alcanzan más de 30°C en todas las estaciones ---\n";
        for (int i = 0; i < CIUDADES; i++) { // Recorrer todas las ciudades
            int contador = 0; // Inicializar el contador
            for (int j = 0; j < ESTACIONES; j++) { // Recorrer todas las estaciones
                if (temperaturas[i][j] >= 30) { // Verificar si la temperatura supera los 30°C
                    contador++; // Incrementar el contador
                }
            }
            if (contador == ESTACIONES) { // Verificar si la ciudad supera los 30°C en todas las estaciones
                info += ciudades[i] + "\n"; // Agregar el nombre de la ciudad que cumple la condición
            }
        }
        
        // Método: Estaciones con temperaturas menores a 30°C en todas las ciudades
        info += "\n--- Estaciones con temperaturas menores a 30°C en todas las ciudades ---\n";
        int[] menor = new int[ESTACIONES]; // Crear un array para contar las ciudades que tienen menos de 30°C en cada estación
        for (int j = 0; j < ESTACIONES; j++) { // Recorrer todas las estaciones
            int contador = 0; // Inicializar el contador
            for (int i = 0; i < CIUDADES; i++) { // Recorrer todas las ciudades
                if (temperaturas[i][j] < 30) { // Verificar si la temperatura es menor a 30°C
                    contador++; // Incrementar el contador
                }
            }
            menor[j] = contador; // Guardar el contador en el array
        }
        for (int j = 0; j < ESTACIONES; j++) { // Recorrer todas las estaciones
            info += "Estación: " + estaciones[j] + " -> " + menor[j] + " ciudades con menos de 30 grados siempre.\n"; // Agregar el resultado para cada estación
        }
        
        // Método: Temperatura promedio anual por ciudad
        info += "\n--- Temperatura promedio anual por ciudad ---\n";
        for (int i = 0; i < CIUDADES; i++) { // Recorrer todas las ciudades
            double suma = 0; // Inicializar la suma de las temperaturas
            for (int j = 0; j < ESTACIONES; j++) { // Recorrer todas las estaciones
                suma += temperaturas[i][j]; // Sumar las temperaturas de todas las estaciones
            }
            double promedio = suma / ESTACIONES; // Calcular el promedio anual
            info += "Ciudad: " + ciudades[i] + " -> Promedio anual: " + promedio + "\n"; // Agregar el resultado
        }
        
        // Método: Ciudad con menor variación de temperatura anual
        info += "\n--- Ciudad con menor variación de temperatura anual ---\n";
        double menorVariacion = Double.MAX_VALUE; // Inicializar menorVariación
        String ciudadMenorVariacion = ""; // Inicializar el nombre de la ciudad con la menor variación
        for (int i = 0; i < CIUDADES; i++) { // Recorrer todas las ciudades
            double maxTemp = Double.MIN_VALUE; // Inicializar la temperatura máxima
            double minTemp = Double.MAX_VALUE; // Inicializar la temperatura mínima
            for (int j = 0; j < ESTACIONES; j++) { // Recorrer todas las estaciones
                if (temperaturas[i][j] > maxTemp) { // Verificar si la temperatura es mayor que la máxima registrada
                    maxTemp = temperaturas[i][j]; // Actualizar la temperatura máxima
                }
                if (temperaturas[i][j] < minTemp) { // Verificar si la temperatura es menor que la mínima registrada
                    minTemp = temperaturas[i][j]; // Actualizar la temperatura mínima
                }
            }
            double variacion = maxTemp - minTemp; // Calcular la variación de temperatura
            if (variacion < menorVariacion) { // Verificar si la variación es menor que la mínima registrada
                menorVariacion = variacion; // Actualizar la menor variación
                ciudadMenorVariacion = ciudades[i]; // Actualizar el nombre de la ciudad con la menor variación
            }
        }
        info += "Ciudad: " + ciudadMenorVariacion + " -> Variación: " + menorVariacion + "\n"; // Agregar el resultado
        
        return info; // Devolver el resultado final
    }
    
    
    // Método para obtener las temperaturas (getter)
    public double[][] getTemperaturas() {
        return temperaturas;
    }

    // Método para obtener los nombres de las ciudades (getter)
    public String[] getCiudades() {
        return ciudades;
    }

    // Método para obtener los nombres de las estaciones (getter)
    public String[] getEstaciones() {
        return estaciones;
    }
}
