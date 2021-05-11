package controller;

import events.CouleurObservateur;
import model.Model;

public interface ControllerInterface
{
	/**
	 * Ajoute un observateur de l'�tat du mod�le.
	 * @param couleurObserveur L'observateur � ajouter
	 */
	public void ajouterUnObservateur(CouleurObservateur couleurObservateur);
	
	/**
	 * Supprime un observateur de l'�tat du mod�le.
	 * @param couleurObserveur L'observateur � supprimer
	 */
	public void supprimerUnObservateur(CouleurObservateur couleurObservateur);
	
	/**
	 * Actualise le mod�le avec une nouvelle valeur de rouge.
	 * @param valeurRouge La nouvelle valeur de rouge
	 */
	public void ValeurRougeModifiee(int valeurRouge);
	
	/**
	 * Actualise le mod�le avec une nouvelle valeur de vert.
	 * @param valeurVert La nouvelle valeur de vert
	 */
	public void ValeurVertModifiee(int valeurVert);
	
	/**
	 * Actualise le mod�le avec une nouvelle valeur de bleu.
	 * @param valeurBleu La nouvelle valeur de bleu
	 */
	public void ValeurBleuModifiee(int valeurBleu);
	
	/**
	 * Actualise le mod�le avec une nouvelle couleur.
	 * @param valeurRouge La nouvelle valeur de rouge
	 * @param valeurVert La nouvelle valeur de vert
	 * @param valeurBleu La nouvelle valeur de bleu
	 */
	public void CouleurModifiee(int valeurRouge, int valeurVert, int valeurBleu);
}
