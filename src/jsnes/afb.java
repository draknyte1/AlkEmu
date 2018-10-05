package jsnes;

final class afb extends afc {
   // $FF: synthetic field
   private adv a;

   private afb(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 20;
   }

   public final void a() {
      adv.n(this.a, this.a.c);
   }

   // $FF: synthetic method
   afb(adv var1) {
      this(var1, (byte)0);
   }
}
