import java.awt.*;
import javax.swing.JFrame;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Chunk {
  public static int ChunkSize = 100;
  ArrayList<CPoint> points;
  int chunkColor;
  
  Chunk() {
    this.points = new ArrayList<CPoint>(ChunkSize * ChunkSize);
    this.chunkColor = 0;
  }

  public void addCPoint(CPoint p) {
    points.add(p);
  }

  public void calcChunkColor() {
    int sum = 0;
    for (CPoint p : points) {
      sum = p.color + sum;
    }
    chunkColor = sum / (ChunkSize * ChunkSize);
  }
  
}
