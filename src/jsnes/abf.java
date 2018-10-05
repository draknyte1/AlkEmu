package jsnes;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

final class abf implements Runnable {
   // $FF: synthetic field
   private hm a;

   abf(hm var1) {
      this.a = var1;
      super();
   }

   public final void run() {
      hm var1;
      (var1 = this.a).a = new JFrame("Palette view");
      var1.a.setDefaultCloseOperation(1);
      var1.a = new cg(var1.a.a);
      var1.a = new JScrollPane(var1.a);
      var1.a.add(var1.a);
      var1.a.pack();
      var1.a.setVisible(true);
   }
}
