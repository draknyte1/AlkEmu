package jsnes;

final class abg extends afc {
   // $FF: synthetic field
   private adv a;

   private abg(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = -1;
   }

   public final void a() {
      adv.a(this.a, adv.l(this.a));
   }

   // $FF: synthetic method
   abg(adv var1) {
      this(var1, (byte)0);
   }
}
