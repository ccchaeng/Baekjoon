import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String str = new String();
        int r;

        for(int i = 0; i < t; i++){
            r = sc.nextInt();
            str = sc.next();
            for(int j = 0; j < str.length(); j++){
                for(int k = 0; k < r; k++){
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}