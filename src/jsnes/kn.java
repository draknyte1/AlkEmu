package jsnes;

final class kn extends afg {
   // $FF: synthetic field
   private kt a;

   private kn(kt var1, byte var2) {
      this.a = var1;
      super();
      this.a = 5;
      this.b = 3;
   }

   public final void a() {
      int var1 = kt.s(this.a);
      int var2 = kt.b(this.a);
      kt.c(this.a, (var2 & 15) < (kt.c(this.a) & 15));
      var2 <<= 9;
      int var3 = 9;

      while(var3-- != 0) {
         if (((var1 = (var1 = var1 << 1 & 131071 | (var1 & 65536) >> 16) ^ var2 - var1 >>> 31) & 1) != 0) {
            var1 -= var2;
         }
      }

      kt.b(this.a, (var1 & 256) != 0);
      kt.c(this.a, (var1 & 130560) >> 9);
      kt.a(this.a, var1 & 255);
      kt.c(this.a, var1 & 255);
      kt.a(this.a, 12);
   }

   // $FF: synthetic method
   kn(kt var1) {
      this(var1, (byte)0);
   }
}
