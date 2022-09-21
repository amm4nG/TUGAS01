package tugas1;
public class Tugas1 {
    public static void main(String[] args) {
        //membuat object dari class yang sudah ada
        Ayam ayam1 = new Ayam(); //kata ayam1 adalah objectnya
        Ayam ayam2 = new Ayam(); //kata ayam2 juga adalah object
        //pemanggilan object
        ayam1.makan("Betina", "Hitam"); //"Betina, Hitam" itu adalah nilai dari parameter yg ada pada void makan()
        ayam2.makan("Jantan", "Merah"); //"Jantan, Merah" itu adalah nilai dari parameter yg ada pada void makan()
    }
}
