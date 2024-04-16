//  @ Project : Western
//  @ File Name : Histoire2.java
//  @ Date : 02/02/2010
//  @ Author : P. Divoux
//  @ Date : 31/12/2022
//  @ Author : R. Schneider
//
//

import Scenario2.Grammaire.*;
import Scenario3.Grammaire.*;
import western1.grammaire.Feminin;
import western1.grammaire.Masculin;
import western2.*;

public class Histoire2
{

    // TODO : faire les diagrammes aussi comme pour le scenario 1
    public static void main(String[] args)
    {
        Dame scarlett = new Dame("Scarlett");
        Cowboy luke = new Cowboy("Luke", new western1.Boisson("bière", new Feminin()));
        Brigand dalton = new Brigand("Dalton", new western1.Boisson("whisky", new Masculin()));
        Narrateur narrateur = new Narrateur("Ed");

        /* Les présentations */
        narrateur.sePresenter();
        narrateur.dire("Il était une fois, à l'Ouest de Java Town, trois personnages singuliers :");
        scarlett.sePresenter();
        luke.sePresenter();
        dalton.sePresenter();

        /* Les libations */
        narrateur.dire("Après leur traversée du désert, nos trois personnages s'arrêtent dans un bar pour étancher leur soif.");
        luke.dire("Nous sommes arrivés. Trinquons, maintenant !");
        luke.boire();
        dalton.boire();
        dalton.dire("Waoh ! Il est fort celui-la !");
        scarlett.boire();
        scarlett.dire("C'est quand même plus rafraîchissant que l'alcool !");

        /* un peu d'action */
        narrateur.dire("Et maintenant, un peu d'action.");
        narrateur.dire(dalton.getNom() + " kidnappe " + scarlett.getNom() + ".");
        dalton.kidnapper(scarlett);
        narrateur.dire("Mais " + luke.getNom() + " intervient sans tarder et capture " + dalton.getNom() + ".");
        luke.tirerSur(dalton);
        luke.capturer(dalton);
    }
}

