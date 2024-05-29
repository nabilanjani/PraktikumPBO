import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("40169", "Adi");
        mahasiswaMap.put("30085", "Bambang");
        mahasiswaMap.put("40121", "Cici");
        mahasiswaMap.put("40137", "Didi");

        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + ", Nama: " + nama);
        });
    }
}