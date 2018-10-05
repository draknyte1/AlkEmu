package jsnes;

final class um extends afc {
   // $FF: synthetic field
   private adv a;

   private um(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 5;
   }

   public final void a() {
      int var1 = adv.s(this.a);
      int var2 = adv.f(this.a, adv.e(this.a, var1));
      this.a.g();
      adv.d(this.a, var1, var2);
   }

   // $FF: synthetic method
   um(adv var1) {
      this(var1, (byte)0);
   }
}
