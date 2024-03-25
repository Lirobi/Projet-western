package Scenario1.Grammaire;

public class Personnage {
    private final String m_nom;
    private final Boisson boisson_preferee;

    public Personnage(String nom) {
        this.m_nom = nom;
        this.boisson_preferee = new Boisson("Eau", Genre.FEMININ);
    }

    public Personnage(String nom, Boisson boisson_preferee) {
        this.m_nom = nom;
        this.boisson_preferee = boisson_preferee;
    }

    public void dire(String texte) {
        System.out.println(this.m_nom + " - " + texte);
    }
    public void sePresenter() {
        System.out.println(this.m_nom + " - Bonjour, je suis " + this.m_nom + " et j'aime " + this.boisson_preferee.getGenre().getNomAvecArticleDefini() + "." );
    }

    public void boire() {
        System.out.println(this.m_nom + " - " + "Ah ! Boire " + this.boisson_preferee.getGenre().getNomAvecArticlePartitif() + " ! GLOUPS !");

    }
    public void boire(Boisson boisson) {
        if (boisson != this.boisson_preferee) {

            System.out.println(this.m_nom + " - " + "« GLOUPS ! Faut vraiment avoir soif pour boire " + boisson.getGenre().getNomAvecArticlePartitif() + " ! J’aurais préféré boire " + this.boisson_preferee.getGenre().getNomAvecArticlePartitif() + "! ». ");

        } else {
            this.boire();
        }
    }

//    public static void main(String[] args) {
//        Personnage personnage1 = new Personnage("test", new Boisson("bière", Genre.FEMININ));
//        personnage1.boire();
//        personnage1.boire(new Boisson("Eau", Genre.FEMININ));
//    }
}

