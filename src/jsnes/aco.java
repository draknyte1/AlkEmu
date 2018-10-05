package jsnes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

final class aco extends JTable {
   private dk a;
   private jo a = new jo(this);
   Color a = new Color(2117839);
   Color b = new Color(16777215);
   Color c = new Color(16777215);
   Color d = new Color(0);
   Color e = new Color(0);
   Color f = new Color(2162592);

   public aco() {
      this.setRowSelectionAllowed(false);
      this.setFont(new Font("Monospaced", 0, 14));
      this.setTableHeader((JTableHeader)null);
      this.setShowGrid(false);
      this.setIntercellSpacing(new Dimension(0, 0));
      this.setFillsViewportHeight(true);
      this.setAutoResizeMode(0);
      this.setDefaultRenderer(ba.class, this.a);
   }

   public final void setFont(Font var1) {
      super.setFont(var1);
      if (this.a != null) {
         this.a.setFont(var1);
         this.a();
      }
   }

   public final void setModel(TableModel var1) {
      if (var1 instanceof dk) {
         this.a = (dk)var1;
      } else {
         this.a = null;
      }

      super.setModel(var1);
      this.a();
   }

   public final void paintComponent(Graphics var1) {
      this.b();
      super.paintComponent(var1);
   }

   private void a() {
      if (this.a != null) {
         int var1 = 0;

         for(int var2 = 0; var2 < this.a.getColumnCount(); ++var2) {
            TableColumn var3 = this.getColumnModel().getColumn(var2);
            this.a.getTableCellRendererComponent(this, this.a.getValueAt(0, var2), false, false, 0, var2);
            int var4 = this.a.getPreferredSize().width;
            var1 += var4;
            var3.setPreferredWidth(var4);
         }

         this.setPreferredScrollableViewportSize(new Dimension(var1, 500));
         this.setRowHeight(this.a.getPreferredSize().height);
         this.b();
      }
   }

   private void b() {
      if (this.a != null) {
         Rectangle var2 = this.getVisibleRect();
         int var1 = this.rowAtPoint(new Point(0, var2.y));
         int var3 = this.rowAtPoint(new Point(0, var2.y + var2.height));
         if (var1 == -1) {
            var1 = 0;
         }

         if (var3 == -1) {
            var3 = this.getRowCount();
         }

         this.a.b(var1, var3);
      }
   }

   public final String getToolTipText(MouseEvent var1) {
      if (this.a == null) {
         return super.getToolTipText(var1);
      } else {
         Point var6 = var1.getPoint();
         int var2 = this.rowAtPoint(var6);
         int var7 = this.convertColumnIndexToModel(this.columnAtPoint(var6));
         dk var10000 = this.a;
         int var10001 = var2;
         var2 = var7;
         var7 = var10001;
         dk var4 = this.a;
         var7 = var10000.b(var7);
         if (var2 > 0 && var2 < var4.b + 1) {
            var7 += var2 - 1;
            int var5 = (var2 = var4.c(var7)) | var4.c(var7 + 1) << 8;
            char[] var3;
            (var3 = new char[1])[0] = (char)var2;
            String var8 = "<html><table><tr><td align=right><b>Address: </b></td><td>$" + fv.a(var7, 6) + "</td></tr>";
            if (var2 >= 0) {
               var8 = var8 + "<tr><td align=right><b>Hex: </b></td><td>" + fv.a(var2) + "</td></tr>" + "<tr><td align=right><b>Bin: </b></td><td>" + fv.b(var2) + "</td></tr>" + "<tr><td align=right><b>Unsigned: </b></td><td>" + var2 + "</td></tr>" + "<tr><td align=right><b>Signed: </b></td><td>" + (byte)var2 + "</td></tr>" + "<tr><td align=right><b>Word, unsigned: </b></td><td>" + var5 + "</td></tr>" + "<tr><td align=right><b>Word, signed: </b></td><td>" + (short)var5 + "</td></tr>" + "<tr><td align=right><b>Char: </b></td><td>" + new String(var3) + "</td></tr>";
            } else if (var2 == -1) {
               var8 = var8 + "<tr><td align=right><b>Value: </b></td><td>None (unmapped memory)</td></tr>";
            } else if (var2 == -2) {
               var8 = var8 + "<tr><td align=right><b>Value: </b></td><td>Unknown (registers)</td></tr>";
            }

            return var8 + "</table></html>";
         } else {
            return null;
         }
      }
   }
}
