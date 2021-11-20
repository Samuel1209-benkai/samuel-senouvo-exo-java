
public abstract class ouvrier implements diplomeouvrier 
{

    public static String nom;
    public static String prenom;
    public static int age;

    public abstract void outildetaf(String outil);

    public abstract void entrepreneur(boolean torf);

    public abstract void  gainmensuelle(int gain);

    public ouvrier(String nom, String prenom,int age) {
        
     
        ouvrier.nom = nom;
        ouvrier.prenom = prenom;
        ouvrier.age = age;

    }
  
   

    public String getNom() {
        return ouvrier.nom;
    }

    public void setNom(String nom) {
        ouvrier.nom = nom;
    }

    public String getPrenom() {
        return ouvrier.prenom;
    }

    public void setPrenom(String prenom) {
        ouvrier.prenom = prenom;
    }

    public int getAge() {
        return ouvrier.age;
    }

    public void setAge(int age) {
        ouvrier.age = age;
    }
    
}
