package jsnes;

final class bm extends afc {
   // $FF: synthetic field
   private adv a;

   private bm(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 20;
   }

   public final void a() {
      adv.A(this.a, adv.M(this.a));
   }

   // $FF: synthetic method
   bm(adv var1) {
      this(var1, (byte)0);
   }
}
