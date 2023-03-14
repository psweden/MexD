package mac;



import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Image;



// A canvas that illustrates drawing on an Image
public class HelpInfo extends Canvas {


    public void paint(Graphics g) {
        int width = getWidth();
        int height = getHeight();


        // Create an Image the same size as the
        // Canvas.
        Image image = Image.createImage(width, height);
        Graphics imageGraphics = image.getGraphics();

        // Fill the background of the image black
        imageGraphics.setColor(0x000000);
        imageGraphics.fillRect(0, 0, width, height);

        // Draw a pattern of lines
        int count = 10;
        int yIncrement = height/count;
        int xIncrement = width/count;
        /*for (int i = 0, x = xIncrement, y = 0; i < count; i++) {
            imageGraphics.setColor(0xC0 + ((128 + 10 * i) << 8) + ((128 + 10 * i) << 16));
            imageGraphics.drawLine(0, y, x, height);
            y += yIncrement;
            x += xIncrement;
        }*/

        // Add some text
        imageGraphics.setFont(Font.getFont(Font.FACE_PROPORTIONAL, 0,Font.SIZE_SMALL));
        imageGraphics.setColor(0xffff00);
        imageGraphics.drawString("Mobile Extension", width/2, 15, Graphics.TOP | Graphics.HCENTER);
        imageGraphics.drawString("Direct ver 1.0", width/2, 30, Graphics.TOP | Graphics.HCENTER);

        imageGraphics.setColor(0xffff00);

        imageGraphics.drawString("För support", width/2, 50, Graphics.TOP | Graphics.HCENTER);

        imageGraphics.drawString("Kontakta oss", width/2, 65, Graphics.TOP | Graphics.HCENTER);

        imageGraphics.setColor(0xffffff);

        imageGraphics.drawString("MDS Sweden AB", width/2, 85, Graphics.TOP | Graphics.HCENTER);
        imageGraphics.drawString("www.sweden-software.se", width/2, 110, Graphics.TOP | Graphics.HCENTER);
        imageGraphics.drawString("support@sweden-software.se", width/2, 130, Graphics.TOP | Graphics.HCENTER);

        // Copy the Image to the screen
        g.drawImage(image, 0, 0, Graphics.TOP | Graphics.LEFT);



    }



}
