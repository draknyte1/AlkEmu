package jsnes;

final class afn extends afc {
   // $FF: synthetic field
   private adv a;

   private afn(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 17;
   }

   public final void a() {
      adv.A(this.a, adv.G(this.a));
   }

   // $FF: synthetic method
   afn(adv var1) {
      this(var1, (byte)0);
   }
}
