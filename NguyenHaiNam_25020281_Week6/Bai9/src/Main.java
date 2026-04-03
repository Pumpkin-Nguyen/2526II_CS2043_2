public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        VideoPlayer videoPlayer = new VideoPlayer();

        MediaPlayer mediaPlayer = new MediaPlayer(audioPlayer, videoPlayer);

        mediaPlayer.playAudio("song.mp3");
        mediaPlayer.playVideo("film.mp4");
    }
}
