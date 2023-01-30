module MusicPlayer {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires jid3lib;

    exports org.hubertpietrzak.musicPlayer.main to javafx.graphics;
    opens org.hubertpietrzak.musicPlayer.controller to javafx.fxml;
    opens org.hubertpietrzak.musicPlayer.mp3 to javafx.base;

}