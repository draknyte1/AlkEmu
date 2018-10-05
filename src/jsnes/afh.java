package jsnes;

final class afh extends afc {
   // $FF: synthetic field
   private adv a;

   private afh(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 13;
   }

   public final void a() {
      adv.T(this.a, this.a.c & 255);
   }

   // $FF: synthetic method
   afh(adv var1) {
      this(var1, (byte)0);
   }
}
