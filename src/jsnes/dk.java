package jsnes;

import javax.swing.table.AbstractTableModel;

abstract class dk extends AbstractTableModel {
   private int d = 0;
   protected int a;
   int b = 16;
   private int e;
   private int f;
   int c;
   private int g;
   int[] a;
   boolean a = false;

   public abstract int a(int var1);

   public abstract int a();

   public final void a(int var1, int var2) {
      if (var1 != this.d || var2 != this.a) {
         if (var1 < 0) {
            var1 = 0;
         }

         if (var2 < var1) {
            var2 = var1;
         }

         if (var2 > this.a()) {
            var2 = this.a();
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.d = var1;
         this.a = var2;
         this.fireTableDataChanged();
      }

   }

   public final int b(int var1) {
      return this.d + var1 * this.b;
   }

   public Class getColumnClass(int var1) {
      return ba.class;
   }

   public int getRowCount() {
      return (this.a - this.d + this.b) / this.b;
   }

   public int getColumnCount() {
      return this.b + 2;
   }

   public Object getValueAt(int var1, int var2) {
      var1 = this.b(var1);
      if (var2 == 0) {
         return new ba(0, fv.a(var1, 6));
      } else if (var2 < this.b + 1) {
         var1 += var2 - 1;
         String var6 = (var2 = this.c(var1)) == -2 ? "RR" : (var2 == -1 ? "--" : fv.a(var2));
         return new ba(1, var6);
      } else {
         char[] var5 = new char[this.b];

         for(int var3 = 0; var3 < this.b; ++var3) {
            int var4 = this.c(var1 + var3);
            var5[var3] = var4 < 0 ? 0 : (char)var4;
         }

         return new ba(2, new String(var5));
      }
   }

   public final void b(int var1, int var2) {
      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > this.getRowCount() - 1) {
         var2 = this.getRowCount() - 1;
      }

      if (this.a == null || var1 != this.e || var2 != this.f) {
         this.a = false;
         if (var2 - var1 < 4096) {
            this.e = var1;
            this.f = var2;
            dk var3 = this;
            this.c = this.b(this.e);
            this.g = this.b(this.f) + 15;
            this.a = new int[this.g - this.c + 1];

            for(var2 = 0; var2 < var3.a.length; ++var2) {
               if (var3.c + var2 <= var3.a) {
                  var3.a[var2] = var3.a(var3.c + var2);
               } else {
                  var3.a[var2] = -1;
               }
            }

            this.a = true;
            return;
         }

         this.a = null;
      }

   }

   final int c(int var1) {
      try {
         return this.a[var1 - this.c];
      } catch (Exception var2) {
         if (var1 > this.a) {
            var1 = 0;
         }

         return this.a(var1);
      }
   }
}
