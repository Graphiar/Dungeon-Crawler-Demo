fun main() {
    //Andrew Pettway Dungeon Crawler 0.2 - July 2025
    var room: Int = 1
    var hasSword = 0
    var health = 100
    var damage = 0
    var help = "Commands: ver, health, damage, quit, debug"
    var version = 0.2
    var goblinSlain = 0

    println("Welcome to Dungeon Crawler!")

    while (room == 1 || room == 2 || room == 3) {
        //Room 1 Logic Start
        if (room == 1) {
            if (hasSword == 0) {
                println("You are in a small house. A door is to your left. A sword is on the ground next to you. Weird.")
            } else {
                println("You are in a small house. A door is to your left.")
            }

            print("> ") //  shows a prompt symbol
            val result: String? = readLine()?.trim()

            if (result == "Pick up sword" && hasSword == 0) {
                hasSword = 1
                damage = 5
                println("You picked up the sword. Shiny.")
            } else if (result == "Open door") {
                println("You step into the next room...")
                room = 2 // this will go to the next block
            } else if (result == "quit") {
                break

            } else if (result == "health") {
                println(health)

            } else if (result == "ver") {
                println(version)

            } else if (result == "damage") {
                println(damage)

            } else if (result == "help") {
                println(help)

            } else if (result == "debug") {
                println("Current room is $room")

            } else {
                println("I don't understand.")
            }
        } //Room 1 Logic End

        //Room 2 Logic Start
        else if (room == 2) {
            if (goblinSlain == 0) {
                println("You see a Goblin. It looks angry")
            }
            print("> ") // shows a prompt symbol
            val result: String? = readLine()?.trim()
            if (result == "Attack" && hasSword == 0) {
                println("Your fists are worth nothing and were destroyed, along with you.")
                break
            } else if (result == "Attack" && hasSword == 1) {
                health -= 5
                goblinSlain = 1
                println("You slash the Goblin into pieces. Lost 5 health. Current health: $health")
                println("You see a light in another room to the north of you. Maybe try....GOING NORTH?")

            } else if (result == "quit") {
                break

            } else if (result == "health") {
                println(health)

            } else if (result == "ver") {
                println(version)

            } else if (result == "damage") {
                println(damage)

            } else if (result == "help") {
                println(help)

            } else if (result == "debug") {
                println("Current room is $room")

            } else if (result == "Go back") {
                room = 1

            } else if (result == "Go north" && goblinSlain == 1) {
                room = 3

            } else {
                println("I don't understand.")
            }
        } //Room 2 Logic End


        //Room 3 Logic Start
        else if (room == 3) {
            println("A grand ol Wizard rants on about hobbits and proceeds to give you an Apple. + 5 health.")
            health += 5

            print("> ") // shows a prompt symbol
            val result: String? = readLine()?.trim()
        }


    }
    println("Demo ended. Thanks for playing!")
}