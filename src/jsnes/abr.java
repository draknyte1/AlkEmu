package jsnes;

final class abr extends afc {
   // $FF: synthetic field
   private adv a;

   private abr(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 6;
   }

   public final void a() {
      int var1 = adv.p(this.a);
      int var2 = adv.f(this.a, adv.a(this.a, var1));
      this.a.g();
      adv.a(this.a, var1, var2);
   }

   // $FF: synthetic method
   abr(adv var1) {
      this(var1, (byte)0);
   }
}
