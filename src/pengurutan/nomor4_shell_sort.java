//nabila asshafa putri 20090105
//MENGURUTKAN BILANGAN 25 , 7 , 9 , 13 , 3
package pengurutan;

public class nomor4_shell_sort {
    public static void shellsort(int[] arr) {
            int n = arr.length;
            int C,M;
            int jarak, i, j, kondisi;
            boolean Sudah = true;
            int temp;
            C = 0;
            M = 0;
            jarak = n;//array length

            while (jarak >= 1) {//jika jarak tidak memenuhi syarat maka akan dilanjut
                jarak = jarak/2;
                Sudah = true; //sudah apabila ditemukan jarak
                while (Sudah) {
                    Sudah = false;
                    for (j = 0; j < n - jarak; j++) {
                        i = j + jarak;
                        C++;
                        if (arr[j]> arr[i]) {
                            temp = arr[j];
                            arr[j] = arr[i];
                            arr[i] = temp;
                            Sudah = true;
                        }
                    }
                }
            }
    }
        public static void tampil(int data[]) {
            for(int i = 0; i<data.length; i++)
                System.out.print(data[i] + " ");
            System.out.println();}

        public static void main(String[] args) {
            int A[]= { 25 , 7 , 9 , 13 , 3 };
            System.out.println("Sebelum dilakukan Sorting :");
            nomor4_shell_sort.tampil(A);
            System.out.println("Sesudah dilakukan Sorting :");
            nomor4_shell_sort.shellsort(A);
            nomor4_shell_sort.tampil(A);
        }
}
