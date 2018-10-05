package jsnes;

final class gx extends afc {
   // $FF: synthetic field
   private adv a;

   private gx(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 17;
   }

   public final void a() {
      adv.C(this.a, adv.G(this.a));
   }

   // $FF: synthetic method
   gx(adv var1) {
      this(var1, (byte)0);
   }
}
