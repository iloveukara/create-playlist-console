import java.util.*;
import java.util.LinkedList;

public class PlaylistManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> song = new LinkedList<>();
        LinkedList<String> artist = new LinkedList<>();
        LinkedList<String> playlist = new LinkedList<>();

        while (true) {
            System.out.println("Welcome to Playlist Manager!");
            System.out.println("1. Add a Song");
            System.out.println("2. Add an Artist");
            System.out.println("3. Create Playlist");
            System.out.println("4. Display Playlist");
            System.out.println("5. Exit");

            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // idk why pero gumana sya after ko lagyan netu

            switch (choice) {
                case 1:
                    System.out.println("Enter the song title: ");
                    String songName = scanner.nextLine();
                    scanner.nextLine();
                    song.add(songName);
                    break;

                case 2:
                    System.out.println("Enter the artist name: ");
                    String artistName = scanner.nextLine();
                    scanner.nextLine();
                    artist.add(artistName);
                    break;

                case 3:
                    if (song.size() == artist.size()) {
                        for (int i = 0; i < song.size(); i++) {
                            String result = song.get(i) + " by " + artist.get(i);
                            playlist.add(result);
                        }
                        System.out.println("Playlist Created! ");
                    } else {
                        System.out.println("Add an equal number of songs and artists. ");
                    }
                    break;

                case 4:
                    System.out.println("Playlist: ");
                    System.out.println("Songs: " + song);
                    System.out.println("Artists: " + artist);
                    for (String element : playlist) {
                        System.out.println(element);
                    }
                    break;

                case 5:
                    System.out.println("Exiting Playlist Manager: ");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid input. ");
            }
        }

    }

}