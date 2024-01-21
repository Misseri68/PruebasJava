import java.util.HashMap;

public class Anagramas {
    //Comprobar si dos cadenas son anagramas entre sí. Puede haber espacios dentro de las cadenas a comprobar.
    public static void main(String[] args) {
        System.out.println(sonAnagramasConMetodoExterno("aabc", " b aac "));
    }
   /* public static boolean sonAnagramas(String palabraA, String palabraB){
        if(palabraA == null || palabraA.isEmpty() || palabraB == null || palabraB.isEmpty()){
            return false;
        }

        HashMap<Character, Integer> mapaA = new HashMap<>();
        HashMap<Character, Integer> mapaB = new HashMap<>();


        char[] arrayA = palabraA.toLowerCase().toCharArray();
        char[] arrayB = palabraB.toLowerCase().toCharArray();

        //Pasamos a un Map el arrayA
        for (int i = 0; i < arrayA.length; i++) {
            char letraActual = arrayA[i];
            if(letraActual != ' '){
                if(mapaA.containsKey(letraActual)){
                    mapaA.put(letraActual, (mapaA.get(letraActual)+1));
                }
                else{
                    mapaA.put(letraActual, 1);
                }
            }
        }

        for (int i = 0; i < arrayB.length; i++) {
            char letraActual = arrayB[i];
            if(letraActual != ' '){
                if(mapaB.containsKey(letraActual)){
                    mapaB.put(letraActual, (mapaB.get(letraActual)+1));
                }
                else{
                    mapaB.put(letraActual, 1);
                }
            }
        }
        if(mapaA.size() == mapaB.size()){
            return mapaA.equals(mapaB);
        }
        return false;
    }
*/
    public static boolean sonAnagramasConMetodoExterno(String palabraA, String palabraB){
        if(palabraA == null || palabraA.isEmpty() || palabraB == null || palabraB.isEmpty()) return false;
        HashMap<Character, Integer> mapaA = llenarMapa(palabraA);
        HashMap<Character, Integer> mapaB = llenarMapa(palabraB);
        return mapaA.equals(mapaB);
    }
    public static HashMap<Character, Integer> llenarMapa(String cadena){
        HashMap<Character, Integer> mapa = new HashMap<>();
        char[] array = cadena.toLowerCase().toCharArray();
        for (int i = 0; i < array.length; i++) {
            char letraActual = array[i];
            if(letraActual != ' '){
                if(mapa.containsKey(letraActual)){
                    mapa.put(letraActual, (mapa.get(letraActual)+1));
                }
                else{
                    mapa.put(letraActual, 1);
                }
            }
        }
        return mapa;
    }
}
