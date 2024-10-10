import java.util.Scanner;

public class GettingInputs {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int Year;
        String Genre, Album, Title, Artist;

        System.out.print("Enter the year: ");
        Year = myObj.nextInt();
        myObj.nextLine();
        System.out.print("Enter the genre: ");
        Genre = myObj.nextLine();
        System.out.print("Enter the album: ");
        Album = myObj.nextLine();
        System.out.print("Enter the song title: ");
        Title = myObj.nextLine();
        System.out.print("Enter the artist: ");
        Artist = myObj.nextLine();

        System.out.println("--------------------------");
        System.out.println("SONG DETAILS");
        System.out.println("--------------------------");
        System.out.println("Year Released: " + Year);
        System.out.println("Genre: " + Genre);
        System.out.println("Album: " + Album);
        System.out.println("Title: " + "\"" + Title + "\"");
        System.out.println("Artist: " + Artist);

        myObj.close();
    }
}