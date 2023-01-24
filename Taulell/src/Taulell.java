import java.util.Scanner;

public class Taulell {
    public static void main(String[] args) {
        char [][] taulell = new char[10][10];
        char [][] taulell2 = new char[10][10];
        int b1j1=1;
        int b2j1=1;
        int b3j1=1;
        int b4j1=1;
        int b5j1=1;

        int b1j2=1;
        int b2j2=1;
        int b3j2=1;
        int b4j2=1;
        int b5j2=1;


        for (int i=0; i< taulell.length; i++){
            for (int j=0;j<taulell[i].length; j++){
                taulell[i][j]= '~';
                taulell2[i][j]= '~';
            }
        }
        System.out.println("\t\t\t\t\t\t\t\t\t\t   ―――――――");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  | BATTLESHIP |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t   ―――――――\n");
        System.out.println("Jugador 1 \t\t\t\t\t\t\t\t\t\t\t\tJugador 2");
        System.out.println("\n\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t\t\t\t\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10");
        mostrarTaulell(taulell, taulell2);
        preguntes();
    }

    public static void mostrarTaulell(char [][]taulell, char [][]taulell2){
        for (int i=0; i< taulell.length; i++){
            System.out.print(i+1);
            for (int j=0;j<taulell[i].length; j++){
                System.out.print("\t"+taulell[i][j]);
            }
            System.out.print("\t\t\t\t"+(i+1));
            for (int j=0;j<taulell2[i].length; j++){
                System.out.print("\t"+taulell2[i][j]);
            }
            System.out.println("");
        }
    }

    public static void preguntes(){
        Scanner num = new Scanner(System.in);

        System.out.println("\nBaixells disponibles: ");
        System.out.println("―――――――――――――――");
        System.out.println("| X \t\t PT Boat    |");
        System.out.println("| X X \t\t Destroyer  |");
        System.out.println("| X X X \t Submarine  |");
        System.out.println("| X X X X \t Battleship |");
        System.out.println("| X X X X X\t Aircraft   |");
        System.out.println("―――――――――――――――");
        System.out.print("\nQuin baixell vols col·locar (1, 2, 3, 4, 5)? ");
        int baixell = num.nextInt();
        System.out.print("\nCom el vols col·locar, horitzontal o vertical ( h / v )?");
        String posicio = num.next();
        System.out.print("\nEn quina columna el vols col·locar? ");
        int columna = num.nextInt();
        System.out.print("\nEn quina fila el vols col·locar? ");
        int fila = num.nextInt();

    }




}
