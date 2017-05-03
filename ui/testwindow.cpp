#include "testwindow.h"

TestWindow::TestWindow(QWidget *parent) :
    QWidget(parent) {
    setFixedSize(100, 50);
    // Create and position the button
    m_button = new QPushButton("Hello World", this);
    m_button->setGeometry(10, 10, 80, 30);
}
