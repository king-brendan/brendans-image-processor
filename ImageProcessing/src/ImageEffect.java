import java.awt.*;
import java.io.IOException;

/**
 * Represents an effect to be applied to an image.
 */
public interface ImageEffect {
  /**
   * Applies the effect to a given image.
   *
   * @param image the image to be processed
   * @return the processed image
   */
  public Image convert(Image image);
}
