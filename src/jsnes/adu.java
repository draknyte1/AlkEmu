package jsnes;

final class adu extends afc {
   // $FF: synthetic field
   private adv a;

   private adu(adv var1, byte var2) {
      this.a = var1;
      super();
   }

   public final void a() {
      this.a.d = true;
      this.a.g();
   }

   // $FF: synthetic method
   adu(adv var1) {
      this(var1, (byte)0);
   }
}
