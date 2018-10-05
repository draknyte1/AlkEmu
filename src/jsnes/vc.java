package jsnes;

final class vc extends afc {
   // $FF: synthetic field
   private adv a;

   private vc(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 5;
   }

   public final void a() {
      adv.j(this.a, this.a.d, adv.D(this.a));
   }

   // $FF: synthetic method
   vc(adv var1) {
      this(var1, (byte)0);
   }
}
