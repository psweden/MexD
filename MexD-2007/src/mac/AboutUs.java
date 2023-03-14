package mac;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Image;

// A canvas that illustrates drawing on an Image
public class AboutUs extends Canvas {

private String imei;

public AboutUs(String IMEI){

        this.imei = IMEI;

    }


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
        for (int i = 0, x = xIncrement, y = 0; i < count; i++) {
            imageGraphics.setColor(0xC0 + ((128 + 10 * i) << 8) + ((128 + 10 * i) << 16));
            imageGraphics.drawLine(0, y, x, height);
            y += yIncrement;
            x += xIncrement;
        }

        // Add some text
        imageGraphics.setFont(Font.getFont(Font.FACE_PROPORTIONAL, 0,Font.SIZE_SMALL));
        imageGraphics.setColor(0xffff00);
        imageGraphics.drawString("Mobile Extension", width/2, 20, Graphics.TOP | Graphics.HCENTER);
        imageGraphics.drawString("Direct Ver 1.0", width/2, 35, Graphics.TOP | Graphics.HCENTER);
        imageGraphics.drawString(imei, width/2, 50, Graphics.TOP | Graphics.HCENTER);
        imageGraphics.setColor(0xffffff);
        imageGraphics.drawString("Mobil Delivery", width/2, 65, Graphics.TOP | Graphics.HCENTER);
        imageGraphics.drawString("Software Sweden AB", width/2, 80, Graphics.TOP | Graphics.HCENTER);

        imageGraphics.drawString("All Rights", width/2, 95, Graphics.TOP | Graphics.HCENTER);
          imageGraphics.drawString("Reserved © | 2006", width/2, 110, Graphics.TOP | Graphics.HCENTER);



        // Copy the Image to the screen
        g.drawImage(image, 0, 0, Graphics.TOP | Graphics.LEFT);

    }

}
