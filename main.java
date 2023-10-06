package busquedayordenamiento;

public class main {
    public static void main(String []args) {
    //1. Busqueda Lineal
    Integer[] numeros={2,5,8,6,4,3,0,9};
    SortingAndSearch<Integer> s=new SortingAndSearch<>();

    System.out.println(s.linealSearch (numeros, min:0 , max:7 , target:5));

    Integer[] numeros={ "Hugo","Paco", "Leo", "Luis", "Maria";
    SortingAndSearch<String> sn=new SortingAndSearch<>();

    System.out.println(sn.linealSearch (numeros, min:0 , max:7 , target:"Leo"));
    
    Integer[] numeros2={2,3,8,16,24,31,40,49,65,78,122};
    SortingAndSearch<Integer> s2 = new SortingAndSearch<>();
    System.out.println("Busqueda binaria");
    System.out.println(s2.binarySearch(numeros2, min:0, numeros2.length-1, target:50));

    //ordenacion por seleccion
    System.out.println("Ordenacion por seleccion")
    s.selectionSort(numeros);
    for (int i=0; i < numeros.length; i++){
        System.out.println(numeros[i]);
    }
        //ordenacion por insercion
        System.out.println("Ordenacion por insercion")
        s.selectionSort(numeros);
        for (int i=0; i < numeros.length; i++){
            System.out.println(numeros[i]);

        }
        //ordenacion por metodo burbuja
        System.out.println("Ordenacion por metodo burbuja")
        s.bubleSort(numeros);
        for (int i=0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
 