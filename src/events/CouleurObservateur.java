package events;

public interface CouleurObservateur 
{
	/**
	 * Informe le CouleurObservateur que l'�tat du mod�le a chang�.
	 * @param evenement L'�v�nement contenant le nouvel �tat du mod�le
	 */
	public void NouvelleValeurCouleur(NouvelleValeurCouleurEvenement evenement);
}
