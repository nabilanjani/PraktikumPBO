package inclusion2;

public class Programmer extends Pegawai{
    private int bonus;
    public Programmer (String nama){
        super(nama);
        this.bonus = 450000;
    }
    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
