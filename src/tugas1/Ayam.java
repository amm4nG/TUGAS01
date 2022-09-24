package tugas1;
public class Ayam {

    //state atau fieldnya
    String jenis, warna;

    //behavior atau method-2 nya
    void makan(String jenis, String warna) { //variable dalam kurung adalah parameter
        
        this.jenis = jenis; 
        this.warna = warna; 
        
        //cetak apa yang mau di cetak
        System.out.println("Ayam Jenis " + this.jenis + ", Warna " + this.warna + " Sedang Makan");
    }
}
