package jsnes;

final class bw extends afc {
   // $FF: synthetic field
   private adv a;

   private bw(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 18;
   }

   public final void a() {
      adv.A(this.a, adv.H(this.a));
   }

   // $FF: synthetic method
   bw(adv var1) {
      this(var1, (byte)0);
   }
}
