package western1.grammaire;

public class Masculin implements Genre {
    @Override
    public String getDeterminantIndefini() {
        return "un ";
    }
    @Override

    public String getDeterminantDefini(){
        return "le ";

    }
    @Override

    public String getArticlePartitif()
    {
        return "du ";
    }
}
