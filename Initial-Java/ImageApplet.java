import java.applet.Applet;
import java.awt.*;

public class ImageApplet extends Applet {
    private Image image;

    public void init() {
        image = getImage(getCodeBase(), "image.png");
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, this);
    }
}
/*
Html:

<html>
<head>
    <title>Image Applet</title>
</head>
<body>
    <applet code="ImageApplet.class" width="200" height="200"></applet>
</body>
</html>
*/
