package n1cc3.medievalgame

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["n1cc3.medievalgame"])
class App

fun main(args: Array<String>) {
	runApplication<App>(*args)
}