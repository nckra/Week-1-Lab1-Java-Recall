/**
 * Track.java
 * Represents a single music track in a streaming playlist.
 *
 * Your Name: Sudenaz Çakır
 * Your Student ID: 230446030
 * Your Date: 2026-10-18
 */
public class Track {
    private String title;
    private String artist;
    private int durationSeconds;
    private boolean isExplicit;

    /** Full constructor. Invalid durations are replaced with zero. */
    public Track(String title, String artist, int durationSeconds, boolean isExplicit) {
        this.title = title;
        this.artist = artist;
        if (durationSeconds < 0) {
            System.out.println("Warning: Invalid duration. Setting to 0.");
            this.durationSeconds = 0;
        } else {
            this.durationSeconds = durationSeconds;
        }
        this.isExplicit = isExplicit;
    }

    /** Creates a track with a title and artist, but no duration or explicit content. */
    public Track(String title, String artist) {
        this(title, artist, 0, false);
    }

    /** Creates a track with only a title. */
    public Track(String title) {
        this(title, "Unknown Artist", 0, false);
    }

    /** Creates a track with default values. */
    public Track() {
        this("Unknown Title", "Unknown Artist", 0, false);
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public boolean isExplicit() {
        return isExplicit;
    }

    /** Returns the duration as minutes:two-digit-seconds (for example, 3:05). */
    public String getDurationFormatted() {
        int minutes = durationSeconds / 60;
        int seconds = durationSeconds % 60;
        return String.format("%d:%02d", minutes, seconds);
    }

    @Override
    public String toString() {
        String summary = "\"" + title + "\" by " + artist + " [" + getDurationFormatted() + "]";
        return isExplicit ? summary + " [EXPLICIT]" : summary;
    }
}
