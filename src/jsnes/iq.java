package jsnes;

import java.io.File;
import javax.swing.filechooser.FileFilter;

final class iq extends FileFilter {
   public final boolean accept(File var1) {
      return true;
   }

   public final String getDescription() {
      return "Folders";
   }
}
