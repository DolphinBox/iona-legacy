#include "splash.h"
#include "ui_splash.h"
#include "QPushButton"
#include "QWidget"
#include "QProgressBar"
#include "QSlider"

Splash::Splash(QWidget *parent) : QMainWindow(parent), ui(new Ui::Splash) {
    ui->setupUi(this);
    m_button = new QPushButton("click me ;}}", this);
    m_button->setGeometry(10, 10, 80, 30);
    connect(m_button, SIGNAL (clicked()), QApplication::instance(), SLOT (quit()));
    progressBar = new QProgressBar(this);
    progressBar->setRange(0, 100);
    progressBar->setValue(0);
    progressBar->setGeometry(100, 10, 180, 30);
    // Create a horizontal slider
    // with the range between 0 and 100, and a starting value of 0
    slider = new QSlider(this);
    slider->setOrientation(Qt::Horizontal);
    slider->setRange(0, 100);
    slider->setValue(0);
    slider->setGeometry(10, 40, 180, 30);
    // Connection
    // This connection set the value of the progress bar
    // while the slider's value changes
    connect(slider, SIGNAL (valueChanged(int)), progressBar, SLOT (setValue(int)));
}

Splash::~Splash() {
    delete ui;
}
