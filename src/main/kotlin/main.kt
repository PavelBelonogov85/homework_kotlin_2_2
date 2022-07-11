import kotlin.random.Random

fun main() {
    val likes:Int = Random.nextInt(1, 1000)

    //val likes:Int = 241

    val peopleFormat:String =   if (likes%100 == 11) {"людям"}
                                else {
                                    if (likes%10 != 1) {"людям"}
                                    else {"человеку"}
                                }

    val suffix:String = when(likes%100) {
                        40 -> "ка"
                        in 11..20 -> "ти"
                        else ->
                            when(likes%10) {
                                0 -> "ти"
                                1 -> "му"
                                2 -> "ум"
                                3,4 -> "ем"
                                5,6,9 -> "ти"
                                else -> "ми"
                            }
                        }

    println("Понравилось $likes-$suffix $peopleFormat")

}