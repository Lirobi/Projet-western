package western2;

public class Dame extends Personnage {
    private Brigand estCaptive;
    private Cowboy sauveur;
    public Dame(String nom) {
        super(nom);
        this.pseudo = "Miss " + nom;
    }
    public Dame(String nom, western1.Boisson boisson_preferee) {
        super("Miss " + nom, boisson_preferee);
        this.pseudo = "Miss " + nom;
    }

    public String capturer(Brigand b) {
        this.estCaptive = b;
        return this.dire(" Hiiii ! Au secours ! " + b.getNom() + " m’enlève !");
    }

    public String liberer(Cowboy c) {
        this.estCaptive = null;
        this.sauveur = c;
        return this.dire(" Merci " + c.getNom() + ", tu es mon sauveur !");
    }

    @Override
    public String sePresenter() {
        String str = "Bonjour, je suis " + this.getPseudo() + " et j'aime boire " + this.boisson_preferee.getGenre().getNomAvecArticlePartitif() + ". ";
        if(this.estCaptive == null) {
            str += "Je suis libre ";
            if(this.sauveur != null) {
                str += "grâce à mon sauveur " + this.sauveur.getPseudo() + ". ";
            }
        }
        else {
            str += "Je suis captive de cet escroc de " + this.estCaptive.getPseudo() + ".";
        }
        return this.dire(str);
    }
}
