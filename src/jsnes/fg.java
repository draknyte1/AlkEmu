package jsnes;

import java.io.FileWriter;

final class fg {
   private String a;
   private FileWriter a;
   private int a;
   private int b;

   public fg() {
      this("tracelog\\");
   }

   public fg(String var1) {
      this.a = var1;
      this.a = -1;
      this.a();
   }

   public final void a(String var1) {
      try {
         this.a.write(var1);
         this.a.write(fv.a);
      } catch (Throwable var2) {
         ;
      }

      if (++this.b == ow.a) {
         this.a();
      }

   }

   private void a() {
      try {
         if (this.a != null) {
            this.a.close();
            this.a = null;
         }

         ++this.a;
         this.a = new FileWriter(String.format("%s.%03d.log", this.a, this.a));
      } catch (Throwable var1) {
         ;
      }

      this.b = 0;
   }
}
