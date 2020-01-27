import java.awt.*;
import java.io.IOException;

/**
 * Boosts the green levels in an image by a certain amount.
 */
public class BoostGreen extends AbstractEffect {
  BoostGreen(int factor) {
    super(factor);
  }

  @Override
  public Image convert(Image image) {
    return boost(0, 0, this.factor, 0, image);
  }
}
