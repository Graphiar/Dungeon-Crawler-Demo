fun main() {
    //Andrew Pettway Dungeon Crawler 0.5 - July 2025
    var room: Int = 1
    var hasSword = 0
    var health = 100
    var name = "Player"
    var damage = 0
    var help = "Commands: ver, health, damage, quit, debug"
    var version = 0.5
    var goblinSlain = 0
    var wizardTalk = 0
    //var stats = ("Name: $name , Damage: $damage, Health: $health")
    //Stats does not work as it is not updated. Apparently I can make it into a function which will solve it?
    //var Inventory = hasSword
    //Not occupied yet

    println("Welcome to Dungeon Crawler!")

    while (room == 1 || room == 2 || room == 3 || room == 4 || room  == 5) {
        //Room 1 Logic Start
        if (room == 1) {
            if (hasSword == 0) {
                println("You awaken in a small wooden house. An empty field is visible outside a window. A door is to your left. A sword is on the ground next to you.")
            } else if (hasSword == 1) {
                println("You awaken in a small wooden house. An empty field is visible outside a window. A door is to your left.")
            } else if (goblinSlain == 1 && hasSword == 1) {
                //Bug here
                println("You are in a small wooden house. An empty field is visible outside a window. A door is to your left.")
            }

            print("> ") //  shows a prompt symbol
            val result: String? = readLine()?.trim()?.lowercase()

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

            /*} else if (result == "stats") {
                println(stats)*/

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
            val result: String? = readLine()?.trim()?.lowercase()
            if (result == "Attack" && hasSword == 0) {
                println("Your fists are worth nothing. It easily overpowers you. The light begins to fade...")
                break
            } else if (result == "Attack" && hasSword == 1 && goblinSlain == 0) {
                health -= 5
                goblinSlain = 1
                println("You slash the Goblin into pieces. Lost 5 health. Current health: $health")
                println("Around you is a dark humid room filled with skulls and various body parts of unknown animals.")
                println("You see some sort of trap door on the floor.")

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

            /*} else if (result == "stats") {
                println(stats)*/

            } else if (result == "Go back") {
                room = 1

            } else if (result == "Open trap door" && goblinSlain == 1) {
                room = 3

            } else {
                println("I don't understand.")
            }
        } //Room 2 Logic End


        //Room 3 Logic Start
        else if (room == 3) {
            if (wizardTalk == 0) {
                println("You find a wizard chained to a wall. You set him loose with your sword. He rants on about hobbits and proceeds to give you an Apple. + 5 health.")
                println("He tells you how this game makes absolutely no sense and asks if you're on acid. You feel uncomfortable.")
                println("You see a a corridor to the west.")
                wizardTalk = 1
                health += 5
            } else if (wizardTalk == 1) {
                println("You see a corridor to the west.")
            }
            print("> ") // shows a prompt symbol
            val result: String? = readLine()?.trim()?.lowercase()

              if (result == "Go west") {
                   room = 4

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
                 room = 2

              } else {
                  println("I don't understand.")
              }

        } //Room 3 Logic End

          //Room 4 Logic Start
          else if (room == 4) {
              println("You are surrounded by dark knights lined up in rows. Suddenly they begin to rattle...")
              println("The knights surround you with swords of steel! You see a door with a chain on it to the north. Or maybe you could try fighting?")

            print("> ") // shows a prompt symbol
            val result: String? = readLine()?.trim()?.lowercase()

            if (result == "Attack") {
                println("Your blade ricochets off of the armor. The knight surround you, slashing your limbs until you bleed out. ")
                break
            } else if (result == "Go north") {
                room = 5
                println("You sprint towards the door as the knights follow. The chain looks weak. You might be able to cut it.")

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
                room = 3

            } else {
                println("I don't understand.")
            }



          } //Room 4 Logic End

           else if (room == 5) {

            print("> ") // shows a prompt symbol
            val result: String? = readLine()?.trim()?.lowercase()

            if (result == "Attack chain") {
                println("You cut the chain with your trusty sword and walk through the door. A narrow escape. You see something...")
                break

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
                room = 4

            } else {
                println("I don't understand.")
            }



           } //Room 5 Logic End





    }
    println("Demo ended. Thanks for playing!")
}