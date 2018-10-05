package jsnes;

final class zq extends afc {
   // $FF: synthetic field
   private adv a;

   private zq(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 3;
   }

   public final void a() {
      int var1;
      if (((var1 = adv.u(this.a)) & 1) != 0) {
         this.a.c = true;
      }

      if ((var1 & 2) != 0) {
         this.a.b(true);
      }

      if ((var1 & 4) != 0) {
         this.a.d = true;
      }

      if ((var1 & 8) != 0) {
         this.a.e = true;
      }

      if ((var1 & 16) != 0) {
         this.a.f = true;
         this.a.d &= 255;
         this.a.e &= 255;
      }

      if ((var1 & 32) != 0) {
         this.a.g = true;
      }

      if ((var1 & 64) != 0) {
         this.a.h = true;
      }

      if ((var1 & 128) != 0) {
         this.a.c(true);
      }

      this.a.g();
      this.a.m();
   }

   // $FF: synthetic method
   zq(adv var1) {
      this(var1, (byte)0);
   }
}
