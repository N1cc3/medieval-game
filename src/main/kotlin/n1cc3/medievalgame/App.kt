package n1cc3.medievalgame

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class App {

    companion object {
        fun main(args: Array<String>) {
            runApplication<App>(*args)
        }
    }

}

fun main(args: Array<String>) {
    App.main(args)
}