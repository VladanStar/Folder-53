package radionicap1;

import java.util.Arrays;
import java.util.Scanner;

public class RadionicaP1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesie vase ime: ");
        String ime = input.nextLine();
        System.out.println("Unesite vase prezime: ");
        String prezime = input.nextLine();
        System.out.println("Dobro dosli " + ime + " " + prezime + " proverite vase znanje iz\n"
                + "iz Osnova Java programiranja. ");
        System.out.println("Unesite podatke za niz imena sa kojima cete raditei");
        System.out.println("Unesite broj clanova niza(n):  ");

        int n = input.nextInt();

        String[] imena = new String[n];
        ucitajNiz(imena, n);
        while (true) {

            System.out.println("Izaberite jednu od opcija:\n"
                    + "1. sortiranje niza i stampanje tako sortiranog niza\n"
                    + "2. provera da li se uneto ime nalazi u nizu\n"
                    + "3. racinjanje zbira kvadtarata dva uneta broja\n"
                    + "4. true ili false za unos (a i b) i c\n"
                    + "\n");
            int izbor = input.nextInt();
            switch (izbor) {
                case 1:
                    sortiranjeNiza(imena, n);
                    stampanjeNiza(imena, n);
                    break;
                case 2:
                    System.out.println(imeUNizu(imena, n));
                    break;
                case 3:
                    zbirKvadrata();
                    break;
                case 4:
                    System.out.println(logickiIzraz());
                    break;
                // logickiIzraz();
                default:
                    System.out.println("Opcija nije podrzana.");
                    break;

            }
            System.out.println("Da li zelite da nastavite? (da ili ne)");
            String opcija = input.next();
            if (opcija.equalsIgnoreCase("da")) {
                continue;
            } else {
                
                break;
                
            }
            

        }
         System.out.println("Hvala " + ime + " " + prezime + "sto ste koristili nas program");
       

    }

    private static void ucitajNiz(String[] imena, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < imena.length; i++) {
            System.out.print("Unesite clan niza a[" + i + "] = ");
            imena[i] = sc.nextLine();
        }
    }

    private static void sortiranjeNiza(String[] imena, int n) {
        for (int i = 0; i < imena.length; i++) {
            Arrays.sort(imena);
        }
    }

    private static void stampanjeNiza(String[] imena, int n) {
        for (int i = 0; i < imena.length; i++) {
            System.out.println(imena[i]);
        }
    }

    public static String imeUNizu(String a[], int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ime za proveru: ");
        String naziv = sc.nextLine();
        for (int i = 0; i < n; i++) {
            if (a[i].contains(naziv)) {
                return "da";
            }
        }

        return "ne";

    }

    private static void zbirKvadrata() {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Unesite broj a = ");
        int a = in.nextInt();
        System.out.println("Unesite broj b= ");
        int b = in.nextInt();
        int zbirK = (int) (Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Zbir kvadrata je: " + zbirK);
    }

    private static String logickiIzraz() {
        Scanner bs = new Scanner(System.in);

        String s;
        System.out.println("unesite true ili false");
        boolean a, b, c;
        System.out.print("a= ");
        a = bs.nextBoolean();

        System.out.print("b = ");
        b = bs.nextBoolean();
        System.out.print("c = ");
        c = bs.nextBoolean();

        if ((a || b) && c) {
            s = "TAČNO";
        } else {
            s = "NETAČNO";
        }
        return s;
    }
}
