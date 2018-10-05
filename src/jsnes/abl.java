package jsnes;

final class abl extends afc {
   // $FF: synthetic field
   private adv a;

   private abl(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 13;
   }

   public final void a() {
      adv.w(this.a, 0);
   }

   // $FF: synthetic method
   abl(adv var1) {
      this(var1, (byte)0);
   }
}
