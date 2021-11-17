module com.example.amazonproducctreview {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.amazonproducctreview to javafx.fxml;
    exports com.example.amazonproducctreview;
}