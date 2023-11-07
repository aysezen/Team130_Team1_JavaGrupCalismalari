import java.util.Scanner;

public class Q1_IfStatement_DogumGunuKiyaslama {

    /*
    Kullanicidan iki farkli dogum gunu tarihini alip,
    kimin once dogdugunu consolda yazdiran bir program yaziniz.
     */

    public static void main(String[] args) {

        Scanner elma = new Scanner(System.in); // Scanner objesine biz hangi ismi verirsek o isim uzerinden Scanner methodlarina ulasabiliriz.

        System.out.println("Lutfen karsilastirmak istediginiz dogum gunlerinden ilkini YYYY/AA/GG formatinda giriniz : ");

        String ilkDogumTarihi = elma.nextLine();

        System.out.println("Lutfen karsilastirmak istediginiz dogum gunlerinden ikincisi YYYY/AA/GG formatinda giriniz : ");

        String ikinciDogumTarihi = elma.nextLine();

        int ilkDogumYili = Integer.parseInt(ilkDogumTarihi.trim().substring(0,4));   // YYYY

        int ikinciDogumYili = Integer.parseInt(ikinciDogumTarihi.trim().substring(0,4));  //YYYY

        if (ilkDogumYili<ikinciDogumYili) System.out.println("Ilk girilen dogum tarihinin sahibi daha buyuktur! ");
        else if (ilkDogumYili>ikinciDogumYili)System.out.println("Ikinci girilen dogum tarihinin sahibi daha buyuktur! ");
        else {                                   // bu satirda dogum yillari esit demek oluyor!!!

                int ilkDogumAyi = Integer.parseInt(ilkDogumTarihi.trim().substring(5,7));
                int ikinciDogumAyi = Integer.parseInt(ikinciDogumTarihi.trim().substring(5,7));

                if (ilkDogumAyi<ikinciDogumAyi) System.out.println("Ilk girilen dogum tarihinin sahibi daha buyuktur! ");
                else if (ilkDogumAyi>ikinciDogumAyi)System.out.println("Ikinci girilen dogum tarihinin sahibi daha buyuktur! ");
                else {                                   // bu satirda dogum aylar esit demek oluyor!!!

                    int ilkDogumGunu = Integer.parseInt(ilkDogumTarihi.trim().substring(8));
                    int ikinciDogumGunu = Integer.parseInt(ikinciDogumTarihi.trim().substring(8));

                    if (ilkDogumGunu<ikinciDogumGunu) System.out.println("Ilk girilen dogum tarihinin sahibi daha buyuktur! ");
                    else if (ilkDogumGunu>ikinciDogumGunu)System.out.println("Ikinci girilen dogum tarihinin sahibi daha buyuktur! ");
                    else {                                   // bu satirda dogum gun esit demek oluyor!!!
                        System.out.println("Ikisi de ayni gun dogmustur!");
                    }
                }
             }

    }


}
