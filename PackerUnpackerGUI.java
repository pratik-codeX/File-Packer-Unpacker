import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import MarvellousPackerUnpacker.MarvellousPacker;

public class PackerUnpackerGUI extends JFrame {
    JTextField dirField, fileField;
    JTextArea outputArea;

    public PackerUnpackerGUI() {
        setTitle("Marvellous Packer Utility");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Top Panel for inputs
        JPanel topPanel = new JPanel(new GridLayout(3, 1));

        // Directory Panel
        JPanel dirPanel = new JPanel();
        dirPanel.add(new JLabel("Directory to Pack: "));
        dirField = new JTextField(25);
        dirPanel.add(dirField);
        JButton browseBtn = new JButton("Browse");
        dirPanel.add(browseBtn);
        topPanel.add(dirPanel);

        // File name panel
        JPanel filePanel = new JPanel();
        filePanel.add(new JLabel("Pack File Name: "));
        fileField = new JTextField(20);
        filePanel.add(fileField);
        topPanel.add(filePanel);

        // Button panel
        JPanel buttonPanel = new JPanel();
        JButton packBtn = new JButton("PACK");
        buttonPanel.add(packBtn);
        topPanel.add(buttonPanel);

        add(topPanel, BorderLayout.NORTH);

        // Output Area
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(outputArea);
        add(scroll, BorderLayout.CENTER);

        // Action listeners
        browseBtn.addActionListener(e -> chooseDirectory());
        packBtn.addActionListener(e -> packFiles());

        setVisible(true);
    }

    private void chooseDirectory() {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int ret = chooser.showOpenDialog(this);
        if (ret == JFileChooser.APPROVE_OPTION) {
            File selectedDir = chooser.getSelectedFile();
            dirField.setText(selectedDir.getAbsolutePath());
        }
    }

    private void packFiles() {
        String dir = dirField.getText();
        String filename = fileField.getText();

        if (dir.isEmpty() || filename.isEmpty()) {
            outputArea.setText("Please fill all fields.");
            return;
        }

        try {
            MarvellousPacker mobj = new MarvellousPacker(filename, dir);
            mobj.PackingActivity();
            outputArea.setText("Packing done successfully.\nPacked file: " + filename);
        } catch (Exception ex) {
            outputArea.setText("Error during packing: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new PackerUnpackerGUI();
    }
}
