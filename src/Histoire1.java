//  @ Project : Western
//  @ File Name : Histoire1.java
//  @ Date : 02/02/2010
//  @ Author : P. Divoux
//  @ Date : 31/12/2021
//  @ Author : R. Schneider
//
//

import western1.Boisson;
import western1.grammaire.Feminin;
import western1.grammaire.Genre;
import western1.Personnage;
import western1.grammaire.Masculin;

public class Histoire1
{

    // TODO : faire les deux dernières questions de la partie 1 du sujet.
    public static void main(String[] args)
    {
        Personnage max = new Personnage("Max");
        Personnage kid = new Personnage("The Kid", new Boisson("thé à la menthe", new Masculin()));
        Personnage bill = new Personnage("Bill", new Boisson("whisky", new Masculin()));

        max.sePresenter();
        max.boire();
        max.dire("Bon, au boulot, maintenant !");

        kid.sePresenter();
        kid.boire();

        bill.sePresenter();
        bill.boire(new Boisson("eau", new Feminin()));
    }
}
