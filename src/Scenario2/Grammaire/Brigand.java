package Scenario2.Grammaire;

import java.util.ArrayList;
import java.util.List;

public class Brigand extends Personnage{
    private int recompense = 100;
    private List<Dame> dames_capturees = new ArrayList<Dame>();
    public Brigand(String nom) {
        super(nom + " le méchant");
        this.pseudo = "Miss " + nom;

    }
    public Brigand(String nom, Boisson boisson_preferee) {
        super(nom + " le méchant", boisson_preferee);
        this.pseudo = "Miss " + nom;

    }

    public int getRecompense() {
        return this.recompense;
    }

    public void capturer(Cowboy c) {

        this.dire( "Damned, je suis fait ! Tu m'as eu, " + c.getNom() + " ! Mais tu n'emporteras pas les" +
                " " + this.getRecompense() + " $ au paradis.");
        c.porte_monnaie += this.getRecompense();
        c.brigands_captures.add(this);
        this.liberer_dames(c);
    }

    public void kidnapper(Dame dame) {
        this.dire(" Ah, ah ! " + dame.getNom() + ", tu es mienne désormais !");
        this.recompense += 50;
        dame.capturer(this);
        this.dames_capturees.add(dame);
    }
    public void liberer_dames(Cowboy c) {
        for(Dame d : this.dames_capturees) {
            c.dire("Voilà " + d.getNom() + ", tu es libre maintenant !");
            d.liberer(c);
        }
        this.dames_capturees = new ArrayList<Dame>();
    }

}
