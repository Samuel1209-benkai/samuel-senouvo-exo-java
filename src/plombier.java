public class plombier extends ouvrier {
    
    public plombier() {

        super(nom, prenom, age);
       
    }

    @Override
    public void outildetaf(String outil) {

        System.out.println("Votre outil de travail est " + outil);
    }

    @Override
    public void entrepreneur(boolean torf) {

        if (torf == true) {

            System.out.println("Vous etes un entrepreneur");
        } else {

            System.out.println("Vous n'etes pas un entrepreneur");

        }

    }

    @Override
    public void gainmensuelle(int gain) {

        System.out.println("Votre gain mensuel est de " + gain);

    }

    @Override
    public void isgraduate(boolean graduate) {

        if (graduate == true) {
            System.out.println("Vous etes diplome");
        } else {
            System.out.println("Vous n'etes pas diplome");
        }
    }

}
