package n1cc3.medievalgame.terrain

class Terrain(
	val sizeX: Int,
	val sizeY: Int,
	defaultTerrainType: TerrainType
) {

	private val terrainTypes = Array(sizeX, { Array(sizeY, { defaultTerrainType }) })

	operator fun get(x: Int, y: Int): TerrainType = terrainTypes[x][y]

	operator fun set(x: Int, y: Int, value: TerrainType) {
		terrainTypes[x][y] = value
	}

}