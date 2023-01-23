module MusicPlayer {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports org.hubertpietrzak.musicPlayer.main to javafx.graphics;
    opens org.hubertpietrzak.musicPlayer.controller to javafx.fxml;

}