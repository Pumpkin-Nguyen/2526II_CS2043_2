public class MediaPlayer {
    private AudioPlayer audioPlayer;
    private VideoPlayer videoPlayer;

    public MediaPlayer(AudioPlayer audio, VideoPlayer video) {
        this.audioPlayer = audio;
        this.videoPlayer = video;
    }

    public void playAudio(String file) {
        audioPlayer.playAudio(file);
    }

    public void playVideo(String video) {
        videoPlayer.playVideo(video);
    }
}
