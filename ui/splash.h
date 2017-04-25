#ifndef SPLASH_H
#define SPLASH_H

#include <QMainWindow>

namespace Ui {
class Splash;
}

class Splash : public QMainWindow
{
    Q_OBJECT

public:
    explicit Splash(QWidget *parent = 0);
    ~Splash();

private:
    Ui::Splash *ui;
};

#endif // SPLASH_H
