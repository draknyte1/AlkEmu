package jsnes;

final class adg extends afc {
   // $FF: synthetic field
   private adv a;

   private adg(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 21;
   }

   public final void a() {
      adv.a(this.a);
   }

   // $FF: synthetic method
   adg(adv var1) {
      this(var1, (byte)0);
   }
}
