package jsnes;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

final class jo extends JComponent implements TableCellRenderer {
   private ba a;
   private Boolean a;
   private int a;
   private int b;
   private int c;
   // $FF: synthetic field
   private aco a;

   private jo(aco var1, byte var2) {
      this.a = var1;
      super();
   }

   public final Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      if (var2 instanceof ba) {
         this.a = (ba)var2;
      } else {
         this.a = new ba(1, var2.toString());
      }

      var3;
      this.a = var4;
      return this;
   }

   public final void paintComponent(Graphics var1) {
      Color var2;
      Color var3;
      switch(this.a.a) {
      case 0:
         var2 = this.a.a;
         var3 = this.a.b;
         break;
      case 1:
         var2 = this.a.c;
         var3 = this.a.d;
         break;
      default:
         var2 = this.a.e;
         var3 = this.a.f;
      }

      var1.setColor(var2);
      var1.fillRect(0, 0, this.getWidth(), this.getHeight());
      if (this.a.booleanValue()) {
         var1.setColor(this.a.getGridColor());
         var1.drawRect(0, 0, this.getWidth() - 1, this.getHeight() - 1);
      }

      if (this.a.a != "--" && this.a.a != "RR") {
         var1.setColor(var3);
      } else {
         var1.setColor(fv.a(var3, var2, 0.6F));
      }

      if (this.a.a.length() >= 2) {
         var1.drawString(this.a.a, this.a / 2, this.b);
      } else {
         var1.drawString(this.a.a, this.a, this.b);
      }
   }

   public final Dimension getPreferredSize() {
      return new Dimension((this.a / 2 << 1) + this.a * this.a.a.length(), this.c);
   }

   public final void setFont(Font var1) {
      super.setFont(var1);
      FontMetrics var2 = this.getFontMetrics(this.getFont());
      this.a = var2.charWidth('0');
      this.b = var2.getAscent();
      this.c = var2.getHeight();
   }

   public final void invalidate() {
   }

   public final void validate() {
   }

   public final void revalidate() {
   }

   public final void repaint(long var1, int var3, int var4, int var5, int var6) {
   }

   public final void repaint(Rectangle var1) {
   }

   public final void repaint() {
   }

   // $FF: synthetic method
   jo(aco var1) {
      this(var1, (byte)0);
   }
}
