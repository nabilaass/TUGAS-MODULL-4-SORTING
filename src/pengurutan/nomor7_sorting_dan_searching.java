//NABILA ASSHAFA PUTRI
//BILANGAN 25 , 7 , 9 , 13 , 3
package pengurutan;

public class nomor7_sorting_dan_searching {
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
        nomor7_sorting_dan_searching.tampil(A);   //cara menamainya yaitu name class_name public static
        System.out.println("Sesudah dilakukan Sorting :");
        nomor7_sorting_dan_searching.insertionSort(A);
        nomor7_sorting_dan_searching.tampil(A);
        sequen(A);
    }
    public static void sequen(int[] A) {
        int cari=  13;
        int ketemu=0;
        System.out.println("Data yang sedang dicari ialah : 13 "); //mencari data 13
        System.out.println(" ");
        for (int i = 0; i < A.length; i++){
            if (A[i] == cari){
                ketemu=1;
                System.out.print("Data " + cari+ " berada pada indeks ke-" +i);
                break; //stop perulangan
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        
        if (ketemu==1)
            System.out.println("Kesimpulan : Data dapat ditemukan oleh sistem ");
        else 
            System.out.println("Kesimpulan : Data tidak dapat ditemukan oleh sistem  ");
        }}
