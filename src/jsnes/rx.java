package jsnes;

final class rx extends afc {
   // $FF: synthetic field
   private adv a;

   private rx(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 14;
   }

   public final void a() {
      int var1 = adv.r(this.a);
      int var2 = adv.l(this.a, var1) - 1 & 255;
      this.a.i(var2);
      this.a.g();
      adv.h(this.a, var1, var2);
   }

   // $FF: synthetic method
   rx(adv var1) {
      this(var1, (byte)0);
   }
}
