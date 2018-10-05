package jsnes;

final class rw extends afc {
   // $FF: synthetic field
   private adv a;

   private rw(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 20;
   }

   public final void a() {
      adv.i(this.a, adv.k(this.a));
   }

   // $FF: synthetic method
   rw(adv var1) {
      this(var1, (byte)0);
   }
}
