public class ExceptionOnArray {
    public static void main(String[] args){
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10; //dicoba, krn error jadi masuk ke catch
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace(); //mengeluarkan error 'index 4 out of bounds for length 4
        }finally {
            System.out.println("clean up code...");
        }
    }
}
