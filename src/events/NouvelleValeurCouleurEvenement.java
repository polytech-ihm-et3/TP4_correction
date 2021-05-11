package events;

import java.awt.Color;
import javafx.event.Event;
import javafx.event.EventType;

public class NouvelleValeurCouleurEvenement extends Event
{
	private int valeurRouge;
	private int valeurVert;
	private int valeurBleu;
	
	public final static EventType<NouvelleValeurCouleurEvenement> NOUVELLE_VALEUR_COULEUR = new EventType<>("NOUVELLE_VALEUR_COULEUR");
	
	public NouvelleValeurCouleurEvenement(Object source, int nouvelleValeurRouge, int nouvelleValeurVert, int nouvelleValeurBleu)
	{
		super(NOUVELLE_VALEUR_COULEUR);
		this.valeurRouge = nouvelleValeurRouge;
		this.valeurVert = nouvelleValeurVert;
		this.valeurBleu = nouvelleValeurBleu;
	}
	
	/**
	 * Donne acc�s � la valeur de rouge transmise par l'�v�nement.
	 * @return La valeur de rouge
	 */
	public int getValeurRouge()
	{
		return valeurRouge;
	}
	
	/**
	 * Donne acc�s � la valeur de vert transmise par l'�v�nement.
	 * @return La valeur de vert
	 */
	public int getValeurVert()
	{
		return valeurVert;
	}
	
	/**
	 * Donne acc�s � la valeur de bleu transmise par l'�v�nement.
	 * @return La valeur de bleu
	 */
	public int getValeurBleu()
	{
		return valeurBleu;
	}
	
	/**
	 * Donne acc�s � la valeur hexad�cimale de la couleur transmise par l'�v�nement.
	 * @return La valeur hexad�cimale de la couleur
	 */
	public String getValeurHexadecimale()
	{
		String valeurHexadecimale = String.format("%02x%02x%02x", valeurRouge, valeurVert, valeurBleu);
		return valeurHexadecimale;
	}
}