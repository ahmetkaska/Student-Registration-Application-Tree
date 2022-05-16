
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ahmetkaska
 */
public class uygulama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int no, not;
        String ad;
        Tree ogr = new Tree();

        int secim = menu();
        while (secim != 0) {
            System.out.println("****************************");
            switch (secim) {
                case 1:
                    System.out.println("Eklenecek ogrenci bilgilerini giriniz");
                    System.out.println("Numara : ");
                    no = input.nextInt();
                    System.out.println("Ad : ");
                    ad = input.next();
                    System.out.println("Not : ");
                    not = input.nextInt();
                    ogr.root = ogr.insert(ogr.root, no, ad, not);
                    System.out.println(no + " Numarali ogrenci eklendi.");
                    break;
                case 2:
                    System.out.println("Silinecek ogrenci bilgilerini giriniz");
                    System.out.println("Numara : ");
                    no = input.nextInt();
                    ogr.root = ogr.delete(ogr.root, no);
                    System.out.println(no + " Numarali ogrenci silindi.");
                    break;
                case 3:
                    System.out.println("No\t" + "Ad\t" + "Not");
                    ogr.inOrder(ogr.root);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hatali secim yaptiniz!");

            }
            System.out.println("****************************");
            secim = menu();
        }

    }

    private static int menu() {
        int secim;
        Scanner input = new Scanner(System.in);
        System.out.println("1. Ekle");
        System.out.println("2. Sil");
        System.out.println("3. Yazdir");
        System.out.println("0. Cikis");
        System.out.println("Seciminiz : ");
        secim = input.nextInt();
        return secim;

    }
}
