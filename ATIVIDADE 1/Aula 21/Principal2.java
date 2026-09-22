public class Principal2 {
    public static void main(String[] args) {
        int[] numeros = {45, 12, 89, 3, 27, 8};

        try {

            if (numeros == null || numeros.length == 0) {
                throw new IllegalArgumentException("O array nao pode estar vazio ou ser nulo!");
            }


            int menor = numeros[0];


            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] < menor) {
                    menor = numeros[i];
                }
            }

            System.out.println("O menor elemento do array e: " + menor);

        } catch (IllegalArgumentException e) {
            System.out.println("[ERRO]: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[ERRO INESPERADO]: " + e.getMessage());
        }
    }
}