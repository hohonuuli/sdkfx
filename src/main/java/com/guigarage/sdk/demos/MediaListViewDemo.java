package com.guigarage.sdk.demos;

import com.guigarage.sdk.list.MediaList;
import com.guigarage.sdk.util.Media;
import javafx.application.Application;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
//import javafx.scene.control.SelectionMode;

public class MediaListViewDemo extends Application {

    public static final ObservableList names =
            FXCollections.observableArrayList();
    public static final ObservableList<Media> data =
            FXCollections.observableArrayList();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("List View Sample");

        final ListView<Media> listView = new ListView<>(data);
        listView.setPrefSize(200, 250);
        listView.setEditable(true);

        names.addAll(
                "Adam", "Alex", "Alfred", "Albert",
                "Brenda", "Connie", "Derek", "Donny",
                "Lynne", "Myrtle", "Rose", "Rudolph",
                "Tony", "Trudy", "Williams", "Zach"
        );

        for (int i = 0; i < 18; i++) {
            data.add(new NameMedia("anonym"));
        }

        listView.setItems(data);
        //listView.setCellFactory(ComboBoxListCell.forListView(names));
        listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        StackPane root = new StackPane();
        root.getChildren().add(listView);
        primaryStage.setScene(new Scene(root, 200, 250));
        primaryStage.show();
    }
}

class NameMedia implements Media {

    private StringProperty title = new SimpleStringProperty();

    private StringProperty description = new SimpleStringProperty();

    private ObjectProperty<Image> image = new SimpleObjectProperty<>();

    NameMedia(String name) {
        titleProperty().set(name);
    }

    @Override
    public StringProperty descriptionProperty() {
        return description;
    }

    @Override
    public StringProperty titleProperty() {
        return title;
    }

    @Override
    public ObjectProperty<Image> imageProperty() {
        return image;
    }

}