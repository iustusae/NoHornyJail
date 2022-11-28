package Imaging;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class WriteImageType {
  static public void CreateBackgroundImageFromColor() throws Exception {
    try {
      int width = 1920, height = 1080;

      // TYPE_INT_ARGB specifies the image format: 8-bit RGBA packed
      // into integer pixels
      BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
      Graphics2D ig2 = bi.createGraphics();
      Color color = new Color(255,93,123);
      ig2.setPaint(color);
      ig2.fill(new Rectangle(width, height));
      ImageIO.write(bi, "PNG", new File(System.getProperty("user.home") + "//Desktop//yourImageName.PNG"));
//      ImageIO.write(bi, "JPEG", new File(System.getProperty("user.home") +"//Desktop//yourImageName.JPG"));
//      ImageIO.write(bi, "gif", new File(System.getProperty("user.home") +"//Desktop//yourImageName.GIF"));
//      ImageIO.write(bi, "BMP", new File(System.getProperty("user.home") +"//Desktop//yourImageName.BMP"));
      
      
      
    } catch (IOException ie) {
      ie.printStackTrace();
    }

  }
}