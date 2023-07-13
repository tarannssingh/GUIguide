import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GUI implements ActionListener{

    int counter = 0; 

    //To bring all of the J___ to scope (this will allow us to use them in all the methods in our GUI class)
    JFrame frame;
    JButton buttonPlayground;
    JButton buttonCannon;
    JLabel label;
    JPanel panel;

    //our method
    public GUI()
    {
        frame = new JFrame();

        buttonPlayground = new JButton("Playground Mode");
        buttonCannon = new JButton("Cannon Mode");
        buttonPlayground.addActionListener(this);
        buttonCannon.addActionListener(this);



        label = new JLabel("Numnber of Clicks: 0");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(buttonPlayground);
        panel.add(buttonCannon);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main (String[] args)
    {
        //makes the GUI
        new GUI();
    }

    //sort of like a signal
    @Override
    public void actionPerformed(ActionEvent e) {
        counter++;
        label.setText("Number of Clicks: " + counter); 

        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
