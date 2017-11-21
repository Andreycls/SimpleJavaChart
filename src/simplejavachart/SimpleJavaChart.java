/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simplejavachart;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
 
public class SimpleJavaChart extends Application {
    public String Pilihan1 = "Pilihan1";
    public String Pilihan2 = "Pilihan2";
    public String Pilihan3 = "Pilihan3";
    public String Pilihan4 = "Pilihan4";
    public String Pilihan5 = "Pilihan5";
 
    @Override public void start(Stage stage) {
        stage.setTitle("Grafik Kalkulasi Statistik Data Penduduk");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc = 
            new BarChart<>(xAxis,yAxis);
        bc.setTitle("Grafik Kalkulasi Statistik Data Penduduk");
        xAxis.setLabel("Pilihan");       
        yAxis.setLabel("Jumlah");
        
        //Data Pilihan 1
        XYChart.Series Kategori1 = new XYChart.Series();
        Kategori1.setName("2003");       
        Kategori1.getData().add(new XYChart.Data(Pilihan1, 4));
        Kategori1.getData().add(new XYChart.Data(Pilihan2,  2));
        Kategori1.getData().add(new XYChart.Data(Pilihan3,  1));
        Kategori1.getData().add(new XYChart.Data(Pilihan4,   3));
        Kategori1.getData().add(new XYChart.Data(Pilihan5,    9));      
        
        
        //Data Pilihan 2
        XYChart.Series Kategori2 = new XYChart.Series();
        Kategori2.setName("2004");
        Kategori2.getData().add(new XYChart.Data(Pilihan1, 5));
        Kategori2.getData().add(new XYChart.Data(Pilihan2, 4));
        Kategori2.getData().add(new XYChart.Data(Pilihan3, 4));
        Kategori2.getData().add(new XYChart.Data(Pilihan4, 1));
        Kategori2.getData().add(new XYChart.Data(Pilihan5, 1));  
        
        
        //Data Pilihan 3
         XYChart.Series Kategori3 = new XYChart.Series();
        Kategori3.setName("2005");
        Kategori3.getData().add(new XYChart.Data(Pilihan1, 4));
        Kategori3.getData().add(new XYChart.Data(Pilihan2, 4));
        Kategori3.getData().add(new XYChart.Data(Pilihan3, 1));
        Kategori3.getData().add(new XYChart.Data(Pilihan4, 1));
        Kategori3.getData().add(new XYChart.Data(Pilihan5, 9));  
        
        //Data Pilihan 4
        XYChart.Series Kategori4 = new XYChart.Series();
        Kategori4.setName("2006");
        Kategori4.getData().add(new XYChart.Data(Pilihan1, 4));
        Kategori4.getData().add(new XYChart.Data(Pilihan2, 4));
        Kategori4.getData().add(new XYChart.Data(Pilihan3, 1));
        Kategori4.getData().add(new XYChart.Data(Pilihan4, 1));
        Kategori4.getData().add(new XYChart.Data(Pilihan5, 9));  
        
        // ini untuk Ukuran Layar
        Scene scene  = new Scene(bc,800,600);
        // Barchart mengambil data dari XYChart
        bc.getData().addAll(Kategori1, Kategori2, Kategori3, Kategori4);
        // menSet Scene
        stage.setScene(scene);
        //Menampilkan Scene
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}