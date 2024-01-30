package Menus;

import javax.swing.*;

public class MenuPrueba {
    private JPanel VentanaPrin;
    private JMenu FileMenu;
    private JMenu EditMenu;
    private JMenu ViewMenu;
    private JMenu NavigateMenu;
    private JMenu CodeMenu;
    private JMenu RefactorMenu;
    private JMenu BuildMenu;
    private JMenu RunMenu;
    private JMenu ToolsMenu;
    private JMenu GitMenu;
    private JMenu WindowMenu;
    private JMenu HelpMenu;
    private JMenuItem NewMenuItem;
    private JMenuItem OpenMenuItem;
    private JMenuItem OpenRecentMenuItem;
    private JMenuItem CloseProjectMenuItem;
    private JMenuItem UndoMenuItem;
    private JMenuItem RedoMenuItem;
    private JMenuItem CutMenuItem;
    private JMenuItem CopyMenuItem;
    private JMenuItem CopyPathMenuItem;
    private JMenuItem DeleteMenuItem;
    private JMenuItem ComitMenuItem;
    private JMenuItem PushMenuItem;
    private JMenuItem UpdateProjectMenuItem;
    private JPanel PanelMenu;


    public static void main(String[] args) {
        JFrame frame = new JFrame("MenuPrueba");
        frame.setContentPane(new MenuPrueba().VentanaPrin);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,650,350);
        frame.setVisible(true);
    }
}
