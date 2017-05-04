#ifndef REFERENCE_H
#define REFERENCE_H

#include <QMainWindow>
#include <QPushButton>
#include "QProgressBar"
#include "QSlider"

namespace Ui {
class Reference;
}

class Reference : public QMainWindow {
    Q_OBJECT

public:
    explicit Reference(QWidget *parent = 0);
    ~Reference();

private:
    Ui::Reference *ui;
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

#endif // Reference_H
