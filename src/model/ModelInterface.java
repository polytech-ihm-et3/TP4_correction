package model;

import events.CouleurObservateur;

public interface ModelInterface
{
	/**
	 * Donne acc�s � la valeur de rouge du mod�le.
	 * @return La valeur de rouge
	 */
	public int getValeurRouge();
	
	/**
	 * Modifie la valeur de rouge du mod�le.
	 * @param valeurRouge La nouvelle valeur de rouge
	 */
	public void setValeurRouge(int valeurRouge);
	
	/**
	 * Donne acc�s � la valeur de vert du mod�le.
	 * @return La valeur de vert
	 */
	public int getValeurVert();
	
	/**
	 * Modifie la valeur de vert du mod�le.
	 * @param valeurVert La nouvelle valeur de vert
	 */
	public void setValeurVert(int valeurVert);
	
	/**
	 * Donne acc�s � la valeur de bleu du mod�le.
	 * @return La valeur de bleu
	 */
	public int getValeurBleu();
	
	/**
	 * Modifie la valeur de bleu du mod�le.
	 * @param valeurBleu La nouvelle valeur de bleu
	 */
	public void setValeurBleu(int valeurBleu);
	
	/**
	 * Modifie la couleur du mod�le.
	 * @param valeurRouge La nouvelle valeur de rouge
	 * @param valeurVert La nouvelle valeur de vert
	 * @param valeurBleu La nouvelle valeur de bleu
	 */
	public void setCouleur(int valeurRouge, int valeurVert, int valeurBleu);
	
	/**
	 * Ajoute un CouleurObservateur � la liste tenue par le mod�le.
	 * Il sera pr�venu si la couleur du mod�le change.
	 * @param couleurObservateur Le CouleurObservateur � ajouter
	 */
	public void ajouterUnObservateur(CouleurObservateur couleurObservateur);
	
	/**
	 * Supprime un CouleurObservateur de la liste tenue par le mod�le.
	 * Il ne sera plus pr�venu si la couleur du mod�le change.
	 * @param couleurObservateur Le CouleurObservateur � ajouter
	 */
	public void supprimerUnObservateur(CouleurObservateur couleurObservateur);
	
	/**
	 * Envoie, aux CouleurObservateurs de la liste tenue par le mod�le,
	 * un �v�nement contenant la nouvelle couleur.
	 */
	public void prevenirLesObservateurs();
}
