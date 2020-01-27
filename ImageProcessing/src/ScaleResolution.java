import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

/**
 * scales the resolution of an image by a certain amount.
 */
public class ScaleResolution extends AbstractEffect {
  ScaleResolution(int factor) {
    super(factor);
  }

  //TODO finish the ScaleResolution implementation of convert
  @Override
  public Image convert(Image image) {
    /*

    //get image width and height
    int width = image.getWidth(null);
    int height = image.getHeight(null);


    int horizontalChunks = width / Chunk.ChunkSize;
    int verticalChunks = height / Chunk.ChunkSize;

    ArrayList<Chunk> chunks = new ArrayList<Chunk>();

    int a1 = 0;
    int r1 = 0;
    int g1 = 0;
    int b1 = 0;


    //populate the points HashMap
    for (int x = 0; x < width; x++) {
      for (int y = 0; y < height; y++) {
        Posn loc = new Posn(x, y);
        int p = ((BufferedImage) image).getRGB(x, y);
        points.put(loc, p);
      }
    }


    //initialize chunks list
    for (int i = 0; i < (horizontalChunks * verticalChunks); i++) {
      Chunk newChunk = new Chunk();
      chunks.add(newChunk);
    }

    //add all points to their proper Chunk
    for (int x = 0; x < width; x++) {
      for (int y = 0; y < height; y++) {
        CPoint p = new CPoint(x, y, ((BufferedImage) image).getRGB(x, y));
        int chunkNo = p.calcChunkNo(horizontalChunks, verticalChunks);
        chunks.get(chunkNo).addCPoint(p);
      }
    }

    //calculate each chunk's color
    for (Chunk c : chunks) {
      c.calcChunkColor();
    }

    //assign each point to its chunk's color
    for (int x = 0; x < width; x++) {
      for (int y = 0; y < height; y++) {
        CPoint p = new CPoint(x, y, ((BufferedImage) image).getRGB(x, y));
        int chunkNo = p.calcChunkNo(horizontalChunks, verticalChunks);
        ((BufferedImage) image).setRGB(x, y, chunks.get(chunkNo).chunkColor);
      }
    }



    //alter the image
    for (int x = 0; x < width; x++) {
      for (int y = 0; y < height; y++) {
        Posn loc = new Posn(x, y);
        int p = ((BufferedImage) image).getRGB(x, y);
        // get alpha
        int a = (p>>24) & 0xff;
        a1 = a1 + a;

        // get red
        int r = (p>>16) & 0xff;
        r1 = r1 + r;

        // get green
        int g = (p>>8) & 0xff;
        g1 = g1 + g;

        // get blue
        int b = p & 0xff;
        b1 = b1 + b;
      }
    }


    a1 = a1 / (width * height);
    r1 = r1 / (width * height);
    g1 = g1 / (width * height);
    b1 = b1 / (width * height);

    //averages every color in the whole image
    for (int x = 0; x < width; x++) {
      for (int y = 0; y < height; y++) {
        int p = (a1<<24) | (r1<<16) | (g1<<8) | b1;
        ((BufferedImage) image).setRGB(x, y, p);
      }
    }

    return image;

    */

    return null;
  }
}
