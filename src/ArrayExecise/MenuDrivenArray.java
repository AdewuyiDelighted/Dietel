package ArrayExecise;

import java.util.Scanner;

public class MenuDrivenArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("""
                    Enter a number in this options
                    1.To input elements into matrix of size m and n
                    2.To display elements of matrix of size m and n
                    3.Sum of all elements of matrix of size m and n
                    4.To display row_wise sum of matrix of size m and n
                    5.To display column_wise sum of matrix of size m and n
                    6.""");
            int menu = scanner.nextInt();
            switch (menu){
                case 1:
                    inputElements();
            }
        }
        while ( ) {

        }
    public static void inputElements(int size){

        }

    }
}
