package n1cc3.medievalgame.hexgrid

import junit.framework.TestCase.assertEquals
import org.junit.Test

class HexTest {

	@Test
	fun testDistance() {
		assertEquals("Distance between two equal hexes should be zero.", Hex(0, 0).distanceTo(Hex(0, 0)), 0)
	}

}
