#include "splash.h"
#include <QApplication>
#include <QPushButton>

int main(int argc, char *argv[]) {
    QApplication a(argc, argv);
    QWidget window;
    window.setFixedSize(300, 50);
    QPushButton *button = new QPushButton("Hello World", &window);
    button->setGeometry(10, 10, 80, 30);
    window.show();
    //Splash w;
    //w.show();

    return a.exec();
}
