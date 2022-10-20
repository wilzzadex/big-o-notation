import java.util.ArrayList;

public class LinearTime {
    public static void main(String args[]){
        // Inisialisasi Array
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(8);
        arr.add(32);
        arr.add(90);
        arr.add(45);

        int min = arr.get(0);
        int max = arr.get(0);

        // Simpan panjang array ke variabel n
        int n = arr.size();

        // mencari angka minimum dari ArrayList  dan di simpan ke variabel min
        for (int i = 1; i < n; i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }
        //menjadi angka masimum dari ArrayList dan di simpan ke variabel max
        for (int i = 1; i < n; i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }

        // Menampilkan hasilnya
        System.out.println("Angka Maksimum : " + max);
        System.out.println("Angka Minimum : " + min);
    }
}
