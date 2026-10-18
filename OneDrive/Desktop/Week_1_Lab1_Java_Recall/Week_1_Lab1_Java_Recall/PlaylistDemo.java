/**
 * PlaylistDemo.java
 * Driver program to test the Track class.
 *
 * Name: Sudenaz Çakır
 * Student ID: 230446030
 * Date: 2026-10-18
 */
public class PlaylistDemo {
    public static void main(String[] args) {
        System.out.println("=== Playlist Track Demo ===\n");

        System.out.println("Default Track:");
        Track defaultTrack = new Track();
        System.out.println(defaultTrack);
        System.out.println();

        System.out.println("Title-only track:");
        Track titleOnlyTrack = new Track("Neon Lights");
        System.out.println(titleOnlyTrack);
        System.out.println();

        System.out.println("Title + Artist Track:");
        Track titleArtistTrack = new Track("Ocean Drive", "Midnight Pulse");
        System.out.println(titleArtistTrack);
        System.out.println();

        System.out.println("Full Track (non-explicit):");
        Track fullTrack = new Track("Raindrop Waltz", "Clara Voss", 210, false);
        System.out.println(fullTrack);
        System.out.println();

        System.out.println("Invalid Duration Test:");
        Track invalidTrack = new Track("Broken Clock", "Static Noise", -25, false);
        System.out.println(invalidTrack);
        System.out.println();

        System.out.println("Getter Test:");
        Track getterTrack = new Track("Stardust", "Stellar Echo", 242, true);
        System.out.printf("Title:     %s%n", getterTrack.getTitle());
        System.out.printf("Artist:    %s%n", getterTrack.getArtist());
        System.out.printf("Duration:  %s%n", getterTrack.getDurationFormatted());
        System.out.printf("Explicit:  %s%n", getterTrack.isExplicit());
    }
}
