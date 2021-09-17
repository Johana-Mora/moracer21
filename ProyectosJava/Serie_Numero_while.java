public class SerieNumeros {
    public static void main(String[] args) {
        int Valor1 = 0;
        int Valor2 = 1;
        int aux;

        System.out.println(Valor1);
        System.out.println(Valor2);
        System.out.println(Iteracion);

        while (Valor1 + Valor2 <= Iteracion) {
            aux = Valor1;
            Valor1 = Valor2;
            Valor2 = aux + Valor1;

            System.out.println(Valor2);
        }
    }
}