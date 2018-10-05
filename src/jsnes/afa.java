package jsnes;

final class afa extends afc {
   // $FF: synthetic field
   private adv a;

   private afa(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 15;
   }

   public final void a() {
      adv.y(this.a, this.a.d);
   }

   // $FF: synthetic method
   afa(adv var1) {
      this(var1, (byte)0);
   }
}
