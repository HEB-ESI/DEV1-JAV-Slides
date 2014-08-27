





package esi.java.cours;

import java.util.Scanner ; 
 
public class CalculPrixVente { 
	 public static void main ( String[] args ) { 
	 	 Scanner clavier = new Scanner ( System.in ) ;  
	 	 double àPayer;
	 	 int prixUnitaire = clavier.nextInt();
	 	 int nombreArticles = clavier.nextInt();
	 	 int tauxTVA = clavier.nextInt();

	 	 àPayer = prixUnitaire * nombreArticles * (1 + tauxTVA/100.0);

	 	 System.out.println(àPayer);
	 }
}
