/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.slam1_exjouet;

import java.util.Scanner;

/**
 *
 * @author erwan
 */
public class SLAM1_exJouet {
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Jouet barbie = new Jouet("Poupée Barbie", "Plastique", 15, 2);
        Jouet echec = new Jouet("Echec lumineux", "Verre", 45, 4);
        
        String affMenu = "Que voulez-vous faire ?\n"
                + "1 - Afficher l'état de chacun des objets.\n"
                + "2 - Augmenter/Diminuer de (x)% euros le prix des deux objets.\n"
                + "3 - Intervertir la catégorie des deux jouets.\n"
                + "4 - Quitter";
        String affChoixAugDim = "Voulez-vous :\n1 - Augmenter\n2 - Diminuer";
        String affChoixAug = "De combien voulez-vous augmenter ?";
        String affChoixDim = "De combien voulez-vous diminuer ?";
        int choixMenu = 0;
        int choixAugDim;
        int prixModif;
        double pourcentModif;
        int catBarbie;
        int catEchec;
        while(choixMenu != 4)
        {
            choixMenu = repet(4,affMenu);
            if(choixMenu == 1)
            {
                System.out.println(barbie.affEtat());
                System.out.println(echec.affEtat());
            }
            if(choixMenu == 2)
            {
                choixAugDim = repet(2, affChoixAugDim);
                
                if(choixAugDim == 1)
                    pourcentModif = 1 + (repet(100, affChoixAug)/100.0);                      
                else      
                    pourcentModif = 1 - (repet(100, affChoixDim)/100.0);
                
                prixModif = (int)(barbie.getPrix() * pourcentModif);
                barbie.setPrix(prixModif);
                prixModif = (int)(echec.getPrix() * pourcentModif);
                echec.setPrix(prixModif);
            }
            if(choixMenu == 3)
            {
                catBarbie = barbie.getCategorie();
                catEchec = echec.getCategorie();
                barbie.setCategorie(catEchec);
                echec.setCategorie(catBarbie);
            }
        }
        System.out.println("Vous quittez le menu.");
    }


    public static int repet(int max, String repet)
    {
        int r = 0;
        while(r < 1 | r > max)
        {
            try
            {
                System.out.println(repet);              
                r = Integer.parseInt(s.next()); 

            }
            catch(Exception e)
            {

            }
        }
        return r;
    }
}
