import edu.princeton.cs.algs4.Picture;
import edu.princeton.cs.algs4.StdOut;

/**
 * Dependencies: SeamCarver.java
 *
 * Reads an image from a file, prints energy of each pixel as calculated by
 * the SeamCarver object.
 */
public class PrintEnergy {
  public static void main(String[] args) {
    final String fileName = "07_seam/test/chameleon.png";  // input test file
    Picture picture = new Picture(fileName);

    StdOut.printf("image is %d pixels wide by %d pixels high.\n", picture.width(), picture.height());
    SeamCarver sc = new SeamCarver(picture);
    StdOut.printf("Printing energy calculated for each pixel.\n");

    for (int row = 0; row < sc.height(); row++) {
      for (int col = 0; col < sc.width(); col++)
        StdOut.printf("%9.0f ", sc.energy(col, row));
      StdOut.println();
    }
  }
}