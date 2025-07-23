fun main() {
    var room: Int = 1
    var hasSword = 0

    println("Welcome to Dungeon Crawler!")

    while (room == 1) {
        if (hasSword == 0) {
            println("You are in a small house. A door is to your left. A sword is on the ground next to you. Weird.")
        } else {
            println("You are in a small house. A door is to your left.")
        }

        print("> ") // shows a prompt symbol
        val result: String? = readLine()

        if (result == " ") {
            println("I don't understand.")
        } else if (result == "Pick up sword" && hasSword == 0) {
            hasSword = 1
            println("You picked up the sword. Shiny.")
        } else if (result == "Open door") {
            println("You step into the next room...")
            room = 2 // this will break the loop
        } else {
            println("I don't understand.")
        }
    }

    while (room == 2)  {
        println("You see a goblin in front of you. It looks angry.")

        print("> ") // shows a prompt symbol
        val result: String? = readLine()

        if (result == "Attack" && hasSword == 0) {
            println("You try using your fists but they're worthless. You get pummled. Thanks for playing!")
            break
        } else if (result == "Attack" && hasSword == 1) {
            println("You slash with your sword until the Goblin faints into a bloody pulp. Thanks for playing!")
            break
        } else if (result == "Go back") {
            room = 1
        }




    }






    println("End of demo. Thanks for playing!")
}