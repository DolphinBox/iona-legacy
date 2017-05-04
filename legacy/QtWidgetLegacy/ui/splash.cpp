#include "splash.h"
#include "ui_splash.h"
#include "QPushButton"
#include "QWidget"
#include "QProgressBar"
#include "QSlider"

Splash::Splash(QWidget *parent) : QMainWindow(parent), ui(new Ui::Splash) {
    ui->setupUi(this);

}

Splash::~Splash() {
    delete ui;
}
