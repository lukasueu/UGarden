/*
Solution of “UGarden Problem” - PlantMainSwing.java
—————————————————————————————————————————————
Created by
Indriani Noor Hapsari
Information Systems Undergraduate Program Universitas Esa Unggul
—————————————————————————————————————————————
UGarden GUI Driver
Note: locate Plant.java, PlantMainSwing.java, and img (image files
folder) in one folder
How to compile and run:
>> javac Plant.java PlantMainSwing.java
>> java PlantMainSwing
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Thread;

public class PlantMainSwing {

    private JFrame frame;
    private JLabel label;
    private JButton btnBeriAir;
    private JButton btnBeriPupuk;
    private JTextField txtDisplay;
    private ImageIcon plantIcon;

    private Plant p;

    public PlantMainSwing() {
        p = new Plant();
        createAndShowGUI();
        setPlantImage();
    }
    private void createAndShowGUI() {
        frame = new JFrame("WELCOME TO UGARDEN");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        //Add label
        label = new JLabel(""); frame.getContentPane().add(label);

        //Add button
        btnBeriAir = new JButton("Beri Air");
        btnBeriPupuk = new JButton("Beri Pupuk");
        frame.getContentPane().add(btnBeriAir);
        frame.getContentPane().add(btnBeriPupuk);

        //Add text
        txtDisplay = new JTextField("hasilnya");
        frame.getContentPane().add(txtDisplay);

        //Add action listener
        btnBeriAir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                btnBeriAir_actionPerformed(e);
            }
        });
        btnBeriPupuk.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                btnBeriPupuk_actionPerformed(e);
            }
        });
        //Display the window
        frame.setSize(500,300);
        frame.setVisible(true);
    }

    private void btnBeriAir_actionPerformed(ActionEvent e) {
        System.out.println("beri air");
        p.beriAir();
        txtDisplay.setText(p.getStatusTumbuhText());
        setPlantImage();
    }

    private void btnBeriPupuk_actionPerformed(ActionEvent e) {
        System.out.println("beri pupuk");
        p.beriPupuk();
        txtDisplay.setText(p.getStatusTumbuhText());
        setPlantImage();
    }

    protected ImageIcon createImageIcon(String path, String description) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    private void setPlantImage() {
        plantIcon = createImageIcon(p.getImagePath(), p.getStatusTumbuhText());

        label.setIcon(plantIcon);
    }

    public static void main(String[] args)
    {
        Runnable(){
            javax.swing.SwingUtilities.invokeLater(new
    
            public void run() {
                PlantMainSwing uGardenApp = new
                PlantMainSwing();
            }
        });
    }
}
