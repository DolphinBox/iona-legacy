#include "splash.h"
#include <QApplication>
#include <QPushButton>
#include "testwindow.h"
#include <QProgressBar>
#include <QSlider>

int main(int argc, char *argv[]) {
    QApplication a(argc, argv);
    Splash w;
    w.show();

    return a.exec();
}
