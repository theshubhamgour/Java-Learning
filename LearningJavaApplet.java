import java.applet.Applet;
import java.awt.*;

public class LearningJavaApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Learning JAVA IS A FUN", 50, 50);
    }
}


/*
Html:

<html>
<head>
    <title>Learning Java Applet</title>
</head>
<body>
    <applet code="LearningJavaApplet.class" width="200" height="200"></applet>
</body>
</html>

*/
