package western2;

public class Dame extends Personnage {
    private boolean estCaptive = false;
    public Dame(String nom) {
        super(nom);
        this.pseudo = "Miss " + nom;
    }
    public Dame(String nom, Boisson boisson_preferee) {
        super("Miss " + nom, boisson_preferee);
        this.pseudo = "Miss " + nom;
    }

    public void capturer(Brigand b) {
        this.dire(" Hiiii ! Au secours ! " + b.getNom() + " m’enlève !");
        this.estCaptive = true;
    }

    public void liberer(Cowboy c) {
        this.dire(" Merci " + c.getNom() + ", tu es mon sauveur !");
        this.estCaptive = false;
    }




}