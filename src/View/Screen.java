package View;
import javax.swing.*;
import java.awt.*;


public class Screen extends JComponent{
    int width,height,screenRes;

    public Screen(){
        screenRes = Toolkit.getDefaultToolkit().getScreenResolution();
    }

    @Override
    public void paintComponent(Graphics g){
        Graphics2D drawable = (Graphics2D) g;

        width = getSize().width;
		height = getSize().height;

        mainMenu(drawable);
        
    }


    private void mainMenu(Graphics2D drawable){

        System.err.println("Entering mainMenu");

        drawable.drawRect((int)(width*0.2),(int)(height*0.45),(int)(width*0.25),(int)(height*0.1));
        drawable.drawRect((int)(width*0.55),(int)(height*0.45),(int)(width*0.25),(int)(height*0.1));

        int fontSize = (int)Math.round(18.0 * screenRes / 72.0);
        drawable.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));

        drawable.drawString("Survivor",(int)(width*0.29),(int)(height*0.51));
        drawable.drawString("Killer",(int)(width*0.65),(int)(height*0.51));

    }
    
}
