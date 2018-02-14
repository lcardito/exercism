import java.time.LocalDate
import java.time.LocalDateTime
import kotlin.math.pow

class Gigasecond(localDateTime: LocalDateTime) {

    constructor(localDate: LocalDate) : this(localDate.atStartOfDay())

    val date: LocalDateTime? = localDateTime.plusSeconds(10.toDouble().pow(9).toLong())
}