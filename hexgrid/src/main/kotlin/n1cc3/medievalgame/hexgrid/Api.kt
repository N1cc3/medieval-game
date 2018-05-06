package n1cc3.medievalgame.hexgrid

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PathVariable as Var

@RestController
@RequestMapping(value = ["/hexgrid"])
class Api {

	@GetMapping("/distance/{x1}/{y1}/{x2}/{y2}")
	fun hex(
		@Var("x1") x1: Int,
		@Var("y1") y1: Int,
		@Var("x2") x2: Int,
		@Var("y2") y2: Int
	) = Hex(x1, y1).distanceTo(Hex(x2, y2))

}


