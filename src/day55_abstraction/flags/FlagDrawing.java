package day55_abstraction.flags;

import java.awt.*;

public class FlagDrawing {
    public static void main(String[] args) {
      RussianFlag russianFlag = new RussianFlag();
      russianFlag.draw();

      UkrainFlag ukrainFlag = new UkrainFlag();
      ukrainFlag.draw();

    }
}
