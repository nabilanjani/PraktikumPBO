import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args){
        //inisialisasi ArrayList yang hanya dapat berisi string
        ArrayList<String> strings = new ArrayList<String>();
        //menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        //menghapus elemen
        strings.remove("praktikum");
        //iterasi pd keseluruhan ArrayList
        for(String s : strings){
            System.out.print(s + " ");
        }
    }
}
