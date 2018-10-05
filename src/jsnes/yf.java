package jsnes;

final class yf extends afc {
   // $FF: synthetic field
   private adv a;

   private yf(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 3;
   }

   public final void a() {
      int var1;
      if (((var1 = adv.u(this.a)) & 1) != 0) {
         this.a.c = false;
      }

      if ((var1 & 2) != 0) {
         this.a.b(false);
      }

      if ((var1 & 4) != 0) {
         this.a.d = false;
      }

      if ((var1 & 8) != 0) {
         this.a.e = false;
      }

      if (!this.a.i) {
         if ((var1 & 16) != 0) {
            this.a.f = false;
         }

         if ((var1 & 32) != 0) {
            this.a.g = false;
         }
      }

      if ((var1 & 64) != 0) {
         this.a.h = false;
      }

      if ((var1 & 128) != 0) {
         this.a.c(false);
      }

      this.a.g();
      this.a.m();
   }

   // $FF: synthetic method
   yf(adv var1) {
      this(var1, (byte)0);
   }
}
