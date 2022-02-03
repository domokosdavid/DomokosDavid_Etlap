package com.example.etlap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class EtlapController {
    @FXML
    private TableView<Etel> etelTableView;
    @FXML
    private TableColumn<Etel, String> columnNev, columnKategoria;
    @FXML
    private TableColumn<Etel, Integer> columnAr;
    @FXML
    private TextField textFieldKivalaszt;
    @FXML
    private Spinner<Integer> szazalekSP, forintSP;



    public void felvetelButton(ActionEvent actionEvent) {

    }

    public void torlesButton(ActionEvent actionEvent) {

    }
}