package jsnes;

import java.awt.Color;
import javax.swing.table.AbstractTableModel;

final class zy extends AbstractTableModel {
   private xx a;
   int[] a = new int[256];
   int a = 8;

   public zy(xx var1) {
      this.a = var1;
      this.a();
   }

   public final Class getColumnClass(int var1) {
      return jv.class;
   }

   public final int getRowCount() {
      return (256 + this.a - 1) / this.a;
   }

   public final int getColumnCount() {
      return this.a + 1;
   }

   public final Object getValueAt(int var1, int var2) {
      jv var3 = new jv();
      if (var2 == 0) {
         var3.a = 0;
         var3.a = fv.a(var1 * this.a);
      } else {
         var1 = var1 * this.a + var2 - 1;
         int var4 = this.a[var1];
         var3.a = 1;
         var3.a = fv.a(var4, 4);
         var3.a = new Color(xx.a(var4));
      }

      return var3;
   }

   private void a() {
      for(int var1 = 0; var1 < 256; ++var1) {
         this.a[var1] = this.a(var1);
      }

   }

   final int a(int var1) {
      return this.a.d(var1 << 1) | this.a.d((var1 << 1) + 1) << 8;
   }
}
