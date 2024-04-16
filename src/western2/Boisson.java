package western2;

public class Boisson {
    private Substantif m_nom;


    public Boisson(String nom, western1.grammaire.Genre genre) {
        this.m_nom = new Substantif(nom, genre);
    }

    public String getNom() {
        return this.m_nom.getNom();
    }
    public Substantif getGenre() {
        return this.m_nom;
    }
}
