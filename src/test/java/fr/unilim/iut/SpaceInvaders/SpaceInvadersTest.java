package fr.unilim.iut.SpaceInvaders;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import fr.unili.iut.SpaceInvaders.utils.DebordementEspaceJeuException;
import fr.unili.iut.SpaceInvaders.utils.HorsEspaceJeuException;
import fr.unilim.iut.SpaceInvaders.model.Dimension;
import fr.unilim.iut.SpaceInvaders.model.Position;
import fr.unilim.iut.SpaceInvaders.model.SpaceInvaders;

public class SpaceInvadersTest {
	private SpaceInvaders spaceinvaders;
	
	@Before
	public void initialisaton() {
		 spaceinvaders = new SpaceInvaders(15, 10);
	}
	@Test
	public void test_AuDebut_JeuSpaceInvadersEstVide() {
		
	    assertEquals("" + 
	    "...............\n" + 
	    "...............\n" +
	    "...............\n" + 
	    "...............\n" + 
	    "...............\n" + 
	    "...............\n" + 
	    "...............\n" + 
	    "...............\n" + 
	    "...............\n" + 
	    "...............\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	}
	@Test
	public void test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu() {
		
<<<<<<< Upstream, based on 6b94ae13694d0f2ee302f6a4d80f5ad01d13d963
		spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(1,1),new Position(7,9));
=======
		spaceinvaders.positionnerUnNouveauVaisseau(1,1,7,9);
>>>>>>> 1331bad Positionner vaisseau dimension
		assertEquals("" + 
		"...............\n" + 
		"...............\n" +
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		".......V.......\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	}
	 
	
	 
	 @Test
		public void test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException() {
		
			
			try {
<<<<<<< Upstream, based on 6b94ae13694d0f2ee302f6a4d80f5ad01d13d963
				spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(1,1),new Position(15,9));
=======
				spaceinvaders.positionnerUnNouveauVaisseau(1,1,15,9);
>>>>>>> 1331bad Positionner vaisseau dimension
				fail("Position trop à droite : devrait déclencher une exception HorsEspaceJeuException");
			} catch (final HorsEspaceJeuException e) {
			}
			
			
			try {
<<<<<<< Upstream, based on 6b94ae13694d0f2ee302f6a4d80f5ad01d13d963
				spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(1,1),new Position(-1,9));
=======
				spaceinvaders.positionnerUnNouveauVaisseau(1,1,-1,9);
>>>>>>> 1331bad Positionner vaisseau dimension
				fail("Position trop à gauche : devrait déclencher une exception HorsEspaceJeuException");
			} catch (final HorsEspaceJeuException e) {
			}
			
			
			try {
<<<<<<< Upstream, based on 6b94ae13694d0f2ee302f6a4d80f5ad01d13d963
				spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(1,1),new Position(14,10));
=======
				spaceinvaders.positionnerUnNouveauVaisseau(1,1,14,10);
>>>>>>> 1331bad Positionner vaisseau dimension
				fail("Position trop en bas : devrait déclencher une exception HorsEspaceJeuException");
			} catch (final HorsEspaceJeuException e) {
			}
			
			
			try {
<<<<<<< Upstream, based on 6b94ae13694d0f2ee302f6a4d80f5ad01d13d963
				spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(1,1),new Position(14,-1));
=======
				spaceinvaders.positionnerUnNouveauVaisseau(1,1,14,-1);
>>>>>>> 1331bad Positionner vaisseau dimension
				fail("Position trop à haut : devrait déclencher une exception HorsEspaceJeuException");
			} catch (final HorsEspaceJeuException e) {
			}
				
		}
	 
	 @Test
<<<<<<< Upstream, based on 6b94ae13694d0f2ee302f6a4d80f5ad01d13d963
		public void test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu() {
		 spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(3,2),new Position(7,9));
=======
		public void test_VaisseauAvance_DeplacerVaisseauVersLaDroite() {
			
			spaceinvaders.positionnerUnNouveauVaisseau(1,1,7,9);

			spaceinvaders.deplacerVaisseauVersLaDroite();
			
>>>>>>> 1331bad Positionner vaisseau dimension
			assertEquals("" + 
			"...............\n" + 
			"...............\n" +
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			".......VVV.....\n" + 
			".......VVV.....\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
			}
	 @Test
		public void test_UnNouveauVaisseauPositionneDansEspaceJeuMaisAvecDimensionTropGrande_DoitLeverUneExceptionDeDebordement() {
			
			try {
				spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(9,2),new Position(7,9));
				fail("Dépassement du vaisseau à droite en raison de sa longueur trop importante : devrait déclencher une exception DebordementEspaceJeuException");
			} catch (final DebordementEspaceJeuException e) {
			}
			
			
			try {
				spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(3,4),new Position(7,1));
				fail("Dépassement du vaisseau vers le haut en raison de sa hauteur trop importante : devrait déclencher une exception DebordementEspaceJeuException");
			} catch (final DebordementEspaceJeuException e) {
			}
				
		}
	 @Test
	    public void test_VaisseauAvance_DeplacerVaisseauVersLaDroite() {
			
			spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(3,2),new Position(7,9));
			spaceinvaders.deplacerVaisseauVersLaDroite();
			assertEquals("" + 
			"...............\n" + 
			"...............\n" +
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"........VVV....\n" + 
			"........VVV....\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
		}
	 @Test
		public void test_VaisseauImmobile_DeplacerVaisseauVersLaDroite() {
			
<<<<<<< Upstream, based on 6b94ae13694d0f2ee302f6a4d80f5ad01d13d963
			spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(3,2),new Position(12,9));
=======
			spaceinvaders.positionnerUnNouveauVaisseau(1,1,14,9);

>>>>>>> 1331bad Positionner vaisseau dimension
			spaceinvaders.deplacerVaisseauVersLaDroite();
			assertEquals("" + 
			"...............\n" + 
			"...............\n" +
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"............VVV\n" + 
			"............VVV\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
		}
	 @Test
		public void test_VaisseauAvance_DeplacerVaisseauVersLaGauche() {
			
<<<<<<< Upstream, based on 6b94ae13694d0f2ee302f6a4d80f5ad01d13d963
			spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(3,2),new Position(7,9));
=======
			spaceinvaders.positionnerUnNouveauVaisseau(1,1,7,9);

>>>>>>> 1331bad Positionner vaisseau dimension
			spaceinvaders.deplacerVaisseauVersLaGauche();
		
			assertEquals("" + 
			"...............\n" + 
			"...............\n" +
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"......VVV......\n" + 
			"......VVV......\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	    }
	 @Test
		public void test_VaisseauImmobile_DeplacerVaisseauVersLaGauche() {
			
<<<<<<< Upstream, based on 6b94ae13694d0f2ee302f6a4d80f5ad01d13d963
			spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(3,2),new Position(0,9));
=======
			spaceinvaders.positionnerUnNouveauVaisseau(1,1,0,9);

>>>>>>> 1331bad Positionner vaisseau dimension
			spaceinvaders.deplacerVaisseauVersLaGauche();
			
			assertEquals("" + 
			"...............\n" + 
			"...............\n" +
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"VVV............\n" + 
			"VVV............\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
		}
	 @Test
		public void test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu() {
			spaceinvaders.positionnerUnNouveauVaisseau(3,2,7,9);
			assertEquals("" + 
			"...............\n" + 
			"...............\n" +
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			".......VVV.....\n" + 
			".......VVV.....\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
		}
}

