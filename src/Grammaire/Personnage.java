package Grammaire;

public class Personnage {
    private String m_nom;
    private Boisson boisson_preferee;

    public Personnage(String nom) {
        this.m_nom = nom;
    }

    public Personnage(String nom, Boisson boisson_preferee) {
        this.m_nom = nom;
        this.boisson_preferee = boisson_preferee;
    }

    public void dire(String texte) {

    }
    public void sePresenter() {

    }

    public void boire() {
        if(this.boisson_preferee == null) {
            System.out.println("Je n'ai pas de boisson préférée ! ");
        }
        else {
            System.out.println("Ah ! Boire " + this.boisson_preferee.getGenre().getNomAvecArticlePartitif() + " ! GLOUPS !");
        }
    }
    public void boire(Boisson boisson) {
        if (boisson != this.boisson_preferee) {

            System.out.println("« GLOUPS ! Faut vraiment avoir soif pour boire " + boisson.getGenre().getNomAvecArticlePartitif() + " ! J’aurais préféré boire " + this.boisson_preferee.getGenre().getNomAvecArticlePartitif() + "! ». ");

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

