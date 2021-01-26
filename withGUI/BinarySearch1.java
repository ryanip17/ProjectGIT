
/**
 *
 * @author Ryan
 */
// Nama file : BinarySearch.java
// Mencari nilai elemen dengan metoda binary search
 
// Mengimpor kelas
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.util.Arrays;
 
// Deklarasi kelas
public class BinarySearch1 {
 
   // Metoda main
   public static void main(String[] args) {
 
      String tampilan;
      JTextArea areaTampilan;
      int nilai;
      int indek;
 
      // Mendeklarasikan, membuat, menginisialisasi
      // dan menampilkan elemen larik
      int[] nilaiInt = {4, 10, 8, 6, 7, 1, 5, 3, 9, 2};
      tampilan = "Menampilkan nilai elemen larik sesuai urutan aslinya :\n";
      for (int x = 0; x < nilaiInt.length; x++)
         tampilan += nilaiInt[x] + "   ";
  
      // Menampilkan larik setelah diurutkan
      Arrays.sort(nilaiInt);
      tampilan += "\nMenampilkan nilai elemen larik setelah diurut :\n";
      for (int x = 0; x < nilaiInt.length; x++)
         tampilan += nilaiInt[x] + "   ";
 
      // Nilai elemen dicari dan pemanggilan metoda
      nilai = 5;
      indek = mencariDenganBS(nilaiInt, nilai);
 
      // Menampilkan hasil
      tampilan += "\nNilai elemen yang dicari : " + nilai;
      tampilan += "\nNilai ditemukan pada indek : " + indek;
      areaTampilan = new JTextArea();
      areaTampilan.setText(tampilan);
      JOptionPane.showMessageDialog(null, areaTampilan, "Binary Search",
            JOptionPane.INFORMATION_MESSAGE);
 
      // Mengakhiri aplikasi
      System.exit(0);
   
   } // Akhir blok metoda main
 
   // Metode dengan pendekatan binary search
   public static int mencariDenganBS(int[] larikC, int nilaiDicari) {
       
      int bawah = 0;
      int atas =larikC.length - 1;
 
      while (atas >= bawah) {
         int tengah = (bawah + atas) / 2;
         if (nilaiDicari < larikC[tengah])
            atas = tengah - 1;
         else if (nilaiDicari == larikC[tengah])
            return tengah;
         else
            bawah = tengah + 1;
      }
       
      return -1;
 
   } // Akhir blok metoda mencariDenganBS
}
