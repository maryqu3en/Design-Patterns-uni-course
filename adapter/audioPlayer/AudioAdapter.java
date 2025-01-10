// Adapter that bridges the gap
public class AudioAdapter implements MediaPlayer {
    private LegacyAudioPlayer legacyPlayer;

    public AudioAdapter(LegacyAudioPlayer legacyPlayer) {
        this.legacyPlayer = legacyPlayer;
    }

    @Override
    public void playMP3(String filename) {
        legacyPlayer.playAudioFile(filename); // Translate request
    }
}