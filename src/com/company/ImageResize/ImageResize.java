package ImageResize;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

public class ImageResize {

    public static void resize(InputStream input, Path target,
                               int width, int height) throws IOException {
        BufferedImage originalImage = ImageIO.read(input);
        Image newResizedImage = originalImage
                .getScaledInstance(width, height, Image.SCALE_DEFAULT);
        String s = target.getFileName().toString();
        String fileExtension = s.substring(s.lastIndexOf(".") + 1);
        ImageIO.write(convertToBufferedImage(newResizedImage),
                fileExtension, target.toFile());
    }

    private static BufferedImage convertToBufferedImage(Image img) {
        if (img instanceof BufferedImage) {
            return (BufferedImage) img;
        }

        BufferedImage resized = new BufferedImage(
                img.getWidth(null), img.getHeight(null),
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics2D = resized.createGraphics();
        graphics2D.drawImage(img, 0, 0, null);
        graphics2D.dispose();
        return resized;
    }
}
