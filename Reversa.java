public class Reversa {

    public static String alReves(String texto) {
        if (texto.length() == 0) {
            return "";
        } else {
            return alReves(texto.substring(1)) + texto.charAt(0);
        }
    }

    public static void main(String[] args) {
        String palabra = "invencible";
        String resultado = alReves(palabra);
        System.out.println("Texto al revés: " + resultado);
    }
}
