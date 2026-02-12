public class lengthstr {
    public static int length(String str){
        if(str.length() == 0){
            return 0;
        }
        return 1 + length(str.substring(1));
    }
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(length(str));
      }
}
