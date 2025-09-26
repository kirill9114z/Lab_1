public class Main {
    public static void main(String[] args) {
        var str = "AaBbCcDd"; 
        System.out.print("str[::2] - ");
        for (int i = 0; i < str.length(); i += 2){  
            System.out.print(str.charAt(i)); 
        }
        System.out.print("\nstr[1::2] - ");
        for (int i = 1; i < str.length(); i += 2){ 
            System.out.print(str.charAt(i)); 
        }
    }
}
