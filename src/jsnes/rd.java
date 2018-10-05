package jsnes;

import java.awt.Font;
import java.awt.Insets;
import javax.swing.JFormattedTextField;

final class rd extends JFormattedTextField {
   int a;
   long a;

   public rd() {
      this(16);
   }

   public rd(int var1) {
      this.a(var1);
      this.a(0L);
      this.setMargin(new Insets(1, 4, 1, 4));
      this.setFont(new Font("Monospaced", 0, this.getFont().getSize() + 2));
      this.setHorizontalAlignment(4);
      this.setColumns((var1 + 3) / 4);
      this.setFocusLostBehavior(0);
   }

   public final void a(int var1) {
      if (var1 < 0) {
         var1 = 1;
      } else if (var1 > 64) {
         var1 = 64;
      }

      this.a = var1;
      this.a = 0L;

      do {
         --var1;
         this.a |= 1L << var1;
      } while(var1 > 0);

      this.setFormatterFactory(new ef(this));
   }

   public final long a() {
      return ((Long)this.getValue()).longValue();
   }

   public final void a(long var1) {
      this.setValue(var1);
   }
}
