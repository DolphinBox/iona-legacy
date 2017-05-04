/********************************************************************************
** Form generated from reading UI file 'splash.ui'
**
** Created by: Qt User Interface Compiler version 5.8.0
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_SPLASH_H
#define UI_SPLASH_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QMainWindow>
#include <QtWidgets/QMenuBar>
#include <QtWidgets/QStatusBar>
#include <QtWidgets/QToolBar>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_Splash
{
public:
    QMenuBar *menuBar;
    QToolBar *mainToolBar;
    QWidget *centralWidget;
    QStatusBar *statusBar;

    void setupUi(QMainWindow *Splash)
    {
        if (Splash->objectName().isEmpty())
            Splash->setObjectName(QStringLiteral("Splash"));
        Splash->resize(400, 300);
        menuBar = new QMenuBar(Splash);
        menuBar->setObjectName(QStringLiteral("menuBar"));
        Splash->setMenuBar(menuBar);
        mainToolBar = new QToolBar(Splash);
        mainToolBar->setObjectName(QStringLiteral("mainToolBar"));
        Splash->addToolBar(mainToolBar);
        centralWidget = new QWidget(Splash);
        centralWidget->setObjectName(QStringLiteral("centralWidget"));
        Splash->setCentralWidget(centralWidget);
        statusBar = new QStatusBar(Splash);
        statusBar->setObjectName(QStringLiteral("statusBar"));
        Splash->setStatusBar(statusBar);

        retranslateUi(Splash);

        QMetaObject::connectSlotsByName(Splash);
    } // setupUi

    void retranslateUi(QMainWindow *Splash)
    {
        Splash->setWindowTitle(QApplication::translate("Splash", "Splash", Q_NULLPTR));
    } // retranslateUi

};

namespace Ui {
    class Splash: public Ui_Splash {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_SPLASH_H
