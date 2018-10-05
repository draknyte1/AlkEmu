package jsnes;

import java.awt.GraphicsEnvironment;
import javax.swing.JApplet;

public class Main extends JApplet {
   public static void main(String[] var0) {
      if (GraphicsEnvironment.isHeadless()) {
         System.out.println("Sorry, JSNES cannot run because Java does not have access to a graphics environment.");
         System.exit(1);
      }

      new bi(var0, (byte)0);
   }

   public void init() {
   }

   public void start() {
   }

   public void stop() {
   }

   public void destroy() {
   }

   public String getAppletInfo() {
      return "JSNES version 0.01-alpha.";
   }

   public String[][] getParameterInfo() {
      return new String[][]{{"file", "url", "Path and/or filename of the game to load. Relative URLs are relative to the directory containing jsnes.jar."}};
   }
}
