import java.awt.*;
import java.io.IOException;

/**
 * Boosts the red levels in an image by a certain amount.
 */
public class BoostRed extends AbstractEffect {
  BoostRed(int factor) {
    super(factor);
  }

  @Override
  public Image convert(Image image) {
    return boost(0, this.factor, 0, 0, image);
  }
}
