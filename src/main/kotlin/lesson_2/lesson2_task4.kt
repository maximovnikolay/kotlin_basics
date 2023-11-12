package lesson_2

fun main() {
    val buffValue = 1.2f
    val gainedCrystalOre = 7
    val gainedIronOre = 11

    val additionalCrystalOre = (gainedCrystalOre * buffValue) - gainedCrystalOre
    val additionalIronOre = (gainedIronOre * buffValue) - gainedIronOre

    println(String.format("Дополнительно кристаллической руды: %.0f", additionalCrystalOre))
    println(String.format("Дополнительно железной руды: %.0f", additionalIronOre))
}