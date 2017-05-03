#include "splash.h"
#include "ui_splash.h"
#include "QPushButton"
#include "QWidget"
#include "QProgressBar"
#include "QSlider"

Splash::Splash(QWidget *parent) : QMainWindow(parent), ui(new Ui::Splash) {
    ui->setupUi(this);
    m_button = new QPushButton("click me ;]", this);

    m_button->setGeometry(10, 10, 80, 30);
    m_button->setCheckable(true);
    m_counter = 0;  //resets the click counter
    connect(m_button, SIGNAL (clicked(bool)), this, SLOT (slotButtonClicked(bool))); //connect function for changing text on click
    connect(this, SIGNAL (counterReached()), QApplication::instance(), SLOT (quit()));
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

    QButtonGroup *buttonGroup = new QButtonGroup(this);
    buttonGroup->addButton(m_button);
    // Connection
    // This connection set the value of the progress bar
    // while the slider's value changes
    connect(slider, SIGNAL (valueChanged(int)), progressBar, SLOT (setValue(int)));
}


//Slot implementation
void Splash::slotButtonClicked(bool checked) {
    //checked represents whether or not the button is in a clicked "checked" position
    if (checked) {
        m_button->setText("Checked");
    }
    else {
        m_button->setText("Hello World");
    }
    m_counter++;
    if(m_counter == 10) {
        emit counterReached(); //Emits the signal
    }
}

Splash::~Splash() {
    delete ui;
}
