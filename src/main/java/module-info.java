module uzielduarte.conversionfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens uzielduarte.conversionfx to javafx.fxml;
    exports uzielduarte.conversionfx;
    exports uzielduarte.controller;
}
