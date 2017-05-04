#ifndef SPLASH_H
#define SPLASH_H

#include <QMainWindow>
#include <QPushButton>
#include "QProgressBar"
#include "QSlider"

namespace Ui {
class Splash;
}

class Splash : public QMainWindow {
    Q_OBJECT

public:
    explicit Splash(QWidget *parent = 0);
    ~Splash();

private:
    Ui::Splash *ui;
    QPushButton *m_button;
    QProgressBar *progressBar;
    QSlider *slider;
    int m_counter;
signals:
    void counterReached();
private slots:
    void slotButtonClicked(bool checked);
public slots:
};

#endif // SPLASH_H
