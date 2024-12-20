package western2;

import java.util.ArrayList;
import java.util.List;
import western1.Boisson;


public class Brigand extends Personnage {
    private int recompense = 100;
    private Cowboy estCapture;
    private List<Dame> dames_capturees = new ArrayList<Dame>();
    public Brigand(String nom) {
        super(nom + " le méchant");
        this.pseudo = nom + " le méchant";
    }

    public Brigand(String nom, western1.Boisson boisson_preferee) {
        super(nom + " le méchant", boisson_preferee);
        this.pseudo = nom + " le méchant" ;
    }

    @Override
    public String sePresenter() {
        String str = "Bonjour, je suis " + this.getNom() + " et j'aime " + this.boisson_preferee.getGenre().getNomAvecArticleDefini() + ". Ma tete est mise a prix " + this.recompense + "$ ! ";

        if(this.estCapture == null) {
            str += "Je suis libre ";
            if(!dames_capturees.isEmpty()) {
                str +="et en bonne compagnie avec ";
                for(Dame dame : dames_capturees) {
                    str += dame.getPseudo() + " ";
                }
            }
        }
        else {
            str += "Je suis le prisonnier de " + estCapture.getPseudo();
        }
        return this.dire(str);
    }

    public int getRecompense() {
        return this.recompense;
    }

    public String capturer(Cowboy c) {
        c.m_porte_monnaie += this.getRecompense();
        c.brigands_captures.add(this);
        this.liberer_dames(c);
        estCapture = c;
        return this.dire( "Damned, je suis fait ! Tu m'as eu, " + c.getNom() + " ! Mais tu n'emporteras pas les" +
                " " + this.getRecompense() + " $ au paradis.");
    }

    public String kidnapper(Dame dame) {

        this.recompense += 50;
        dame.capturer(this);
        this.dames_capturees.add(dame);
        return this.dire(" Ah, ah ! " + dame.getNom() + ", tu es mienne désormais !");
    }

    public void liberer_dames(Cowboy c) {
        for(Dame d : this.dames_capturees) {
            c.dire("Voilà " + d.getNom() + ", tu es libre maintenant !");
            d.liberer(c);
        }
        this.dames_capturees = new ArrayList<Dame>();
    }
}
