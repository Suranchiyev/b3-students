public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        for(int i = 0;  i < 10; i++){
            System.out.println("Java and Git are great");
        }
    }

       public static String reverse(String str) {
        String empty = "";
        for (int i = str.length()-1; i >=0; i--) {
            empty+=str.charAt(i);
        }
        return empty;
    }

}
