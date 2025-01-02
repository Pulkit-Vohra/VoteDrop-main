import javax.swing.*;
import java.awt.*;
import java.io.InputStream;
import java.net.URL;
import javax.imageio.ImageIO;

public class ImagePanel extends JPanel {
    private Image backgroundImage;

    public ImagePanel(String imagePath) {
        setLayout(null);
        loadImage(imagePath);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }

    public void setBackgroundImage(String imagePath) {
        loadImage(imagePath);
        repaint();
    }

    private void loadImage(String imagePath) {
        try (InputStream is = getClass().getClassLoader().getResourceAsStream(imagePath)) {
            if (is != null) {
                this.backgroundImage = ImageIO.read(is);
            } else {
                System.out.println("Image not found: " + imagePath);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
