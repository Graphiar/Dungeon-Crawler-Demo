fun main() {
    var room: Int = 1
    var hasSword = 0

    println("Welcome to Dungeon Crawler!")

    while (room == 1 || room == 2) {
        if (hasSword == 0) {
            println("You are in a small house. A door is to your left. A sword is on the ground next to you. Weird.")
        } else {
            println("You are in a small house. A door is to your left.")
        }

        print("> ") // shows a prompt symbol
        val result: String? = readLine()
          if (result == "Pick up sword" && hasSword == 0) {
            hasSword = 1
            println("You picked up the sword. Shiny.")
        } else if (result == "Open door") {
            println("You step into the next room...")
            room = 2 // this will go to the next block
        } else {
            println("I don't understand.")
        }

        if (room == 2) {
            println("You see a Goblin. It looks angry")
            print("> ") // shows a prompt symbol
            val result: String? = readLine()
            if (result == "Attack" && hasSword == 0) {
                println("Your fists are worth nothing and were destroyed, along with you.")
                break
            } else if (result == "Attack" && hasSword == 1) {
                println("You slash the Goblin into pieces.")
                break
            } else if (result == "Go back") {
                room = 1
            }
        }
    }
          println("Demo ended. Thanks for playing!")
}