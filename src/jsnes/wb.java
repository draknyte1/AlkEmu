package jsnes;

final class wb extends afc {
   // $FF: synthetic field
   private adv a;

   private wb(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 19;
   }

   public final void a() {
      adv.A(this.a, adv.I(this.a));
   }

   // $FF: synthetic method
   wb(adv var1) {
      this(var1, (byte)0);
   }
}
