#include "splash.h"
#include "reference.h"
#include <QApplication>
#include <QtQml>
#include <QPushButton>
#include <QProgressBar>
#include <QSlider>
#include <QQuickStyle>

int main(int argc, char *argv[]) {

    QQuickStyle::setStyle("Material");

    QApplication a(argc, argv);
    Reference w;
    w.show();

    return a.exec();
}
