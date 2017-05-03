#ifndef TESTWINDOW_H
#define TESTWINDOW_H
#include <QWidget>
class QPushButton; class TestWindow : public QWidget {

public:
 explicit TestWindow(QWidget *parent = 0);
private:
QPushButton *m_button;
};

#endif // TESTWINDOW_H
