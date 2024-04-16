package western2;

public class Dame extends Personnage {
    private boolean estCaptive = false;
    public Dame(String nom) {
        super(nom);
        this.pseudo = "Miss " + nom;
    }
    public Dame(String nom, western1.Boisson boisson_preferee) {
        super("Miss " + nom, boisson_preferee);
        this.pseudo = "Miss " + nom;
    }

    public String capturer(Brigand b) {
        this.estCaptive = true;
        return this.dire(" Hiiii ! Au secours ! " + b.getNom() + " m’enlève !");
    }

    public String liberer(Cowboy c) {
        this.estCaptive = false;
        return this.dire(" Merci " + c.getNom() + ", tu es mon sauveur !");

    }

    public String dire(String texte) {
        return texte;
    }



}
