package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

	@Test
	//Test si la tour est
	public void empiler_VoidTrue() {
		boolean expected = true;
		Tour tower = new Tour(10);
		Disque d = new Disque(1);
		boolean actual = tower.empiler(d);
		assertEquals(expected, actual);
	}

	@Test
	//Test si le disque est inférieur au disque existant et que la taille max de la tour n'est pas atteinte
	public void empiler_NonVide_TailleNonMax_DisqueInferieur_True() {
		boolean expected = true;
		Tour tower = new Tour(10);
		Disque d1 = new Disque(3);
		Disque d2 = new Disque(2);
		tower.empiler(d1);
		boolean actual = tower.empiler(d2);
		assertEquals(expected, actual);
	}

	@Test
	//Test si la taille de la tour est max
	public void empiler_NonVide_TailleMax_False() {
		boolean expected = false;
		Tour tower = new Tour(1);
		Disque d1 = new Disque(3);
		Disque d2 = new Disque(2);
		tower.empiler(d1);
		boolean actual = tower.empiler(d2);
		assertEquals(expected, actual);
	}

	@Test
	//Test si le disque ajouter est plus grand que le disque déjà en place
	public void empiler_NonVide_TailleNonMax_DisqueSuperieur_False() {
		boolean expected = false;
		Tour tower = new Tour(10);
		Disque d1 = new Disque(1);
		Disque d2 = new Disque(2);
		tower.empiler(d1);
		boolean actual = tower.empiler(d2);
		assertEquals(expected, actual);
	}

}
