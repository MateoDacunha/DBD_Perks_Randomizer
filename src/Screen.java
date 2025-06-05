import javax.swing.*;

public class Screen implements Runnable{
    JFrame frame;

    Screen(){
        
    }

    public static void demarrer() {
		Screen s = new Screen();
        SwingUtilities.invokeLater(s);
	}

    @Override
    public void run() {
        frame = new JFrame("DBD Perks Randomizer");
    }

}