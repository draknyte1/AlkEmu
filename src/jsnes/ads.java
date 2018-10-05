package jsnes;

final class ads extends afc {
   // $FF: synthetic field
   private adv a;

   private ads(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 14;
   }

   public final void a() {
      int var1 = adv.r(this.a);
      int var2 = adv.h(this.a, adv.d(this.a, var1));
      this.a.g();
      adv.c(this.a, var1, var2);
   }

   // $FF: synthetic method
   ads(adv var1) {
      this(var1, (byte)0);
   }
}
