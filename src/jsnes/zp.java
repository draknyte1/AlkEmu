package jsnes;

final class zp extends afc {
   // $FF: synthetic field
   private adv a;

   private zp(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = -2;
   }

   public final void a() {
      adv.e(this.a, this.a.d, adv.l(this.a));
   }

   // $FF: synthetic method
   zp(adv var1) {
      this(var1, (byte)0);
   }
}
