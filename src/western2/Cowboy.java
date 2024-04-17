package western2;

import java.util.ArrayList;
import java.util.List;

public class Cowboy extends Personnage {

    protected int m_porte_monnaie = 0;

    protected List<Brigand> brigands_captures = new ArrayList<Brigand>();
    public Cowboy(String nom) {
        super(nom);
    }
    public Cowboy(String nom, western1.Boisson boisson_preferee) {
        super(nom, boisson_preferee);
    }


    public String tirerSur(Brigand brigand) {


        return this.dire("PAN ! PAN ! Prends ça, chacal de " + brigand.getNom() + "!") + brigand.dire("Tu n’es qu’un coyote, " + this.getNom() + " !");

    }

    @Override
    public String sePresenter() {
        String str = "Bonjour, je suis " + this.getNom() + " et j'aime boire " + this.boisson_preferee.getGenre().getNomAvecArticlePartitif();
        if(!this.brigands_captures.isEmpty()) {
            str +=". J'ai empoché " + this.m_porte_monnaie + "$ en capturant ";
            for(Brigand brd : this.brigands_captures) {
                str += brd.getPseudo();
            }
        }

        return this.dire(str);
    }
    public String capturer(Brigand brigand) {
        return brigand.capturer(this);
    }

}
