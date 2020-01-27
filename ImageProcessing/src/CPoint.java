/**
 * Represents a single pixel in an image and its color.
 */
public class CPoint {
  int x;
  int y;
  int color;
  
  CPoint(int x, int y, int color) {
    this.x = x;
    this.y = y;
    this.color = color;
  }

  /**
   * Calculates to what chunk the CPoint belongs.
   *
   * @param hChunks the # of horizontal Chunks
   * @param vChunks the # of vertical Chunks
   * @return the chunk number of the CPoint's corresponding Chunk.
   */
  public int calcChunkNo(int hChunks, int vChunks) {
    int xdis = x / Chunk.ChunkSize;
    int ydis = y / Chunk.ChunkSize;
    return xdis + (ydis * (hChunks));
    
  }

}
