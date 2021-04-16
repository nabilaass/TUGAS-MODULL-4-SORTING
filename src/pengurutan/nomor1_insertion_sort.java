//NABILA ASSHAFA PUTRI
//BILANGAN 25 , 7 , 9 , 13 , 3
package pengurutan;

public class nomor1_insertion_sort {
    
    public static void insertionSort(int[] A) {
    for (int i = 1; i < A.length; i++) {
    int key = A[i]; 
    int j = i - 1;
    while (( j >= 0) && (A[j] > key)) {
        A[j + 1 ]=A[j];
        j--;}
    A[j + 1] = key;
}
}
public static void tampil(int data[]) {
    for (int i=0; i < data.length;i++) {
        System.out.print(data[i] + " ");
    }
    System.out.println();
}
public static void main(String args[]){
    int A[]= { 25 , 7 , 9 , 13 , 3 };
    System.out.println("Sebelum dilakukan Sorting :");
    //cara menamainya yaitu name class_name public static
    nomor1_insertion_sort.tampil(A);
    System.out.println("Sesudah dilakukan Sorting :");
    nomor1_insertion_sort.insertionSort(A);
    nomor1_insertion_sort.tampil(A);
}
}
