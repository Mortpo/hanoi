package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisqueTest {
	
	Disque dSmall = new Disque(1);
	Disque dMedium = new Disque(2);
	Disque dTall = new Disque(3);

	@Test
	//Test disque de taille inférieur à disque de taille supérieur
	public void compareTo_SmallMedium_Negative(){
		int expected = -1;
		int actual = dSmall.compareTo(dMedium);
		assertEquals(expected, actual);
	}

	@Test
	//Test disque de taille supérieur à disque de taille inférieur
	public void compareTo_MediumSmall_Positive(){
		int expected = 1;
		int actual = dMedium.compareTo(dSmall);
		assertEquals(expected, actual);
	}

	@Test
	//Test disque de taille égales
	public void compareTo_MediumMedium_Zero(){
		int expected = 0;
		int actual = dMedium.compareTo(dMedium);
		assertEquals(expected, actual);
	}
}
