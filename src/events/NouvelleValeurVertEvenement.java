package events;

import javafx.event.Event;
import javafx.event.EventType;

@SuppressWarnings("serial")
public class NouvelleValeurVertEvenement extends Event
{
	private int valeurVert;
	
	public final static EventType<NouvelleValeurVertEvenement> NOUVELLE_VALEUR_VERT = new EventType<>("NOUVELLE_VALEUR_VERT");
	
	public NouvelleValeurVertEvenement(Object source, int nouvelleValeurVert)
	{
		super(NOUVELLE_VALEUR_VERT);
		this.valeurVert = nouvelleValeurVert;
	}
	
	/**
	 * Donne acc�s � la valeur de vert transmise par l'�v�nement.
	 * @return La valeur de vert
	 */
	public int getValeurVert()
	{
		return valeurVert;
	}
}