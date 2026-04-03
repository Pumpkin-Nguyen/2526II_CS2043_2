package player;

public class PlayerAdapter implements Player {
    @Override
    public void play(String name) {
        OldPlayer oldPlayer = new OldPlayer();
        oldPlayer.playFile(name);
    }
}
