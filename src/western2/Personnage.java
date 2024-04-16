package western2;


import western1.grammaire.Feminin;

public abstract class Personnage {
    protected final String m_nom;
    protected final western1.Boisson boisson_preferee;
    protected String pseudo;


    public Personnage(String nom) {
        this.m_nom = nom;
        this.pseudo = nom;
        this.boisson_preferee = new western1.Boisson("Eau", new Feminin());
    }

    public Personnage(String nom, western1.Boisson boisson_preferee) {
        this.m_nom = nom;
        this.pseudo = nom;

        this.boisson_preferee = boisson_preferee;
    }

    public String dire(String texte) {
        return this.getPseudo() + " - " + texte;
    }
    public String sePresenter() {
        return this.dire("Bonjour, je suis " + this.m_nom + " et j'aime " + this.boisson_preferee.getGenre().getNomAvecArticleDefini() + "." );
    }

    public String boire() {
        return this.dire("Ah ! Boire " + this.boisson_preferee.getGenre().getNomAvecArticlePartitif() + " ! GLOUPS !");

    }
    public void boire(western1.Boisson boisson) {
        if (boisson != this.boisson_preferee) {

            this.dire("« GLOUPS ! Faut vraiment avoir soif pour boire " + boisson.getGenre().getNomAvecArticlePartitif() + " ! J’aurais préféré boire " + this.boisson_preferee.getGenre().getNomAvecArticlePartitif() + "! ». ");

        } else {
            this.boire();
        }
    }
    public String getNom() {
        return this.m_nom;
    }

    public String getPseudo() {
        return this.pseudo;
    }

    public western1.Boisson getBoissonPreferee(){
        return this.boisson_preferee;
    }

//    public static void main(String[] args) {
//        Personnage personnage1 = new Personnage("test", new Boisson("bière", Genre.FEMININ));
//        personnage1.boire();
//        personnage1.boire(new Boisson("Eau", Genre.FEMININ));
//    }
}

