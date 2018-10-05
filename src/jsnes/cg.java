package jsnes;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

final class cg extends JTable {
   zy a;
   private et a;

   public cg(xx var1) {
      this.setRowSelectionAllowed(false);
      this.setTableHeader((JTableHeader)null);
      this.setIntercellSpacing(new Dimension(0, 0));
      this.setFillsViewportHeight(true);
      this.setModel(this.a = new zy(var1));
      this.a = new et(this);
      this.setDefaultRenderer(jv.class, this.a);
      this.setFont(this.getFont());
   }

   public final void setFont(Font var1) {
      super.setFont(var1);
      if (this.a != null) {
         this.a.setFont(var1);
         cg var4;
         if ((var4 = this).a != null) {
            for(int var5 = 0; var5 < var4.a.getColumnCount(); ++var5) {
               TableColumn var2 = var4.getColumnModel().getColumn(var5);
               var4.a.getTableCellRendererComponent(var4, var4.a.getValueAt(0, var5), false, false, 0, var5);
               int var3 = var4.a.getPreferredSize().width;
               var2.setPreferredWidth(var3);
            }

            var4.setRowHeight(var4.a.getPreferredSize().height);
         }

      }
   }

   public final String getToolTipText(MouseEvent var1) {
      if (this.a == null) {
         return super.getToolTipText(var1);
      } else {
         Point var5 = var1.getPoint();
         int var2 = this.rowAtPoint(var5);
         int var6 = this.convertColumnIndexToModel(this.columnAtPoint(var5));
         int var10001 = var2;
         var2 = var6;
         var6 = var10001;
         zy var3 = this.a;
         if (var2 > 0) {
            var6 = var6 * var3.a + var2 - 1;
            int var4 = var3.a[var6];
            return "<html><table><tr><td align=right><b>Index: </b></td><td>$" + fv.a(var6) + " (" + var6 + ")</td></tr>" + "<tr><td align=right><b>SNES: </b></td><td>$" + fv.a(var4, 4) + "</td></tr>" + "<tr><td align=right><b>RGB: </b></td><td>$" + fv.a(xx.a(var4), 6) + "</td></tr>" + "</table></html>";
         } else {
            return null;
         }
      }
   }
}
