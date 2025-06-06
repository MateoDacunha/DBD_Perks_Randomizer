package View;
import javax.swing.*;

public class Window implements Runnable{
    JFrame frame;

    Window(){
        
    }

    public static void demarrer() {
		Window s = new Window();
        SwingUtilities.invokeLater(s);
	}

    @Override
    public void run() {
        frame = new JFrame("DBD Perks Randomizer");
        frame.add(new Screen());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.setResizable(false);
		frame.setVisible(true);

    }

}