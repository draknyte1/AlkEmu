package jsnes;

import java.util.Iterator;
import java.util.Properties;

final class xj extends Properties {
   final xj a;

   public xj() {
      this((xj)null);
   }

   public xj(xj var1) {
      super(var1);
      this.a = var1;
   }

   public final boolean a(String var1) {
      while(true) {
         String var2;
         if ((var2 = this.getProperty(var1)) == null) {
            if (this.a != null) {
               this = this.a;
               continue;
            }

            return false;
         }

         if (!(var2 = var2.toLowerCase()).equals("true") && !var2.equals("t") && !var2.equals("yes") && !var2.equals("y") && !var2.equals("1")) {
            return false;
         }

         return true;
      }
   }

   public final void a(String var1, boolean var2) {
      this.setProperty(var1, var2 ? "true" : "false");
   }

   public final int a(String var1) {
      String var2;
      while((var2 = this.getProperty(var1)) == null) {
         if (this.a == null) {
            return 0;
         }

         this = this.a;
      }

      return Integer.parseInt(var2);
   }

   public final void a(String var1, int var2) {
      this.setProperty(var1, Integer.toString(var2));
   }

   public final void a() {
      if (this.a != null) {
         this.a.a();
         Iterator var1 = this.stringPropertyNames().iterator();

         while(var1.hasNext()) {
            String var2 = (String)var1.next();
            String var3 = this.getProperty(var2);
            String var4 = this.a.getProperty(var2);
            if (var3 != null && var4 != null && var3.equals(var4)) {
               this.remove(var2);
            }
         }

      }
   }
}
