import java.util.LinkedList;
import java.util.*;

public class eme {
    public static void main(String[] args) {
        LinkedList<String> songs = new LinkedList();
        LinkedList<String> artists = new LinkedList();
        LinkedList<String> playlist = new LinkedList();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to Playlist Manager!");
            System.out.println("1. Add a Song: ");
            System.out.println("2. Add an Artist: ");
            System.out.println("3. Create Playlist: ");
            System.out.println("4. Display Playlist: ");
            System.out.println("5. Exit: ");
            System.out.print("Enter your choice: ");
            int iChoice = scanner.nextInt();
            scanner.nextLine();
            if (iChoice == 1) {
                System.out.print("Enter a Song: ");
                String song = scanner.nextLine();
                songs.add(song);
            } else if (iChoice == 2) {
                System.out.print("Enter an Artist: ");
                String artist = scanner.nextLine();
                artists.add(artist);
            } else if (iChoice == 3) {
                if (songs.size() == artists.size()) {
                    for (int i = 0; i < songs.size(); i++) {
                        String playlistEntry = songs.get(i) + " by " + artists.get(i);
                        playlist.add(playlistEntry);
                    }
                    System.out.println(" >>>>>>>Playlist Created!<<<<<<< ");
                } else {
                    System.out.println("Please make sure you have added an equal number of songs and artists.");
                }
            } else if (iChoice == 4) {
                System.out.println(" >>>>Playlist<<<< ");
                System.out.println("Songs: " + songs);
                System.out.println("Artists: " + artists);
                for (String entry : playlist) {
                    System.out.println(entry);
                }
            } else if (iChoice == 5) {
                System.out.println(" >>>>Thank you!<<<< ");
                scanner.close();
                System.exit(0);
            } else {
                System.out.println("You did not enter a valid number: ");
            }
        }
    }
}
