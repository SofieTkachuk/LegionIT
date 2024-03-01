package lesson7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Game {
    public static void main(String[] args) {
        writeNumOfPlayersPerTeam(GameType.SOCCER);
        writeNumOfPlayersPerTeam(GameType.HOCKEY);
        writeNumOfPlayersPerTeam(GameType.RUGBY);
    }
        enum GameType {
            SOCCER,
            HOCKEY,
            RUGBY
        }

        // Method will check the type and create a new file with the name of the game as the name of the file
        public static void writeNumOfPlayersPerTeam(GameType game){
            String fileName = game.toString() + ".txt";

            File file = new File(fileName);
            try {
                file.createNewFile();

                FileWriter writer = new FileWriter(file);
                switch (game){
                    case SOCCER:
                        writer.write("Soccer: 11 players per team.");
                        break;
                    case HOCKEY:
                        writer.write("Hockey: 6 players per team.");
                        break;
                    case RUGBY:
                        writer.write("Rugby: 15 players per team.");
                        break;
                    default:
                        writer.write("Unknown game type.");
                        break;
                }
                writer.close();
                System.out.println("Data written to file: " + fileName);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
