import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Represents an effect to be applied to an image that is dependent on a certain scale factor.
 */
public abstract class AbstractEffect implements ImageEffect {
  int factor;

  AbstractEffect(int factor) {
    this.factor = factor;
  }

  /**
   * Boosts the rgb values of an image by certain amounts.
   *
   * @param a1 the alpha boost value
   * @param r1 the red boost value
   * @param g1 the green boost value
   * @param b1 the blue boost value
   * @param image the image to be boosted
   * @return the rgb boosted image.
   */
  Image boost(int a1, int r1, int g1, int b1, Image image) {
    int width = image.getWidth(null);
    int height = image.getHeight(null);

    //get the alpha and rgb values for each pixel
    for (int x = 0; x < width; x++) {
      for (int y = 0; y < height; y++) {
        int p1 = ((BufferedImage) image).getRGB(x, y);
        // get alpha
        int a = (p1>>24) & 0xff;
        a = a + a1;

        // get red
        int r = (p1>>16) & 0xff;
        r = r + r1;

        // get green
        int g = (p1>>8) & 0xff;
        g = g + g1;

        // get blue
        int b = p1 & 0xff;
        b = b + b1;

        int p2 = (a<<24) | (r<<16) | (g<<8) | b;
        ((BufferedImage) image).setRGB(x, y, p2);
      }
    }

    return image;
  }
}
