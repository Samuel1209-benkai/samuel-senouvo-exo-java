import java.util.Scanner;

/*

un ouvrier est caracterisé par un nom, un prénom et son age. Il est 

l'ouvrier herite du travailleur et possede l'interface diplomeouvrier qui permet de savoir si celui-ci est diplome ou pas

*/
public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String outil;
        int gain;
        int reponse;

        menuisier agbegli = new menuisier();

        agbegli.setNom("kevin");

        System.out.println(agbegli.getNom());

        System.out.println("Quelle votre outil de travail ?");

        outil = sc.nextLine();

        System.out.println("Etes-vous un entrepreneur ? Entre 1 pour oui et 0 pour non");
        reponse = sc.nextInt();

        System.out.println("Etes-vous diplome ? Entre 1 pour oui et 0 pour non");
        reponse = sc.nextInt();

        System.out.println("Quelle est votre gain mensuelle ?");
        gain = sc.nextInt();

        agbegli.outildetaf(outil);

        if (reponse == 1) {

            agbegli.entrepreneur(true);
            agbegli.isgraduate(true);
        } else {

            agbegli.entrepreneur(false);
            agbegli.isgraduate(false);

        }

        agbegli.gainmensuelle(gain);

    }

}
