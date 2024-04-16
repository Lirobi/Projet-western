package western2;

import java.security.InvalidParameterException;
import java.util.ArrayList;

public class Narrateur extends Personnage {

    private ArrayList<String> m_histoire;
    public Narrateur() {
        super("Le narrateur");
    }
    public Narrateur(String nom) {
        super(nom + ", le narrateur");
    }
    public Narrateur(String nom, western1.Boisson boisson_preferee) throws InvalidParameterException{

        super(nom + ", le narrateur", boisson_preferee);
        if(!boisson_preferee.getNom().equalsIgnoreCase("eau")) {
            throw new InvalidParameterException("Le narrateur ne doit pas boire autre chose que de l'eau !");
        }

    }
    public void ajouterLignes(String str) {
        m_histoire.add(str);
    }

    public void raconterHistoire() {
        for(String str : m_histoire) {
            System.out.println(str);
        }
    }
    @Override
    public String dire(String texte) {
        return texte;

    }
}
