package jsnes;

final class aeu extends afc {
   // $FF: synthetic field
   private adv a;

   private aeu(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 14;
   }

   public final void a() {
      adv.r(this.a, this.a.e);
   }

   // $FF: synthetic method
   aeu(adv var1) {
      this(var1, (byte)0);
   }
}
