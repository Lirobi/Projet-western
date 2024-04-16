package western1.grammaire;

public class Feminin implements Genre{
    @Override
    public String getDeterminantIndefini() {
        return "une ";
    }
    @Override
    public String getDeterminantDefini(){
        return "la ";
    }

    @Override
    public String getArticlePartitif()
    {
        return "de la ";
    }
}
