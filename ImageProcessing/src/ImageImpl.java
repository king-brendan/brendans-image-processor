import java.awt.*;
import javax.swing.JFrame;

import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.util.Scanner;

import javax.imageio.ImageIO;

/**
 * Initializes the image to be used and determines which effect to apply.
 */
public class ImageImpl extends Canvas {

  private static final long serialVersionUID = 1L;

  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    System.out.println("What is the file path of the image you would like to convert?");
    String imagePath = s.nextLine();
    System.out.println("What effect would you like to apply?\nOptions: BoostRed, BoostGreen, BoostBlue, ScaleResolution");
    String effect = s.nextLine();
    Image i = ImageImpl.initImage(imagePath, effect);
    ImageIO.write((RenderedImage) i, "jpg", new File("/users/brendan/Desktop/result.jpg"));
    System.out.println("Success!");

    // use this code instead of the block above to bypass the user input at program start and directly process a specific image with a specific effect.
    /*
    Image i = ImageImpl.initImage("/users/brendan/Desktop/Asset0020.jpg", "BoostBlue");
    ImageIO.write((RenderedImage) i, "jpg", new File("/users/brendan/Desktop/result.jpg"));
    System.out.println("Success!");
     */

  }

  /**
   * Loads the image to be used and applies the desired effect to it.
   *
   * @param imagePath the filepath of the image to be processed
   * @param effect the name of the effect to be applied
   * @return the processed image
   * @throws IOException if the effect name is invalid
   */
  private static Image initImage(String imagePath, String effect) throws IOException {
    Scanner s = new Scanner(System.in);
    ImageEffect e = null;

    if (effect.equals("BoostRed")) {
      System.out.println("Red boost amount:");
      String rb = s.nextLine();
      e = new BoostRed(Integer.parseInt(rb));
    } else if (effect.equals("BoostGreen")) {
      System.out.println("Green boost amount:");
      String gb = s.nextLine();
      e = new BoostGreen(Integer.parseInt(gb));
    } else if (effect.equals("BoostBlue")) {
      System.out.println("Blue boost amount:");
      String bb = s.nextLine();
      e = new BoostBlue(Integer.parseInt(bb));
    } else if (effect.equals("ScaleResolution")) {
      System.out.println("Resolution chunk size:");
      String cs = s.nextLine();
      e = new ScaleResolution(Integer.parseInt(cs));
    } else {
      throw new IllegalArgumentException("Effect name is invalid.");
    }

    File input_file = new File(imagePath);
    Image i = ImageIO.read(input_file);
    i = e.convert(i);
    return i;
  }
}

