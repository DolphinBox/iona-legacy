#ifndef SPLASH_H
#define SPLASH_H

#include <QMainWindow>
#include <QPushButton>

namespace Ui {
class Splash;
}

<<<<<<< Updated upstream
class Splash : public QMainWindow {
=======
class Splash : public QMainWindow{
>>>>>>> Stashed changes
    Q_OBJECT

public:
    explicit Splash(QWidget *parent = 0);
    ~Splash();

private:
    Ui::Splash *ui;
    QPushButton *m_button;
signals:
public slots:
};

#endif // SPLASH_H
