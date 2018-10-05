package jsnes;

final class rn extends afc {
   // $FF: synthetic field
   private adv a;

   private rn(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 11;
   }

   public final void a() {
      adv.i(this.a, adv.c(this.a));
   }

   // $FF: synthetic method
   rn(adv var1) {
      this(var1, (byte)0);
   }
}
