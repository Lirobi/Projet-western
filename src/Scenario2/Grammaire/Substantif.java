package Scenario2.Grammaire;

public class Substantif {
    private String m_nom;
    private Genre m_genre;

    private String[] voyelles = {"a", "e", "i", "o", "u", "y"};

    public Substantif(String nom, Genre genre) {
        this.m_nom = nom;
        this.m_genre = genre;
    }

    public String getArticleDefini() {
        for(String v : voyelles) {
            if(this.m_nom.toLowerCase().startsWith(v)) {
                return "l'";
            }
        }
        if(this.m_genre == Genre.MASCULIN) {
            return "le ";
        } else {
            return "la ";
        }
    }

    public String getNomAvecArticleDefini() {
        for(String v : voyelles) {
            if(this.m_nom.toLowerCase().startsWith(v)) {
                return "l'" + this.m_nom;
            }
        }
        if(this.m_genre == Genre.MASCULIN) {
            return "le " + this.m_nom;
        } else {
            return "la " + this.m_nom;
        }
    }

    public String getArticleIndefini() {
        if(this.m_genre == Genre.MASCULIN) {
            return "un ";
        } else {
            return "une ";
        }
    }

    public String getNomAvecArticleIndefini() {
        if(this.m_genre == Genre.MASCULIN) {
            return "un " + this.m_nom;
        } else {
            return "une " + this.m_nom;
        }
    }

    public String getArticlePartitif() {
        for(String v : voyelles) {
            if(this.m_nom.toLowerCase().startsWith(v)) {
                return "de l'";
            }
        }
        if(this.m_genre == Genre.MASCULIN) {
            return "du ";
        } else {
            return "de la ";
        }
    }

    public String getNomAvecArticlePartitif() {
        for(String v : voyelles) {
            if(this.m_nom.toLowerCase().startsWith(v)) {
                return "de l'" + this.m_nom;
            }
        }
        if(this.m_genre == Genre.MASCULIN) {
            return "du " + this.m_nom;
        } else {
            return "de la " + this.m_nom;
        }
    }
    public String getNomAvecPreposititon() {
        for(String v : voyelles) {
            if(this.m_nom.toLowerCase().startsWith(v)) {
                return "d'" + this.m_nom;
            }
        }
        if(this.m_genre == Genre.MASCULIN) {
            return "de " + this.m_nom;
        } else {
            return "de " + this.m_nom;
        }
    }

    public String getNom() {
        return this.m_nom;
    }
    public Genre getGenre()  {
        return this.m_genre;
    }
}
