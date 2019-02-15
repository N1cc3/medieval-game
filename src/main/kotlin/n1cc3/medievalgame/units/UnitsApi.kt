package n1cc3.medievalgame.units

import n1cc3.medievalgame.entities.UnitType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PathVariable as Var

@RestController
@RequestMapping(value = ["/units"])
class UnitsApi {

	@GetMapping("/info/{type}")
	fun hex(
		@Var("type") type: String
	) = UnitType(
		id = type,
		name = "Test Unit",
		hp = 1,
		attack = 1,
		defence = 1,
		armor = 1,
		range = 1,
		speed = 1,
		cost = 1
	)

}
