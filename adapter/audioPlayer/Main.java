// Client
public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new AudioAdapter(new LegacyAudioPlayer());
        player.playMP3("song.mp3"); // Client uses standard interface
    }
}