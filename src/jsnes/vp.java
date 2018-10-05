package jsnes;

final class vp extends afc {
   // $FF: synthetic field
   private adv a;

   private vp(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 18;
   }

   public final void a() {
      adv.J(this.a, this.a.c & 255);
   }

   // $FF: synthetic method
   vp(adv var1) {
      this(var1, (byte)0);
   }
}
