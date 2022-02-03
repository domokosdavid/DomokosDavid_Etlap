package com.example.etlap;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;
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

    public void init() throws SQLException {
        columnNev.setCellValueFactory(new PropertyValueFactory<>("nev"));
        columnAr.setCellValueFactory(new PropertyValueFactory<>("ar"));
        columnKategoria.setCellValueFactory(new PropertyValueFactory<>("kategoria"));

        try {
            adatbazis = new Adatbazis();
            try {
                List<Etel> etelList = adatbazis.getEtelek();
                etelTableView.getItems().clear();
                for (Etel item : etelList) {
                    etelTableView.getItems().add(item);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        kategorias = adatbazis.getKategoria();
        kategorias.add(0, new Kategoria("Nincs rendezve", 0));
        ObservableList<Kategoria> kategoriaList = FXCollections.observableArrayList(kategorias);
        kategoriaChoiceBox.setItems(kategoriaList);
        kategoriaChoiceBox.getSelectionModel().selectFirst();

        etelTableView.setRowFactory(etelTableView1 -> {
            TableRow<Etel> sor = new TableRow<>();
            sor.setOnMouseClicked(mouseEvent -> {
                Etel etel = etelTableView.getSelectionModel().getSelectedItem();
                String tablazatba = etel.getNev()+" - "+etel.getKategoria()+" - "+etel.getLeiras()+" - "+etel.getAr()+" Ft";
                textFieldKivalaszt.setText(tablazatba);
            });
            return sor;
        });





    }

    public void felvetelButton(ActionEvent actionEvent) {

    }

    public void torlesButton(ActionEvent actionEvent) {

    }

}

