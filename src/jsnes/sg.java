package jsnes;

final class sg extends afc {
   // $FF: synthetic field
   private adv a;

   private sg(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 25;
   }

   public final void a() {
      adv.N(this.a, this.a.c & 255);
   }

   // $FF: synthetic method
   sg(adv var1) {
      this(var1, (byte)0);
   }
}
