package com.example.etlap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.List;

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
    @FXML
    private ChoiceBox<Kategoria> kategoriaChoiceBox;
    @FXML
    private List<Kategoria> kategorias;
    @FXML
    private Adatbazis adatbazis;



    public void felvetelButton(ActionEvent actionEvent) {

    }

    public void torlesButton(ActionEvent actionEvent) {

    }
}