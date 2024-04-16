package western2;

import java.security.InvalidParameterException;

public class Narrateur extends Personnage {
    public Narrateur() {
        super("Le narrateur");
    }
    public Narrateur(String nom) {
        super(nom + ", le narrateur");
    }
    public Narrateur(String nom, Boisson boisson_preferee) throws InvalidParameterException{

        super(nom + ", le narrateur", boisson_preferee);
        if(!boisson_preferee.getNom().equalsIgnoreCase("eau")) {
            throw new InvalidParameterException("Le narrateur ne doit pas boire autre chose que de l'eau !");
        }

    }

    @Override
    public void dire(String texte) {
        System.out.println(texte);

    }
}
