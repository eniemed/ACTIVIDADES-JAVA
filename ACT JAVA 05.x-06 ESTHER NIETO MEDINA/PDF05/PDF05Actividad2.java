public class PDF05Actividad2 {
    public static void main(String[] args) {
        String[] simbolo = new String[10];

        simbolo[0] = "a";
        simbolo[1] = "x";
        simbolo[4] = "@";
        simbolo[6] = " ";
        simbolo[7] = "+";
        simbolo[8] = "Q";

        for (int i = 0; i <= simbolo.length - 1; i++) { //Los valores no asignados se muestran como valores nulos (null)
            System.out.println(simbolo[i]);
        }
    }
}
