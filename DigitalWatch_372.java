import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalWatch_372 {

    private JFrame frame;
    private JLabel timeLabel;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                DigitalWatch_372 window = new DigitalWatch_372();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public DigitalWatch_372() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Digital Watch");
        frame.setBounds(100, 100, 300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());

        timeLabel = new JLabel("", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Digital-7", Font.PLAIN, 48));
        frame.getContentPane().add(timeLabel, BorderLayout.CENTER);

        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateTime();
            }
        });
        timer.start();
    }

    private void updateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String timeString = sdf.format(new Date());
        timeLabel.setText(timeString);
    }
}
