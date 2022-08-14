package reto_5;

import reto_5.view.InformesView;

public class App 
{
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformesView().setVisible(true);
            }
        });
    }
}
