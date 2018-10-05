package jsnes;

final class vt extends afc {
   // $FF: synthetic field
   private adv a;

   private vt(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 5;
   }

   public final void a() {
      int var1 = adv.s(this.a);
      int var2 = adv.j(this.a, adv.m(this.a, var1));
      this.a.g();
      adv.i(this.a, var1, var2);
   }

   // $FF: synthetic method
   vt(adv var1) {
      this(var1, (byte)0);
   }
}
