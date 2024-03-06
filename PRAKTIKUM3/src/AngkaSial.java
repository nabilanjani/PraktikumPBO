public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial  as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati hati memasukkan angka!");
        }
    }
}

//Jawaban Pertanyaan
//1. Dieksekusi karena, nilai angka yang dimasukkan tidak termasuk ke dalam nilai exception angka sial yaitu 13
//sehingga dapat mencetak angka tersebut dan string "bukan angka sial"
//2. Dieksekusi untuk mengeluarkan pesan "hati-hati memasukkan angka" karena setelah angka 13 dieksepsi, angka 12
//tidak akan dieksekusi sehingga hanya memunculkan pesan tersebut