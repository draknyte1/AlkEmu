package jsnes;

import java.util.Vector;

public final class yk {
   public final int a = 10;
   final Vector a = new Vector();

   public final synchronized void a(String var1) {
      int var2;
      if ((var2 = this.a.indexOf(var1)) != -1) {
         this.a.remove(var2);
      } else if (this.a() == this.a) {
         this.a.removeElementAt(this.a - 1);
      }

      this.a.add(0, var1);
   }

   public final synchronized String a(int var1) {
      return var1 < this.a() ? (String)this.a.get(var1) : null;
   }

   public final synchronized int a() {
      return this.a.size();
   }

   public final synchronized void a() {
      this.a.clear();
   }

   public final synchronized String toString() {
      StringBuilder var1 = new StringBuilder();

      String var3;
      for(int var2 = 0; (var3 = this.a(var2)) != null; ++var2) {
         if (var1.length() != 0) {
            var1.append(", ");
         }

         var3 = var3.replace("%", "%25").replace("\"", "%22");
         var1.append('"').append(var3).append('"');
      }

      return var1.toString();
   }
}
