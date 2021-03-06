import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainClass extends JPanel {
    Game game = new Game();

    final int xDefine = 700;  //width
    final int yDefine = 700;  //height
    final int pixDem = 12; //20  - 12
    final int yField = 25; //15 - 25
    final int xField = 15; //9  - 15
    final int delay = 200; //ms
    final int UNFILLED = 0;
    final boolean sandMode = false;

    public void initGame() {
        game.setxDefine(xDefine);
        game.setyDefine(yDefine);
        game.setPixDem(pixDem);
        game.setyField(yField);
        game.setxField(xField);
        game.setDelay(delay);
        game.setUNFILLED(UNFILLED);
        game.createFrame();
        game.startGame();
    }

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.initGame();
    }
}
