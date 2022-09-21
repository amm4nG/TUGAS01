package tugas1;
public class Ayam {

    //state atau fieldnya
    String jenis, warna;

    //behavior atau method-2 nya
    void makan(String jenisAyam, String warnaAyam) { //jenisAyam dan warnaAyam itu adalah sebuah parameter
        
        jenis = jenisAyam; //variable jenis kita beri value dari nilai jenisAyam
        warna = warnaAyam; //variable warna kita beri value dari nilai warnaAyam
        
        //cetak apa yang mau di cetak
        System.out.println("Ayam Jenis " + jenis + ", Warna " + warna + " Sedang Makan");
    }
}
