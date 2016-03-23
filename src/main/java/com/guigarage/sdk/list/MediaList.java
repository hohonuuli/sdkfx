package com.guigarage.sdk.list;

import com.guigarage.sdk.util.Media;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class MediaList<T extends Media> extends ListView<T> {

    public MediaList() {
        setCellFactory(SimpleMediaListCell.createDefaultCallback());
    }

    public MediaList(ObservableList<T> items) {
        super(items);
        setCellFactory(SimpleMediaListCell.createDefaultCallback());
    }
}
