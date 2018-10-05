package jsnes;

final class vb extends afc {
   // $FF: synthetic field
   private adv a;

   private vb(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 5;
   }

   public final void a() {
      adv.P(this.a, 0);
   }

   // $FF: synthetic method
   vb(adv var1) {
      this(var1, (byte)0);
   }
}
