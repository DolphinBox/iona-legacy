#include "splash.h"
#include "ui_splash.h"
#include "QPushButton"

Splash::Splash(QWidget *parent) : QMainWindow(parent), ui(new Ui::Splash) {
    ui->setupUi(this);
}

Splash::~Splash() {
    delete ui;
}
