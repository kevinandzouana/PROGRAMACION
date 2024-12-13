
    import java.util.Random;
    public class Ej3 {
        public static int[] generararray(){
            Random rand = new Random();
            int array[]= new int [10];
            for(int i=0;i<array.length;i++){
                array[i]=rand.nextInt(30);
                System.out.print(" "+array[i]);
            }
            System.out.println();
            return array;
        }
        public static void ordenararray(){
            int array []= generararray();
            ordenararray(array);
        }
        public static void ordenararray(int [] array){
            int menor=0;
            int aux=0;
            menor = array[0];
            for (int i = 0; i < array.length; i++) {
                menor =array[i];
                for (int j = i; j < array.length; j++) {
                    if (array[j] < menor) {
                        menor = array[j];
                        aux=array[j];
                        array[j] = array[i];
                        array[i] = aux;

                    }
                }

            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
        public static void mediaarray(){
            int array []= generararray();
            mediaarray(array);
        }

        public static void mediaarray(int [] array){
            System.out.println("-----------------media------------------");
            int suma=0;
            for (int i = 0; i < array.length; i++) {
                suma=suma+array[i];
            }

            System.out.println(suma/array.length);
        }
        public static void reversa(){
            int array[] = generararray();
            reversa(array);
        }
        public static void reversa(int [] array){
            System.out.println("El array alreves");

            for (int j = array.length-1 ;j>=0 ; j--) {
                System.out.print(array[j] + " ");
            }

        }
        public static void main(String[] args) {
            int [] lista = generararray();
            ordenararray(lista);
            mediaarray(lista);
            reversa(lista);
        }
    }

