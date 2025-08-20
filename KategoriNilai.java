import java.util.Scanner;

public class KategoriNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai Anda: ");
        int nilai = input.nextInt();
        String predikat;

    if (nilai >= 96 && nilai <= 100) {
            predikat = "A";
        } else if (nilai >= 91 && nilai <= 95) {
            predikat = "A-";
        } else if (nilai >= 86 && nilai <= 90) {
            predikat = "B+";
        } else if (nilai >= 81 && nilai <= 85) {
            predikat = "B";
        } else if (nilai >= 75 && nilai <= 80) {
            predikat = "B-";
        } else if (nilai >= 70 && nilai <= 74) {
            predikat = "C+";
        } else if (nilai >= 65 && nilai <= 69) {
            predikat = "C";
        } else if (nilai >= 60 && nilai <= 64) {
            predikat = "C-";
        } else if (nilai >= 55 && nilai <= 59) {
            predikat = "D+";
        } else if (nilai >= 0 && nilai <= 54) {
            predikat = "D";
        } else {
            predikat = "Tidak Valid";
        }

        System.out.println("Predikat nilai Anda: " + predikat);

        switch (predikat) {
            case "A":
                System.out.println("Sangat Baik");
                break;
            case "A-":
            case "B+":
                System.out.println("Baik Sekali");
                break;
            case "B":
            case "B-":
                System.out.println("Baik");
                break;
            case "C+":
            case "C":
            case "C-":
                System.out.println("Cukup");
                break;
            case "D+":
            case "D":
                System.out.println("Kurang");
                break;
            default:
                System.out.println("Nilai tidak valid");
                break;
        
        }
    }
}
