package jsnes;

final class bo extends afc {
   // $FF: synthetic field
   private adv a;

   private bo(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 20;
   }

   public final void a() {
      adv.K(this.a, this.a.c & 255);
   }

   // $FF: synthetic method
   bo(adv var1) {
      this(var1, (byte)0);
   }
}
