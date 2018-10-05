package jsnes;

import java.awt.Color;
import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

final class et extends DefaultTableCellRenderer {
   private jv a;
   private Boolean a;
   // $FF: synthetic field
   private cg a;

   private et(cg var1, byte var2) {
      this.a = var1;
      super();
   }

   public final Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      if (var2 instanceof jv) {
         this.a = (jv)var2;
      } else {
         this.a = new jv();
         this.a.a = 0;
         this.a.a = var2.toString();
      }

      var3;
      this.a = var4;
      return super.getTableCellRendererComponent(var1, var2, var3, var4, var5, var6);
   }

   public final void paintComponent(Graphics var1) {
      Color var2;
      Color var3;
      switch(this.a.a) {
      case 1:
         var2 = this.a.a;
         var3 = fv.a(this.a.a, fv.a(this.a.a), 0.96F);
         break;
      default:
         var2 = Color.WHITE;
         var3 = Color.BLACK;
      }

      var1.setColor(var2);
      var1.fillRect(0, 0, this.getWidth(), this.getHeight());
      if (this.a.booleanValue()) {
         var1.setColor(this.a.getGridColor());
         var1.drawRect(0, 0, this.getWidth() - 1, this.getHeight() - 1);
      }

      var1.setColor(var3);
      FontMetrics var4 = var1.getFontMetrics();
      var1.drawString(this.a.a, (this.getWidth() - var4.stringWidth(this.a.a)) / 2, var4.getAscent());
   }

   // $FF: synthetic method
   et(cg var1) {
      this(var1, (byte)0);
   }
}
