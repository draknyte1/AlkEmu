package jsnes;

final class uu extends afc {
   // $FF: synthetic field
   private adv a;

   private uu(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 14;
   }

   public final void a() {
      int var1 = adv.r(this.a);
      int var2 = adv.o(this.a, adv.l(this.a, var1));
      this.a.g();
      adv.h(this.a, var1, var2);
   }

   // $FF: synthetic method
   uu(adv var1) {
      this(var1, (byte)0);
   }
}
