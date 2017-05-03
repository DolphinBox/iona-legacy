#include "splash.h"
#include <QApplication>
#include <QPushButton>
#include "testwindow.h"

int main(int argc, char *argv[]) {
    QApplication a(argc, argv);
    //TestWindow tw;
    //tw.show();
    Splash w;
    w.show();

    return a.exec();
}
