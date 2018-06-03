package fr.unilim.iut.SpaceInvaders.model;

public class Envahisseur extends Sprite {
	private boolean deplacement;
	public Envahisseur( Dimension dimension, Position positionOrigine, int vitesse) {
    	super(dimension,positionOrigine,vitesse);
    	this.deplacement=true;
	}
	public boolean getDeplacement() {
		return this.deplacement;
	}
	
	public void changerDeplacement(boolean val) {
		this.deplacement=val;
	}
}
