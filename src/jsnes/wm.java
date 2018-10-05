package jsnes;

final class wm extends afc {
   // $FF: synthetic field
   private adv a;

   private wm(adv var1, byte var2) {
      this.a = var1;
      super();
   }

   public final void a() {
      this.a.i(this.a.d = this.a.d - 1 & 255);
      this.a.g();
   }

   // $FF: synthetic method
   wm(adv var1) {
      this(var1, (byte)0);
   }
}
