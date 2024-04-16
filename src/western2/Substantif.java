package western2;

public class Substantif {
    private String m_nom;
    private western1.grammaire.Genre m_genre;

    private String[] voyelles = {"a", "e", "i", "o", "u", "y"};

    public Substantif(String nom, western1.grammaire.Genre genre) {
        this.m_nom = nom;
        this.m_genre = genre;
    }

    public String getArticleDefini() {
        for(String v : voyelles) {
            if(this.m_nom.toLowerCase().startsWith(v)) {
                return "l'";
            }
        }
        return this.m_genre.getDeterminantDefini();
    }

    public String getNomAvecArticleDefini() {
        for(String v : voyelles) {
            if(this.m_nom.toLowerCase().startsWith(v)) {
                return "l'" + this.m_nom;
            }
        }
        return this.m_genre.getDeterminantDefini() + this.m_nom;
    }

    public String getArticleIndefini() {
        return this.m_genre.getDeterminantIndefini();
    }

    public String getNomAvecArticleIndefini() {
        return this.m_genre.getDeterminantIndefini() + this.getNom();
    }

    public String getArticlePartitif() {
        for(String v : voyelles) {
            if(this.m_nom.toLowerCase().startsWith(v)) {
                return "de l'";
            }
        }
        return this.m_genre.getArticlePartitif();
    }

    public String getNomAvecArticlePartitif() {
        for(String v : voyelles) {
            if(this.m_nom.toLowerCase().startsWith(v)) {
                return "de l'" + this.m_nom;
            }
        }
        return this.m_genre.getArticlePartitif() + this.m_nom;
    }
    public String getNomAvecPreposititon() {
        for(String v : voyelles) {
            if(this.m_nom.toLowerCase().startsWith(v)) {
                return "d'" + this.m_nom;
            }
        }
        return "de " + this.m_nom;
    }

    public String getNom() {
        return this.m_nom;
    }
    public western1.grammaire.Genre getGenre()  {
        return this.m_genre;
    }
}
