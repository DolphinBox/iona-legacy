#include "splash.h"
#include "ui_splash.h"
#include "QPushButton"
#include "QWidget"

Splash::Splash(QWidget *parent) : QMainWindow(parent), ui(new Ui::Splash) {
    ui->setupUi(this);
    m_button = new QPushButton("Hello World", this);
    m_button->setGeometry(10, 10, 80, 30);
}

Splash::~Splash() {
    delete ui;
}
