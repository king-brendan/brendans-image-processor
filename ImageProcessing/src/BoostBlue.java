import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Boosts the blue levels in the image by a certain amount.
 */
public class BoostBlue extends AbstractEffect {
  BoostBlue(int factor) {
    super(factor);
  }

  @Override
  public Image convert(Image image) {
    return boost(0, 0, 0, this.factor, image);
  }
}
