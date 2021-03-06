package fr.unilim.iut.SpaceInvaders;

import org.junit.Before;
import org.junit.Test;

import fr.unilim.iut.SpaceInvaders.model.Dimension;
import fr.unilim.iut.SpaceInvaders.model.Position;
import fr.unilim.iut.SpaceInvaders.model.Vaisseau;
import fr.unilim.iut.SpaceInvaders.utils.MissileException;

public class VaisseauTest {
	
	 @Test(expected = MissileException.class)
	 public void test_LongueurMissileSuperieureALongueurVaisseau_UneExceptionEstLevee() throws Exception {
		 
			Vaisseau vaisseau = new Vaisseau(new Dimension(5,2),new Position(5,9), 1);
			vaisseau.tirerUnMissile(new Dimension(7,2),1);
		}
	
	
   
}
