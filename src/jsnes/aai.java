package jsnes;

final class aai extends afc {
   // $FF: synthetic field
   private adv a;

   private aai(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 5;
   }

   public final void a() {
      adv.e(this.a, this.a.e, adv.b(this.a));
   }

   // $FF: synthetic method
   aai(adv var1) {
      this(var1, (byte)0);
   }
}
