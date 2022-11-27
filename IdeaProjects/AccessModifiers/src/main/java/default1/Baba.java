package default1;

public class Baba {
    // Bu özellikleri default olarak güncelledik
    // Ayrıca sacRengine static nitelemesi verdik
    // static nitelemsini mainden erişildiğini göstermek için verdim
    int boy;
    static String sacRengi;


    void dil(){

        System.out.println("Türkçe");

        // Boy'a buradan erişebiliriz
        boy = 190;

        // sacRengi'ne buradan erişebiliriz
        sacRengi = "Kahverengi";

        // Sınıf içerisinden erişebildik

    }


}
