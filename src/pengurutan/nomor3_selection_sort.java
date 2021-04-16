//NABILA ASSHAFA PUTRI
//MENGURUTKAN BILANGAN 25 , 7 , 9 , 13 , 3
package pengurutan;

public class nomor3_selection_sort {
    public static void selectionSort(int[] A) {
        int smallindex;
        int pass, j, n = A.length;
        int temp;
        
        //index of smallest element in the sublist
        for (pass = 0; pass < n - 1; pass++) { //pass=0; 0<4-->True
            
            //mencari data yang paling kecil dari data setelah pointer
            smallindex = pass;
            for (j = pass + 1; j < n; j++) {
                if (A[j] < A[smallindex]) {
                    smallindex = j; 
                }
            }
            temp = A[pass];//digunakan untuk solusi pada pertukaran data sementara
            A[pass] = A[smallindex];
            A[smallindex] = temp;
        }
    }
    //Tukar nilai terkecil dengan array[pass]
    public static void tampil(int data[]) { //cara menampilkan data pada array
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        int A[]= {25,7,9,13,3};
        System.out.println("Sebelum dilakukan Sorting :");
        nomor3_selection_sort.tampil (A);
        System.out.println("Sesudah dilakukan Sorting :");
        nomor3_selection_sort.selectionSort (A);
        nomor3_selection_sort.tampil (A);
}}