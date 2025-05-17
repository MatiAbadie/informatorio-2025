package imperativa;

public class puntosPorCadaMision{
    public static void main(String[] args) {
        int[] puntosPorMision = new int[5];
        int total = 0;
        int mayorPuntaje = 0;
        int indice = 0;
        puntosPorMision[0] = 50;
        puntosPorMision[1] = 80;
        puntosPorMision[2] = 60;
        puntosPorMision[3] = 100;
        puntosPorMision[4] = 60;
        for (int i = 0; i < puntosPorMision.length; i++) {
            total += puntosPorMision[i];

            if (mayorPuntaje < puntosPorMision[i]){
                mayorPuntaje = puntosPorMision[i];
                indice = i;
            }
        }

        System.out.println("Puntos acumulados hasta ahora: " + total);

        if (total >= 300){
            System.out.println("¡Felicidades! Sos un verdadero Chad del RPG 🎯");
        }else {
            System.out.println("Te falta entrenamiento, joven aprendiz...");
        }

        System.out.println("Tu mejor desempeño fue en la misión "+ indice+ " con "+ mayorPuntaje+ " puntos.");

    }
}




