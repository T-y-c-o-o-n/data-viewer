import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ControlPanel extends JPanel {
    private JTextField filePath;
    private JTextField pythonPath;

    public ControlPanel(ActionListener dataShower) {
        setBackground(Color.gray);

        filePath = new JTextField("введите путь до файла");
        pythonPath = new JTextField("введите путь до интерпретатора");


        JButton findButton = new JButton(new ImageIcon("images/get_data.png"));
        findButton.setActionCommand("get_data");
        findButton.addActionListener(dataShower);

        JButton leftButton = new JButton("влево");
        leftButton.setActionCommand("left");
        leftButton.addActionListener(dataShower);

        JButton rightButton = new JButton("вправо");
        rightButton.setActionCommand("right");
        rightButton.addActionListener(dataShower);

        JButton upButton = new JButton("вверх");
        upButton.setActionCommand("up");
        upButton.addActionListener(dataShower);

        JButton downButton = new JButton("вниз");
        downButton.setActionCommand("down");
        downButton.addActionListener(dataShower);

        add(filePath);
        add(findButton);
        add(pythonPath);
        add(rightButton);
        add(leftButton);
        add(upButton);
        add(downButton);
    }

    public JTextField getPythonPath() {
        return pythonPath;
    }

    public JTextField getFilePath() {
        return filePath;
    }
}
