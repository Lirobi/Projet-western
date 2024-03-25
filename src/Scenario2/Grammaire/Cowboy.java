package Scenario2.Grammaire;

import java.util.ArrayList;
import java.util.List;

public class Cowboy extends Personnage{

    protected int porte_monnaie = 0;

    protected List<Brigand> brigands_captures = new ArrayList<Brigand>();
    public Cowboy(String nom) {
        super(nom);
    }
    public Cowboy(String nom, Boisson boisson_preferee) {
        super(nom, boisson_preferee);
    }


    public void tirerSur(Brigand brigand) {
        this.dire("PAN ! PAN ! Prends ça, chacal de " + brigand.getNom() + "!");
        brigand.dire("Tu n’es qu’un coyote, " + this.getNom() + " !");
    }

    public void capturer(Brigand brigand) {
        brigand.capturer(this);
    }

}
