package jsnes;

final class jq extends vd {
   private int a;
   private int b;
   private boolean a;
   private int c;
   private int d;

   public final synchronized void a(boolean var1) {
      if (!this.a && var1) {
         this.c = this.a;
         this.a = this.b;
         this.d = 32768;
      }

      this.a = var1;
   }

   public final synchronized int a() {
      int var1;
      if (this.d != 0) {
         var1 = (this.c & this.d) != 0 ? 1 : 0;
         this.d >>= 1;
      } else {
         var1 = 1;
      }

      return var1;
   }

   public final synchronized void a(int var1) {
      int var2 = this.b | var1 & '\ufff0';
      if (!ow.b) {
         if ((var1 & 2048) != 0) {
            var2 &= -1025;
         }

         if ((var1 & 1024) != 0) {
            var2 &= -2049;
         }

         if ((var1 & 512) != 0) {
            var2 &= -257;
         }

         if ((var1 & 256) != 0) {
            var2 &= -513;
         }
      }

      this.b |= var2;
      this.a |= var2;
   }

   public final synchronized void b(int var1) {
      this.b &= ~var1;
   }
}
