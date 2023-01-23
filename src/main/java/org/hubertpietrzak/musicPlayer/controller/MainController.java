package org.hubertpietrzak.musicPlayer.controller;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;

public class MainController {

    @FXML
    private MenuItem aboutMenultem;

    @FXML
    private MenuItem closeMenultem;

    @FXML
    private TableView<?> contentTable;

    @FXML
    private MenuItem dirMenultem;

    @FXML
    private MenuItem fileMenultem;

    @FXML
    private Button nextButton;

    @FXML
    private ToggleButton playButton;

    @FXML
    private Button previousButton;

    @FXML
    private Slider progressSlider;

    @FXML
    private Slider volumeSlider;

    public void initialize() {
        System.out.println("MainController created");
    }

}
