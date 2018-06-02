package fr.unilim.iut.SpaceInvaders.model;

import fr.unilim.iut.SpaceInvaders.utils.MissileException;


public class Vaisseau extends Sprite {
    
    public Vaisseau( Dimension dimension, Position positionOrigine, int vitesse) {
    	super(dimension,positionOrigine,vitesse);
	}
   
    public Missile tirerUnMissile(Dimension dimensionMissile, int vitesseMissile) {
    	if(this.dimension.longueur<dimensionMissile.longueur)
    		throw new MissileException("La longueur du missile est supérieur à celle de vaisseau");
		
    	Position positionOrigineMissile = calculerLaPositionDeTirDuMissile(dimensionMissile);

		return new Missile(dimensionMissile, positionOrigineMissile, vitesseMissile);
	}

	private Position calculerLaPositionDeTirDuMissile(Dimension dimensionMissile) {
		int abscisseMilieuVaisseau = this.abscisseLaPlusAGauche() + (this.longueur() / 2);
		int abscisseOrigineMissile = abscisseMilieuVaisseau - (dimensionMissile.longueur() / 2);

		int ordonneeeOrigineMissile = this.ordonneeLaPlusBasse() - 1;
		Position positionOrigineMissile = new Position(abscisseOrigineMissile, ordonneeeOrigineMissile);
		return positionOrigineMissile;
	}
}