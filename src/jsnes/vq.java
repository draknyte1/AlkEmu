package jsnes;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

final class vq implements Runnable {
   // $FF: synthetic field
   private afl a;

   vq(afl var1) {
      this.a = var1;
      super();
   }

   public final void run() {
      afl var1;
      (var1 = this.a).a = new JFrame("Sprite table view");
      var1.a.setDefaultCloseOperation(2);
      var1.a.setLayout(new BoxLayout(var1.a.getContentPane(), 3));
      var1.a.add(new yu(var1.a.a.a(0)));
      var1.a.add(new yu(var1.a.a.a(1)));
      var1.a.pack();
      var1.a.setVisible(true);
   }
}
